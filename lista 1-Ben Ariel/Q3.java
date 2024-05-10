import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite 2 números inteiros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        int subtracao = n1 - n2;
        Double divisao = (double) n1 / (double) n2;
        int multiplicacao = n1 * n2;
        Double resto = (double) n1 % (double) n2;

        System.out.println("soma: " + soma);
        System.out.println("subtração: " + subtracao);
        System.out.println("multiplicação : " + multiplicacao);
        System.out.println("quociente: " + divisao);
        System.out.println("resto " + resto);

    }
}
