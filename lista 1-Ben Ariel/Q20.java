import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Double inicial, mensal,meses,saldo,juros,rendimentoMensal;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o saldo inicial:");
        inicial = sc.nextDouble();
        System.out.println("digite O investimento mensal:");
        mensal = sc.nextDouble();
        System.out.println("digite o número de meses:");
        meses = sc.nextDouble();
        System.out.println("digite a taxa de juros mensal(em porcentagem):");
        juros = sc.nextDouble();
        juros = juros/100;

        saldo=inicial;
        for(int i = 1;i<=meses;i++)
        {
            saldo += mensal;
            saldo = saldo * (1+juros);
            System.out.println("saldo no mês "+i+": "+saldo);
            System.out.println("rendimento no mês "+i+": "+(saldo-inicial));
        }
    }
}
