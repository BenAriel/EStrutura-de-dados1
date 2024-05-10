public class Q27 {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,5};
        System.out.println("vetor normal:");
        for(int i = 0; i<vetor.length;i++)
        {
            System.out.println(vetor[i]);
        }
        vetor=vetorInverso(vetor);
        System.out.println("vetor invertido:");
        for(int i = 0; i<vetor.length;i++)
        {
            System.out.println(vetor[i]);
        }
    }


static int [] vetorInverso(int [] vetor)
{
    int []vetorNovo = new int [vetor.length];
   int c=0;
    for(int i= (vetor.length -1) ;i>=0;i--)
    {
        vetorNovo[c] = vetor[i];
        c++;
    }
    return vetorNovo;
}
}

