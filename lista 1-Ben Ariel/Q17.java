import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o número inicial e final,respctivamente:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int c = 0;

        c = n1;
        System.out.println("for:");

        for (c = n1; c <= n2; c++) {
            if (c % 2 == 1) {
                System.out.println(c);
            }
        }
        System.out.println("while:");
        c=n1;
        while (c <= n2) {
            if (c % 2 == 1) {
                 System.out.println(c);
            }
            c++;
        }

        System.out.println("do-while");
        c = n1;
        do {
            if (c % 2 == 1) {
                System.out.println(c);
            }
            c++;
        } while (c <= n2);
    }
}
