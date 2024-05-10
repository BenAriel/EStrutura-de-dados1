import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q40B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o nome do arquivo codificado: ");
        String codificado = sc.nextLine();

        System.out.print("digite o nome do arquivo decodificado: ");
        String decodificado = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(codificado));
             BufferedWriter writer = new BufferedWriter(new FileWriter(decodificado))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String conversao = line; 
                conversao = conversao.replace("P", "Z")
                .replace("p", "z")
                .replace("O", "E")
                .replace("o", "e")
                .replace("L", "N")
                .replace("l", "n")
                .replace("A", "I")
                .replace("a", "i")
                .replace("R", "T")
                .replace("r", "t");
                  
                writer.write(conversao);
                writer.newLine();
            }

            System.out.println("Decodificação concluída. Resultado salvo em " + decodificado);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

