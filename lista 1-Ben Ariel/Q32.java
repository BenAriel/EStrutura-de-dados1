import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Q32 {
    public static void main(String[] args) {
        System.out.println("Digite quantas pessoas deseja cadastrar:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = sc.next();
            System.out.println("Digite o CPF da pessoa " + (i + 1) + ":");
            String cpf = sc.next();
            System.out.println("Digite o sexo da pessoa " + (i + 1) + ":");
            String sexo = sc.next();
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = sc.nextInt();
            System.out.println("Digite o peso da pessoa " + (i + 1) + ":");
            Double peso = sc.nextDouble();
            System.out.println("Digite a altura da pessoa " + (i + 1) + ":");
            Double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, cpf, sexo, idade, peso, altura);
        }

        
        salvarEmBinario(pessoas);

        Pessoa[] pessoasLidas = lerBinario();

        for (int i = 0; i < n; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.println("Nome: " + pessoasLidas[i].getNome());
            System.out.println("CPF: " + pessoasLidas[i].getCpf());
            System.out.println("Sexo: " + pessoasLidas[i].getSexo());
            System.out.println("Idade: " + pessoasLidas[i].getIdade());
            System.out.println("Peso: " + pessoasLidas[i].getPeso());
            System.out.println("Altura: " + pessoasLidas[i].getAltura());
            System.out.println("IMC: " + pessoasLidas[i].getImc());
        }
    }

    static void salvarEmBinario(Pessoa[] pessoas) {
        String nomeArquivo = "dados.bin";

        try (FileOutputStream fos = new FileOutputStream(nomeArquivo);
             DataOutputStream dos = new DataOutputStream(fos)) {

            for (Pessoa pessoa : pessoas) {
                dos.writeUTF(pessoa.getNome());
                dos.writeUTF(pessoa.getCpf());
                dos.writeUTF(pessoa.getSexo());
                dos.writeInt(pessoa.getIdade());
                dos.writeDouble(pessoa.getPeso());
                dos.writeDouble(pessoa.getAltura());
                dos.writeDouble(pessoa.getImc());
            }

            System.out.println("Dados salvos com sucesso em " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar em binário: " + e.getMessage());
        }
    }

    static Pessoa[] lerBinario() {
        String nomeArquivo = "dados.bin";
        Pessoa[] pessoasLidas = null;
    
        try (FileInputStream fis = new FileInputStream(nomeArquivo);
             DataInputStream dis = new DataInputStream(fis)) {
    
            pessoasLidas = new Pessoa[100];
            int count = 0;
    
            while (dis.available() > 0) {
                String nome = dis.readUTF();
                String cpf = dis.readUTF();
                String sexo = dis.readUTF();
                int idade = dis.readInt();
                double peso = dis.readDouble();
                double altura = dis.readDouble();
                double imc = dis.readDouble();
    
                if (count == pessoasLidas.length) {
                    pessoasLidas = Arrays.copyOf(pessoasLidas, pessoasLidas.length * 2);
                }
    
                pessoasLidas[count] = new Pessoa(nome, cpf, sexo, idade, peso, altura);
                pessoasLidas[count].setImc(altura, peso); 
                count++;
            }
    
            
            pessoasLidas = Arrays.copyOf(pessoasLidas, count);
    
            System.out.println("Dados lidos com sucesso de " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao ler binário: " + e.getMessage());
        }
    
        return pessoasLidas;
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
