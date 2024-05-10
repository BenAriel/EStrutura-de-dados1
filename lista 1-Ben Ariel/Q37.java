import java.util.Scanner;
public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um número incial e final,rescpetivamente:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("somatório com recursividae:");
        int soma= recursiva(n1,n2); 
        System.out.println(soma);

        System.out.println("somatório com recursividae:");
         soma= iterativa(n1,n2); 
        System.out.println(soma);
    }

    static int recursiva(int n1,int n2)
    {
       if(n1==n2)
       {
           return n1;
       }
       else{
           return n1 + recursiva(n1+1,n2);
       }
    }

    static int iterativa(int n1,int n2)
    {
        int soma = 0;
        for(int i = n1; i <= n2; i++)
        {
            soma += i;
        }
        return soma;
    }   
}
