import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números reais: ");
        Double n1 = sc.nextDouble();
        Double n2 = sc.nextDouble();
        Double n3 = sc.nextDouble();
        Double MA = (n1 + n2 + n3) / (3);
        System.out.println(" a media aritimética é : " + MA);
    }
}
