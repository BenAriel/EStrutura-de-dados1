public class Main {
    public static void main(String[] args) {
        int[] vetor = { 4, 7, 2, 6, 4, 1, 8, 3 };
        ShellSort(vetor);
        System.out.println();

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }

    public static void ShellSort(int[] vetor) {
        // melhor caso: O(n)                   medio e pior caso: O(n log n)
        int i, j, value;
        int h = 1;
        int size = vetor.length;

        while (h < size) {
            h = 3 * h + 1;
        }

        while (h > 0) {
            for (i = h; i < size; i++) {
                value = vetor[i];
                j = i;
                while (j > h - 1 && value <= vetor[j - h]) {
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[j] = value;
            }
            h = h / 3;
        }
    }

    public static void QuickSort(int[] vetor, int inicio, int fim) {
        // medio e melhor caso: O(n log n)               pior caso: O(n^2)
        int aux;
        int i = inicio;
        int f = fim;
        int pivo = vetor[(inicio + fim) / 2];
        while (i < f) {
            while (vetor[i] < pivo) {
                i = i + 1;
            }
            while (vetor[f] > pivo) {
                f = f - 1;
            }
            if (i <= f) {
                aux = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = aux;
                i++;
                f--;
            }
        }
        if (f > inicio) {
            QuickSort(vetor, inicio, f);
        }
        if (i < fim) {
            QuickSort(vetor, i, fim);
        }

    }

    public static void InsertSort(int[] vetor) {
        //medio e pior caso: O(n^2)          melhor caso: O(n)
        for (int i = 1; i < vetor.length; i++) {
            int eleito = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > eleito) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = eleito;

            for (int k = 0; k < vetor.length; k++) {
                System.out.print(vetor[k]);
            }
            System.out.println();
        }

    }

    public static void BubbleSort(int[] vetor) {
        //todos os casos: O(n^2)
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j + 1] < vetor[j]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }

            for (int k = 0; k < vetor.length; k++) {
                System.out.print(vetor[k]);
            }
            System.out.println();
        }
    }

    public static void SelectSort(int[] vetor) {
        //todos os casos: O(n^2)
        int tam = vetor.length;
        int posicaoMenor = 0;
        for (int i = 0; i < tam - 1; i++) {
            int menor = vetor[i];

            for (int j = i + 1; j < tam; j++) {
                if (vetor[j] < menor) {
                    menor = vetor[j];
                    posicaoMenor = j;
                }

            }

            if (menor < vetor[i]) {
                vetor[posicaoMenor] = vetor[i];
                vetor[i] = menor;
            }

            for (int k = 0; k < vetor.length; k++) {
                System.out.print(vetor[k]);
            }
            System.out.println(" ");
        }

    }
}
