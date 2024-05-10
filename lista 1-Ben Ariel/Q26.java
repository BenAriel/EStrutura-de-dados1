import java.util.Scanner;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o número de linhas e de coluna,respectivamente:");
        int l = sc.nextInt();
        int c = sc.nextInt();

       int [][] matriz = new int[l][c];

        for(int i=0 ;i<l;i++)
        {
            for(int j= 0;j<c;j++)
            {
                System.out.println("digite o valor da coluna " + (j+1) + " na linha " +(i+1) + ":");
                matriz[i][j] = sc.nextInt();
            }
        }

    }
}
