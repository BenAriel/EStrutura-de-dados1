import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int opCRUDE;
        Generica2 [] vetor = new Generica2[100];
        int i = 0;
        do {
            System.out.println("digite : \n  1 - classe pessoas \n  2 - classe produto \n qualquer outra - sair");
            op = sc.nextInt();
            if (op == 1) {

                System.out.println(
                        "digite : \n  1 - cadastrar pessoa \n  2 - deletar pessoa \n 3 - atualizar pessoa \n 4- mostrar pessoa");
                opCRUDE = sc.nextInt();
                if (opCRUDE == 1) {
                    System.out.println("digite o nome da pessoa:");
                    String nome = sc.next();
                    System.out.println("digite a idade da pessoa:");
                    int idade = sc.nextInt();
                    Pessoa2 p = new Pessoa2(nome, idade);
                    Generica2<Pessoa2> g = new Generica2<Pessoa2>(p);
                    vetor[i] = g;
                    i++;
                } else if (opCRUDE == 2) {
                    boolean achou = false;
                    System.out.println("digite o nome da pessoa:");
                    String nome = sc.next();
                    for (int j = 0; j < i; j++) {
                        if (((Pessoa2) vetor[j].getObj()).getNome().equals(nome)) {
                            System.out.println(nome + " foi deletada");
                            vetor[j] = null;
                            i--;
                            achou = true;
                        }
                    }

                    if (achou == false) {
                        System.out.println("pessoa não encontrada");
                    }

                } else if (opCRUDE == 3) {
                    boolean achou = false;
                    System.out.println("digite o nome da pessoa:");
                    String nome = sc.next();
                    for (int j = 0; j < i; j++) {
                        if (((Pessoa2) vetor[j].getObj()).getNome().equals(nome)) {
                            System.out.println("digite o novo nome da pessoa:");
                            String nome2 = sc.next();
                            System.out.println("digite a nova idade da pessoa:");
                            int idade = sc.nextInt();
                            Pessoa2 p = new Pessoa2(nome2, idade);
                            Generica2<Pessoa2> g = new Generica2<Pessoa2>(p);
                            vetor[j] = g;
                            achou = true;
                        }
                    }
                    if (achou == false) {
                        System.out.println("pessoa não encontrada");
                    }
                } else if (opCRUDE == 4) {
                    boolean achou = false;
                    System.out.println("digite o nome da pessoa:");
                    String nome = sc.next();
                    for (int j = 0; j < i; j++) {
                        if (((Pessoa2) vetor[j].getObj()).getNome().equals(nome)) {
                            System.out.println(vetor[j]);
                            achou = true;
                        }
                    }
                    if (achou == false) {
                        System.out.println("pessoa não encontrada");
                    }
                }
                else
                {
                    System.out.println("opção inválida,voltando pro começo...");
                }
            }

            else if (op == 2) {

                System.out.println(
                        "digite : \n  1 - cadastrar produto \n  2 - deletar produto \n 3 - atualizar produto \n 4- mostrar produto");
                opCRUDE = sc.nextInt();
                if (opCRUDE == 1) {
                    System.out.println("digite o nome do produto:");
                    String nome = sc.next();
                    System.out.println("digite o preço do produto:");
                    Double preco = sc.nextDouble();
                    Produto p = new Produto(nome, preco);
                    Generica2<Produto> g = new Generica2<Produto>(p);
                    vetor[i] = g;
                    i++;
                } else if (opCRUDE == 2) {
                    boolean achou = false;
                    System.out.println("digite o nome do produto:");
                    String nome = sc.next();
                    for (int j = 0; j < i; j++) {
                        if (((Produto) vetor[j].getObj()).getNome().equals(nome)) {
                            System.out.println(nome + " foi deletado");
                            vetor[j] = null;
                            i--;
                            achou = true;
                        }
                    }

                    if (achou == false) {
                        System.out.println("produto não encontrado");
                    }

                } else if (opCRUDE == 3) {
                    boolean achou = false;
                    System.out.println("digite o nome do produto:");
                    String nome = sc.next();
                    for (int j = 0; j < i; j++) {
                        if (((Produto) vetor[j].getObj()).getNome().equals(nome)) {
                            System.out.println("digite o novo nome do produto:");
                            String nome2 = sc.next();
                            System.out.println("digite o novo preço do produto:");
                            Double preco = sc.nextDouble();
                            Produto p = new Produto(nome2, preco);
                            Generica2<Produto> g = new Generica2<Produto>(p);
                            vetor[j] = g;
                            achou = true;
                        }
                    }
                    if (achou == false) {
                        System.out.println("produto não encontrado");
                    }
                } else if (opCRUDE == 4) {
                    boolean achou = false;
                    System.out.println("digite o nome do produto:");
                    String nome = sc.next();
                    for (int j = 0; j < i; j++) {
                        if (((Produto) vetor[j].getObj()).getNome().equals(nome)) {
                            System.out.println(vetor[j]);
                            achou = true;
                        }
                    }
                    if (achou == false) {
                        System.out.println("produto não encontrado");
                    }
                }
                else
                {
                    System.out.println("opção inválida,voltando pro começo...");
                }
            } else {
                System.out.println("saindo...");
            }
        } while (op == 1 || op == 2);

        System.out.println("mostrando pessaos e produtos cadastrados:");
        for (int j = 0; j < i; j++) {
            System.out.println(vetor[j]);
        }

    }
}

class Pessoa2 {
    private String nome; 
    private int idade;

    public Pessoa2(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return ("nome: " + getNome() + "\nidade: " + getIdade());
    }
}

class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        setNome(nome);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return ("nome: " + getNome() + "\npreço: " + getPreco());
    }
}

class Generica2<T> {
    private T obj;

    public Generica2(T obj) {
        setObj(obj);
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return getObj().toString();
    }
}
