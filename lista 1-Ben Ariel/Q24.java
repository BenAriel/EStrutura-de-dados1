import java.util.Scanner;

public class Q24 {
    public static int fatorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
           return  n * fatorial(n-1);
        }
    }
    public static void main(String[] args) {
        int escolha;
        do{

        Scanner sc = new Scanner(System.in);
        System.out.println("1-potenciação");
        System.out.println("2-raiz quadrada");
        System.out.println("3-fatorial");
        System.out.println("0-sair");
         escolha = sc.nextInt();
        
            if(escolha == 1)
            {
                System.out.println("digite o número que voce quer elevar e a potencia,rescptivamente:");
                int n = sc.nextInt();
                int potencia = sc.nextInt();
                System.out.println(Math.pow(n, potencia));
            }
            else if(escolha == 2)
            {
                System.out.println("digite o número que voce quer tirar a raiz:");
                int n = sc.nextInt();
                System.out.println(Math.sqrt(n));
            }
            else if(escolha == 3)
            {
                System.out.println("digite o número do fatorial:");
                int n = sc.nextInt();
                int res = fatorial(n);
                System.out.println(res);
            }
            else if(escolha==0)
            {
                System.out.println("obrigado!");
            }
            else
            {
                System.out.println("digite um número válido.");
            }
        }while (escolha!=0);
    }
}
