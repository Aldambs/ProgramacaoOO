package pooAula;

import java.util.Scanner;

public class Pessoa {
    Scanner ler = new Scanner(System.in);
    private String nome;
    private char sexo;
    private String dataNasc;
    private String cpf;
    private String rg;

    public Pessoa(String nome, char sexo, String dataNasc, String cpf, String rg) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Pessoa() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void cadastrarDados(){
         System.out.print("Nome: ");
         setNome(nome = ler.nextLine());
         System.out.print("Sexo: ");
         setSexo(sexo = ler.next().charAt(0));
         System.out.print("Data de nascimento: ");
         setDataNasc(dataNasc = ler.next());
         System.out.print("CPF: ");
         setCpf(cpf = ler.next());
         System.out.print("RG: ");
         setRg( rg = ler.next()); 
    }
    @Override
    public String toString() {
        return "Nome = " + nome + "\nSexo = " + sexo + 
                "\nData de Nascimento = " + dataNasc + "\nCPF = " + cpf + "\nRG = " + rg;
    }
    
    
}
