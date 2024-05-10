import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite a primeira letra do seu nome: ");
        char primeiraLetra = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();
        System.out.println("digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("digite sua altura:");
        Double altura = sc.nextDouble();
        System.out.println(" primeira letra :" + primeiraLetra + "\n nome completo: " + nomeCompleto + "\n idade: "
                + idade + "\n altura: " + altura);

    }

}
