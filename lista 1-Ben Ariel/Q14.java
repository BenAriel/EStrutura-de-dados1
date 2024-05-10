 import java.util.Scanner;
 class Q14 {

    public static double  delta (double a,double b,double c)
    {
        return ( (b*b) - 4 * a * c);
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.println("digite os valores de a,b e c, respectivamente: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = delta(a,b,c);
        //em casa,fazer o calculo para achar as raízes abaixo de 0;
        if(delta>0)
        {
            System.out.println("não existem raízes reais");
        }
        else
        {
            double x1 = ((b *-1) + Math.sqrt(delta)) / 2 * a;
            double x2 = ((b *-1) + Math.sqrt(delta)) / 2 * a;
            if (delta==0) {
                
            System.out.println("a raiz é " + x1 );                
            }
            else
            {
                System.out.println("as raizes são " + x1 + "e " + x2);
            }
        }
    }
}
