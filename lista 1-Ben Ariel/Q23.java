 import java.util.Scanner;
 class Q23 
 {

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
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o número:");
        int n = sc.nextInt();
        int result = 1;
        System.out.println("com for:");
        for(int i = n;i>=2;i--)
        {
            result *= i;
        }

        System.out.println(result);

        System.out.println("com recursiva:");

        int recursiva = fatorial(n);
        System.out.println(recursiva);

    }

    }
 