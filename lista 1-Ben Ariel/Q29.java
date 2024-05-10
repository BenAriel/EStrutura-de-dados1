public class Q29 {
    public static void main(String[] args) {
        int [] vetor = {10,15,20,25,30};
        
        for(int i = vetor.length-1; i>0;i--)
        {
            //os números trocam de posição,da direita para esquerda
            int ultimoNumero= vetor[i];
            vetor[i] = vetor[i-1];
            vetor[i-1] = ultimoNumero;
        }

        for(int i = 0; i< vetor.length;i++)
        {
            System.out.print(vetor[i] + " ");
        }
    }
}
