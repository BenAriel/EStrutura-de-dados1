import java.util.Scanner;
public class Q36 {
    public static void main(String[] args) {
        System.out.println("digite um número inteiro:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = fatorial(n);
        System.out.println("o fatorial de " + n + " é: " + f);
    }

    static int fatorial(int n)
{
    if(n==0)
    {
        return 1;
    }
    else{
        return n * fatorial(n-1);
    }
}
}


