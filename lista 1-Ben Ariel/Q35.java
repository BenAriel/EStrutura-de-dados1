import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q35 {

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

            // Adiciona a última palavra, pois verifico se é uma palavra com espaços
            if (contadorCharUtil > 0) {
                String palavraUtil = new String(palavra, 0, contadorCharUtil);
                vetor.add(palavraUtil);
                contagemPalavras.put(palavraUtil, contagemPalavras.getOrDefault(palavraUtil, 0) + 1);
            }

            
            exibirEGravarCSV(vetor, contagemPalavras);

           
            lerEExibirCSV();
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

    // Função para exibir na tela e gravar em um arquivo CSV
    static void exibirEGravarCSV(ArrayList<String> vetor, Map<String, Integer> contagemPalavras) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resultado.csv"))) {
            System.out.println("Palavras:");

            // Exibir na tela e escrever no arquivo CSV
            for (String palavra : vetor) {
                System.out.println(palavra + " - Ocorrências: " + contagemPalavras.get(palavra));
                writer.write(palavra + "," + contagemPalavras.get(palavra));
                writer.newLine();
            }

            System.out.println("Resultados salvos em resultado.csv");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Função para ler o arquivo CSV e exibir na tela
    static void lerEExibirCSV() {
        System.out.println("Lendo o arquivo CSV:");

        try (BufferedReader reader = new BufferedReader(new FileReader("resultado.csv"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println(parts[0] + " - Ocorrências: " + parts[1]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

