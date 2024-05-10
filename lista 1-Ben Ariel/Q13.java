import java.util.Scanner;

class Q13 {
    public static void main(String[] args) {
    System.out.println("digite sua média:");
     Scanner sc = new Scanner(System.in );
     double media = sc.nextDouble();
     if (media>=7) {
        System.out.println("aluno aprovado.");
     }
     else
     {
        if (media>=3.5 && media <7) {
            System.out.println("aluno em recuperação.");
            double notaNecessaria =  (5 * 10 - media * 6) / 4; 
            System.out.println("o aluno precisa de " + notaNecessaria + " na recuperação");
        }
        else{
            System.out.println("aluno reprovado.");
        }

     }
    }
}
