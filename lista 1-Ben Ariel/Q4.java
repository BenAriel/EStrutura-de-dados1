import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números inteiros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int MA = (n1 + n2 + n3) / (3);
        System.out.println(" a media aritimética é : " + MA);

    }
}
