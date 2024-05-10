import InterfacesAndExcecao.Excecao;
import InterfacesAndExcecao.InterfaceList;
import InterfacesAndExcecao.InterfacePilha;

public class PilhaEncadeada<T> implements InterfacePilha<T> {

    private InterfaceList <T> pilha;

    public PilhaEncadeada()
    {
        this.pilha = new ListaDuplamenteEncadeada<>();
    }

    @Override
    public void push(T element) throws Excecao {
      pilha.addLast(element);
    }

    @Override
    public T pop() throws Excecao {
      return pilha.removeLast();
    }

    @Override
    public T peek() throws Excecao {
       return pilha.peekLast();
    }

    @Override
    public boolean isEmpty() {
      return pilha.isEmpty();
    }

    @Override
    public void show() throws Excecao {
        pilha.showReverse();
    }

    public int getSize()
    {
        return pilha.getSize();
    }

    public static void main(String[] args) throws Excecao {
        PilhaEncadeada<Integer> p = new PilhaEncadeada<>();
        p.push(5);
        p.push(10);
        p.show();
        p.pop();
        System.out.println(p.peek());
    }
}