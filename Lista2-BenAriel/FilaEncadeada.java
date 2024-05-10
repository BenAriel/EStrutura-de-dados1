import InterfacesAndExcecao.Excecao;
import InterfacesAndExcecao.InterfaceFila;
import InterfacesAndExcecao.InterfaceList;

public class FilaEncadeada<T> implements InterfaceFila<T> {

    private InterfaceList<T> fila;

    public FilaEncadeada()
    {
        this.fila = new ListaDuplamenteEncadeada<>();
    }

    @Override
    public void add(T element) throws Excecao {
       fila.addLast(element);
    }

    @Override
    public T remove() throws Excecao {
       return fila.removeFirst();
    }

    @Override
    public T peek() throws Excecao {
      return fila.peekFirst();
    }

    @Override
    public boolean isEmpty() throws Excecao {
       return fila.isEmpty();
    }

    @Override
    public void show() throws Excecao {
       fila.show();
    }

    public int getSize()
    {
        return fila.getSize();
    }

    public static void main(String[] args) throws Excecao {
        FilaEncadeada<Double> f = new FilaEncadeada<>();
        f.add(1.1);
        f.add(2.2);
        f.add(3.3);
        f.show();
        System.out.println(f.peek());
        f.remove();
        f.show();
    }
    
}
