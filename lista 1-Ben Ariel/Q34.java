import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        char[] palavra = new char[30];
        int contadorCharUtil = 0;
        ArrayList<String> vetor = new ArrayList<>();

        if (!frase.isEmpty()) {
            Map<String, Integer> contagemPalavras = new HashMap<>();

            for (char caractere : frase.toCharArray()) {
                int valorAscii = (int) caractere;
                if (valorAscii == 32) {
                    String palavraUtil = new String(palavra, 0, contadorCharUtil);
                    vetor.add(palavraUtil);

                    // Atualizar a contagem no mapa
                    contagemPalavras.put(palavraUtil, contagemPalavras.getOrDefault(palavraUtil, 0) + 1);

                    zerarVetor(palavra); // Função para zerar o vetor
                    contadorCharUtil = 0;
                } else {
                    palavra[contadorCharUtil] = caractere;
                    contadorCharUtil++;
                }
            }

            // Adiciona a última palavra,pois verifico se é uma palavra com espaços
            if (contadorCharUtil > 0) {
                String palavraUtil = new String(palavra, 0, contadorCharUtil);
                vetor.add(palavraUtil);
                contagemPalavras.put(palavraUtil, contagemPalavras.getOrDefault(palavraUtil, 0) + 1);
            }

            System.out.println("Palavras:");
            for (String palavras : vetor) {
                System.out.println(palavras + " - Ocorrências: " + contagemPalavras.get(palavras));
            }
        } else {
            System.out.println("Frase vazia");
        }
    }

    // Função para zerar o conteúdo do vetor
    static void zerarVetor(char[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = '\0';
        }
    }
}
