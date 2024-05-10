import java.util.Scanner;

import InterfacesAndExcecao.Excecao;
import InterfacesAndExcecao.InterfaceFila;

public class DistanciaCidades {
    public static void main(String[] args) throws Excecao {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero de cidades:");
        int cidades = sc.nextInt();
        int [][] matriz = new int[cidades][cidades];
        for(int i =0; i<cidades;i++)
        {
            for (int j = 0;j<cidades;j++)
            {
                if(i!= j)
                {
                    System.out.println("digite a distancia da cidade " + i + " para a cidade " + j);
                    int dist = sc.nextInt();
                    matriz[i][j] = dist;
                }
                else
                matriz[i][j] = 0;
            }
        }

        System.out.println("digite a cidade incial: ");
        int inicial = sc.nextInt();
        int [] solucao = new int[cidades];
        for(int i =0;i <cidades; i++)
        {
            if(i!= inicial)
            solucao[i] = -1;
            else
            solucao[i] = 0;
        }

        InterfaceFila<Integer> fila = new FilaEncadeada<>();
        fila.add(inicial);
        while(!fila.isEmpty())
        {
            int atual = fila.remove();
            for(int i =0; i<cidades;i++)
            {
                int distancia = matriz[atual][i];
                if(distancia>0 && solucao[i] == -1)
                {
                    solucao[i] = solucao[atual] + distancia;
                    fila.add(i);
                }
            }
        }

        for(int i =0;i<cidades;i++)
        {
            System.out.println(solucao[i]);
        }
        sc.close();
    }
}
