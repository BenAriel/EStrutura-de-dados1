import InterfacesAndExcecao.Excecao;

public class Pilha <T>
{
    private int topo;
    private T[] pilha;
    private int size;
    public Pilha(int tam)
    {
        this.size = tam;
        topo = -1;
        pilha = (T[]) new Object[size];
        
    }
    public boolean isEmpty()
    {
        if(topo == -1)
        return true;
        else
        return false;
    }
    public boolean isFull()
    {
        if(size==topo+1)
        return true;
        else
        return false;
    }
    public void push(T elemento) throws Excecao
    {
        if(isFull())
        {
             throw new Excecao("a pilha está cheia");
        }
        else
        {
        topo++;
        pilha[topo] = elemento;
        }

    }
    public T pop() throws Excecao
    {
        if(isEmpty())
        throw new Excecao("a pilha está vazia");
        else
        {
            T retorno = pilha[topo];
            topo--;
            return retorno;
        }
    }
    public int getSize() throws Excecao {
        if(isEmpty())
        throw new Excecao("a pilha está vazia");
        else
        return topo+1;
    }
    public T peek()  throws Excecao {
        if(isEmpty())
        throw new Excecao("a pilha está vazia");
        else
        {
        T retorno = pilha[topo];
        return retorno;
        }
    }


    public static void main(String[] args) throws Excecao {
        Pilha<Integer> p = new Pilha<Integer>(5);
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);
        int x = p.peek();
        System.out.println(x);
        x= p.getSize();
        System.out.println(x);
         x = p.pop();
        System.out.println(x);
        x= p.getSize();
        System.out.println(x);
    }
    

}
