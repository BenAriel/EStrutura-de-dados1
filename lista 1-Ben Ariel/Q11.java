  import java.util.Scanner;
 class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        double conta1 = 100;
        double conta2 = 100;

        System.out.println("digite quanto quer transferir para a conta2: ");
        double transfer = sc.nextDouble();
        if (transfer>= 100) {
            System.out.println("saldo insuficiente.");
        }
        else
        {
            conta2 += transfer;
            conta1 -= transfer;
            System.out.println("transferencia efetuada.");
        }

    }
}
