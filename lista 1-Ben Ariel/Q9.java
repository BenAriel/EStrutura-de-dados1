import java.util.Scanner;
class Q9 {
  public static void calcularRaio ()
    {
        Scanner sc = new Scanner(System.in );
        double raio;
        System.out.println("digite o raio do circulo : ");
        raio= sc.nextDouble();
        if(raio <=0 )
        {
            System.out.println(" o raio tem que ser positivo.");
            calcularRaio();
        }
        else
        {
             double calculoArea = Math.PI * (raio * raio);
            System.out.println("a area do circulo é " + calculoArea);
        }

    }
    public static void main(String[] args) {
        calcularRaio();
    }
}