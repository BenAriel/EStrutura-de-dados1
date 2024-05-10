  import java.util.Scanner;
 class Q7 
 {
   public static void no0 ()
    {
        Scanner sc = new Scanner(System.in );
        double n1,n2;
        System.out.println("digite 2 números reais:");
        n1= sc.nextDouble();
        n2 = sc.nextDouble();
        if(n2 == 0)
        {
            System.out.println(" a divisão nao pode ser por 0");
            no0();
        }
        else
        {
            System.out.println("o resultado da divisão é " + n1/n2);
        }

    }
    public static void main(String[] args) {
        no0();
    }
 }