import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a senha:");
        String senhaCorreta = "BBbenBB";
        String senhaLida = sc.nextLine();

        System.out.println("while:");
        while (!senhaLida.equals(senhaCorreta)) {
            System.out.println("senha incorreta, digite novamente:");
            senhaLida = sc.nextLine();
        }
        System.out.println("do-while:");
        do {
            System.out.println("senha incorreta, digite novamente:");
            senhaLida = sc.nextLine();
        } while (!senhaLida.equals(senhaCorreta));
    }
}
