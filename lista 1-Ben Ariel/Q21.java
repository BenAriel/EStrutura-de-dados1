import java.util.Scanner;
class Q21 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite um número:");
        int n = sc.nextInt();
        String result = "é primo";
        if(n<=1)
        {
            System.out.println("não é primo");
        }
        else
        {
            for(int i = 2;i<=Math.sqrt(n);i++)
            {
                if( n%i==0)
                {
                    result = " não é primo";
                    break;
                }
            }

            System.out.println(result);
        }
        
    }
}