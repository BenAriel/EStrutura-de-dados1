import java.util.Scanner;
class Q15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um número:");
        int n = sc.nextInt();
        String [] escrito = {"um","dois","tres","quatro","cinco"};
        for(int i =0;i<5;i++)
        {
            if(i==n)
            {
                System.out.println(escrito[i-1]);
                break;
            }

        } 
    }
}