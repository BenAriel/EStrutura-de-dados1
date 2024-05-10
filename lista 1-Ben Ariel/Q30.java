import java.util.Scanner;
public class Q30 {
    public static void main(String[] args) {
    System.out.println("digite uma frase:");
    Scanner sc = new Scanner(System.in);
    String frase = sc.nextLine();
    char[] fraseUtil = frase.toCharArray();
    char [] fraseInvertida = new char[fraseUtil.length];
    int c = 0;
    for(int i = fraseUtil.length-1;i>=0;i--)
    {
        fraseInvertida[c]= fraseUtil[i];
        c++;
    }

    String InvertidaUtil = new String(fraseInvertida);
    
    System.out.println("frase invertida: " + InvertidaUtil);
 }

}
