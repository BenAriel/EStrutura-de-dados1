import java.util.Scanner;
import InterfacesAndExcecao.Excecao;

public class ExpressaoPosFixa {
    public static void main(String[] args) throws Excecao {
        Scanner sc = new Scanner(System.in);
        PilhaEncadeada<Double> pilha = new PilhaEncadeada<>();

        System.out.println("Digite a expressão matemática pós-fixa: ");
        String expressao = sc.nextLine();

        String exp1 = "";
        double result;

        for (char carac : expressao.toCharArray()) {
            if (carac != ' ') {
                exp1 += carac;
            } else {
                if (exp1.length() == 1 && (exp1.equals("+") || exp1.equals("-") || exp1.equals("*") || exp1.equals("/"))) {
                    double v1 = pilha.pop();
                    double v2 = pilha.pop();
                    if (exp1.equals("+"))
                        result = v2 + v1;
                    else if (exp1.equals("-"))
                        result = v2 - v1;
                    else if (exp1.equals("*"))
                        result = v2 * v1;
                    else 
                        result = v2 / v1;

                    pilha.push(result);
                } else {
                    double n = Double.parseDouble(exp1);
                    pilha.push(n);
                }
                exp1 = "";
            }
        }

        if (!exp1.isEmpty()) {
            double n = Double.parseDouble(exp1);
            pilha.push(n);
        }

        if (pilha.getSize() == 1) {
            double resultado = pilha.pop();
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Expressão mal formada.");
        }
        sc.close();
    }
}
