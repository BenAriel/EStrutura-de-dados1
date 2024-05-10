import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o número inicial e final,respctivamente:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int c = 0;
        System.out.println("for:");
        for (c = n1; c <= n2; c++) {
            System.out.println(c);
        }

        c = n1;
        System.out.println("while");

        while (c <= n2) {

            System.out.println(c);
            c++;
        }

        System.out.println("do-while");
        c = n1;
        do {
            System.out.println(c);
            c++;
        } while (c <= n2);
    }
}
