import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import InterfacesAndExcecao.Excecao;

public class ContaPalavrasLista {
    public static void main(String[] args) throws Excecao {
        ListaSimplesmenteEncadeada<String> lista = new ListaSimplesmenteEncadeada<>();
        String arquivoEntrada = "entrada.txt";
        String arquivoTextoSaida = "saida_texto.txt";


        try {
    
            BufferedReader reader = new BufferedReader(new FileReader(arquivoEntrada));
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] palavras = linha.split("\\s+");
                for (String palavra : palavras) {
                    lista.addLast(palavra);
                }
            }
            reader.close();

            // Contagem das palavras
            StringBuilder resultadoTexto = new StringBuilder();
            while (!lista.isEmpty()) {
                String palavra = lista.removeFirst();
                int frequencia = 1;
                while (lista.search(palavra) != null) {
                    frequencia++;
                    lista.remove(palavra);
                }
                resultadoTexto.append("A palavra ").append(palavra).append(" aparece ").append(frequencia).append(" vezes\n");
            }

            BufferedWriter writerTexto = new BufferedWriter(new FileWriter(arquivoTextoSaida));
            writerTexto.write(resultadoTexto.toString());
            writerTexto.close();


            System.out.println("Frequência das palavras contada e salva em " + arquivoTextoSaida);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
