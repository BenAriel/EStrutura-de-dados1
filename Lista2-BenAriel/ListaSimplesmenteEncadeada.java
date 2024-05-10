

import InterfacesAndExcecao.Excecao;
import InterfacesAndExcecao.InterfaceList;

public class ListaSimplesmenteEncadeada<T> implements  InterfaceList<T> {


    public class Node{
        private T dado;
        private Node next;

        public Node(T dado)
        {
            this.dado = dado;
            this.next= null;
        }
    }

    private int size;
    private Node head;
    private Node tail;

    public ListaSimplesmenteEncadeada()
    {
        this.size=0;
        this.head=null;
        this.tail=null;
    }

    @Override
    public void addFirst(T value) {
        Node novo = new Node(value);
        if(head==null)
        {
            head=novo;
            tail=novo;
        }
        else{
            novo.next=head;
            head=novo;
        }
        size++;
    }

    @Override
    public void addLast(T value) {
        Node novo = new Node(value);
        if(tail==null)
        {
            head=novo;
            tail=novo;
        }
        else{
            tail.next=novo;
            tail=novo;
        }
        size++;
    }

    private Node searchNode(T criterio)
	{
	    Node p = head;	

	    while( p != null )
	    {
	    	
	        if( p.dado.equals(criterio) ) {
	        	System.out.println();
	            return p;
	        }
	        p = p.next;
	    }
	    
	    return null;
	}
    @Override
    public T search(T crit) {
        Node p = searchNode(crit);
        if(p==null)
        return null;
        else
        return p.dado;
    }

    @Override
    public boolean addAfter(T dado, T crit) {
        Node p = searchNode(crit);

        if(p==null)
        return false;

        Node novo = new Node(dado);
        if(p==tail)
        {
            addLast(novo.dado);
        }
        else{
            novo.next = p.next;
            p.next = novo;
        }

        size++;
        return true;
        


    }

    @Override
    public T peekFirst() throws Excecao {
       if(head==null)
       throw new Excecao("Lista vazia");

       T retorno = head.dado;
       return retorno;
    }

    @Override
    public T peekLast() throws Excecao {
        if(head==null)
        throw new Excecao("Lista vazia");
 
        T retorno = tail.dado;
        return retorno;
    }

    @Override
    public T removeFirst() throws Excecao {
        if(head==null)
        throw new Excecao("Lista está vazia");
        T retorno = head.dado;
        if(head==tail)
        {
            tail=null;
            head=null;
        }
        else
        {
            Node p= head;
            head=head.next;
            p.next=null;
        }
        size--;
        return retorno;

    }

    @Override
    public T removeLast() throws Excecao {
        if(tail==null)
        throw new Excecao("Lista está vazia");

        T retorno = tail.dado;
        if(head==tail)
        {
            tail=null;
            head=null;
        }
        else
        {
            Node p= head;
            while(p.next.next != null)
            {
                p=p.next;
            }
            tail=p;
            tail.next=null;
        }
        size--;
        return retorno;
    }

    @Override
    public T remove(T crit) throws Excecao {
        if(head==null)
        throw new Excecao("Lista vazia");

        Node p = searchNode(crit);
        if(p==head)
        return removeFirst();
        else if(p==tail)
        return removeLast();

        else
        {
            T retorno = p.dado;
            Node p2= head;

            while (p2.next != p )
            {
                p2=p2.next;
            }
            p2.next = p.next;
            p.next = null;
            size--;
            return retorno;
        }
    }

    @Override
    public void show() throws Excecao {
        if(head == null)
        throw new Excecao("Lista vazia");

        Node p = head;
        while(p!=null)
        {
            System.out.println(p.dado + " ");
            p=p.next;
        }
    }

    @Override
    public void showReverse() throws Excecao {
        if(head== null)
        throw new Excecao("Lista vazia");

        Node p = head;
       ListaSimplesmenteEncadeada<T> listaInterna = new ListaSimplesmenteEncadeada<>();
       while(p!=null)
       {
        listaInterna.addFirst(p.dado);
        p=p.next;
       }
       listaInterna.show();

    }

     public boolean isEmpty()
     {
        return size==0;
     }

     public int getSize()
     {
        return this.size;
     }
    

     public static void main(String[] args) throws Excecao {
        ListaSimplesmenteEncadeada<Integer> l = new ListaSimplesmenteEncadeada<>();
        l.addFirst(1);
        l.addLast(3);
        l.addAfter(2, 1);
        l.getSize();
        l.show();
        l.showReverse();
        l.remove(2);
        l.show();
        l.removeLast();
        l.show();
        l.removeFirst();
        l.removeLast();
     }
     
    
}
