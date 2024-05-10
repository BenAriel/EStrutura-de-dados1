import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um número inicial e final,respecticamente:");
        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int soma = 0;
        for(int i = inicio; i<= fim;i++)
        {
            soma+= i;

        }

        System.out.println("o somatório do intrvalo é " + soma);
    }
}

