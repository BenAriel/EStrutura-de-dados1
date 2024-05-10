import InterfacesAndExcecao.Excecao;

public class Fila<T> {
    private int tras;
    private int frente;
    private T[] fila;
    private int size;
    private int tamanhoatual;

    public Fila(int tam) {
        this.size = tam;
        this.tamanhoatual = 0;
        this.frente = 0;
        this.tras = -1;
        this.fila = (T[]) new Object[size];
    }

    public boolean isEmpty() {
        return tamanhoatual == 0;
    }

    public boolean isFull() {
        return tamanhoatual == size;
    }

    public void add(T elemento) throws Excecao {
        if (isFull())
            throw new Excecao("A fila está cheia");
        
        tras = (tras + 1) % size;
        fila[tras] = elemento;
        tamanhoatual++;
    }

    public T remove() throws Excecao {
        if (isEmpty())
            throw new Excecao("A fila está vazia");
        
        T elementoRemovido = fila[frente];
        fila[frente] = null; // deixa "em branco" aquele espaço.
        frente = (frente + 1) % size;
        tamanhoatual--;
        return elementoRemovido;
    }

    public T peek() throws Excecao {
        if (isEmpty())
            throw new Excecao("A fila está vazia");
        
        return fila[frente];
    }
    public void show() throws Excecao{
        if (isEmpty()) {
            throw new Excecao("A fila está vazia");
        }
    
        System.out.print("Fila: ");
        int index = frente;
        for (int i = 0; i < tamanhoatual; i++) {
            System.out.print(fila[index] + " ");
            index = (index + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) throws Excecao{
        Fila<String> f = new Fila<>(5);
        f.add("alguem");
        f.add("me");
        f.add("salva");
        f.add("por");
        f.add("favor");
        String r = f.remove();
        System.out.println(r);
        r= f.peek();
        System.out.println(r);
        f.show();

    }
}
