import java.util.Scanner;
class Q31 {
public static void main(String[] args) {
        System.out.println("digite quantas pessaos deseja cadastrar:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pessoa [] pessoas = new Pessoa[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("digite o nome da pessoa " + (i+1) + ":");
            String nome = sc.next();
            System.out.println("digite o cpf da pessoa " + (i+1) + ":");
            String cpf = sc.next();
            System.out.println("digite o sexo da pessoa " + (i+1) + ":");
            String sexo = sc.next();
            System.out.println("digite a idade da pessoa " + (i+1) + ":");
            int idade = sc.nextInt();
            System.out.println("digite o peso da pessoa " + (i+1) + ":");
            Double peso = sc.nextDouble();
            System.out.println("digite a altura da pessoa " + (i+1) + ":");
            Double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, cpf, sexo, idade, peso, altura);
        }

        for(int i = 0; i < n; i++)
        {
            System.out.println("nome: " + pessoas[i].getNome());
            System.out.println("cpf: " + pessoas[i].getCpf());
            System.out.println("sexo: " + pessoas[i].getSexo());
            System.out.println("idade: " + pessoas[i].getIdade());
            System.out.println("peso: " + pessoas[i].getPeso());
            System.out.println("altura: " + pessoas[i].getAltura());
            System.out.println("imc: " + pessoas[i].getImc());
     }
 }
}
     class Pessoa
     {
        private String nome,cpf,sexo;
        private int idade;
        private Double peso,altura,imc;

        public Pessoa(String nome, String cpf, String sexo, int idade, Double peso, Double altura) {
            setNome(nome);
            setCpf(cpf);
            setSexo(sexo);
            setIdade(idade);
            setPeso(peso);
            setAltura(altura);
            setImc(altura, peso);
        }
        public Double getAltura() {
            return altura;
        }
        public String getCpf() {
            return cpf;
        }
        public int getIdade() {
            return idade;
        }
        public Double getImc() {
            return imc;
        }
        public String getNome() {
            return nome;
        }
        public Double getPeso() {
            return peso;
        }
        public String getSexo() {
            return sexo;
        }
        public void setAltura(Double altura) {
            this.altura = altura;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
        public void setImc(Double altura, Double peso) {
            this.imc = peso/(altura*altura);
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setPeso(Double peso) {
            this.peso = peso;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
     }

    
