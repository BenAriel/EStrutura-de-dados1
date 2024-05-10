import java.util.Scanner;
public class Q25 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o tamanho do vetor:");
        int n = sc.nextInt();
        int [] vetor = new int[n];
         for(int i = 0; i < n; i++)
            {
                System.out.println("digite o " + (i+1) + " valor:");
                vetor[i]=sc.nextInt();
            }

            for(int i = 0; i < n; i++)
            {
                System.out.print(vetor[i] + "  ");
            }
    }
}
