import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o número que voce quer para a tabuada:");
        int n = sc.nextInt();
        for(int i =1;i<=10;i++)
        {
            System.out.println(n + "x" + i + " = " + n*i);
        }

    }
}
