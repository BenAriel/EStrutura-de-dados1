import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q40A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o nome do arquivo normal: ");
        String codificar = sc.nextLine();

        System.out.print("digite o nome do arquivo pós codificado: ");
        String codificado = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(codificar));
             BufferedWriter writer = new BufferedWriter(new FileWriter(codificado))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String conversao = line; 
                conversao = conversao.replace("Z", "P")
                .replace("z", "p")
                .replace("E", "O")
                .replace("e", "o")
                .replace("N", "L")
                .replace("n", "l")
                .replace("I", "A")
                .replace("i", "a")
                .replace("T", "R")
                .replace("t", "r");
                  
                writer.write(conversao);
                writer.newLine();
            }

            System.out.println("Codificação concluída. Resultado salvo em " + codificado);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

