public class Q38 {
    public static void main(String[] args) {
        Generica<String> g1 = new Generica<String>("generica string");
        System.out.println(g1);
        Generica<Integer> g2 = new Generica<Integer>(10);
        System.out.println(g2);

        Generica<Integer> g3 = new Generica<Integer>(new Integer[]{1,2,3,4,5});
        g3.getVetor();
    }
}

class Generica<T>{
    private T obj;
    private T [] vetor;
    public Generica(T obj){
        setObj(obj);
    }
    public Generica(T [] vetor){
        setVetor(vetor);
    }
    public T getObj(){
        return obj;
    }
    public void setObj(T obj){
        this.obj = obj;
    }

    public void setVetor(T [] vetor){
        this.vetor = vetor;
    }

    public void getVetor(){
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.println( "elemento " + (i+1) + " : " +vetor[i]);
        }
    }

    @Override 
    
    public String toString() {
        
        return ("o conteuúdo dessa variável é :" + getObj());
    }
}
