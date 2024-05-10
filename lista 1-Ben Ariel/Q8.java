import java.util.Scanner;
class Q8 {
  public static void imc ()
    {
        Scanner sc = new Scanner(System.in );
        double altura,peso;
        System.out.println("digite sua altura(em metros):");
        altura= sc.nextDouble();
        System.out.println("digite seu peso(em kg):");
        peso = sc.nextDouble();

        double calculoImc = peso/(altura * altura);
        if(altura == 0)
        {
            System.out.println(" a divisão nao pode ser por 0");
            imc();
        }
        else
        {
            System.out.println("o seu imc é " + calculoImc );
        }

    }
    public static void main(String[] args) {
        imc();
    }
}
