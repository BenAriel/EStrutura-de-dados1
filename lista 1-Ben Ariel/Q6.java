import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final Double refri = 1.50;
        final Double fatia = 3.0;
        final Double taxa = 0.10;
        System.out.println("digite a quantidade de refrigerantes, de fatias e de pessoas,respctivamente: ");
        int quantrefri = sc.nextInt();
        int quantfatias = sc.nextInt();
        int quantpessoas = sc.nextInt();
        Double contasemtaxa = ((refri * quantrefri) + (fatia * quantfatias));
        System.out.println("total da conta sem taxa: " + contasemtaxa + "R$");
        System.out.println("total da conta com taxa: " + (contasemtaxa + (contasemtaxa * taxa)) + "R$");
        System.out.println("total da conta com taxa por pessoa: "
                + ((contasemtaxa + (contasemtaxa * taxa)) / quantpessoas) + "R$");

    }
}
