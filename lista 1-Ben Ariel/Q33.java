import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Q33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();
        Map<Integer, Integer> contagemLetras = new HashMap<>();

       
        for (char caractere : frase.toCharArray()) {
            int valorAscii = (int) caractere;

            // Incrementa a contagem no mapa
            contagemLetras.put(valorAscii, contagemLetras.getOrDefault(valorAscii, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : contagemLetras.entrySet()) {
            int valorAscii = entry.getKey();
            char letra = (char) valorAscii;
            int contagem = entry.getValue();
            System.out.println("Letra: " + letra + " (ASCII: " + valorAscii + ") - Quantidade: " + contagem);
        }
    }
}
