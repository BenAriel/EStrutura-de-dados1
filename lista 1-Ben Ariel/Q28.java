public class Q28 {
    public static void main(String[] args) {
        int [] vetor = {10,5,13,72,1,100,-100};
        int menor,maior;
         menor = vetor[0];
         maior = vetor[0];
         for(int i = 1;i<vetor.length;i++)
         {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            else 
            {
                if (vetor[i] > maior) {
                    maior = vetor[i];
                }
            }
         }

         System.out.println("maior número do vetor: " + maior);
         System.out.println("menor número do vetor: " + menor);

    }
}
