import java.util.Scanner;

class Q12 {
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
        }
        else{
            System.out.println("aluno reprovado.");
        }

     }

 }   
}
