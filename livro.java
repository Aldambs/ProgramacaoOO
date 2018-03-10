package pooAula;

import java.util.Date;

public class livro {
    String titulo, nome, autor, isBN, categoria, localED;
    int anoLanc, qtdPG, edicao;
    Date dataEmprestimo, dataEntrega;
    boolean devolucao;
    double valorPG;
    
    public static void main(String[] args) {
        livro Livro = new livro();
        Livro.titulo = "EU, SUBMISSA";
        Livro.autor = "JODI ELLEN MALPAS";
        Livro.categoria = "DRAMA";
        Livro.anoLanc = 2014;
        Livro.edicao = 1;
        Livro.isBN = "978-85-422-0389-9";
        Livro.localED = "SÃO PAULO";
        Livro.qtdPG = 379;
        Livro.nome = "Maria";
        Livro.dataEmprestimo = new Date();
        Livro.dataEntrega = new Date();
        Livro.devolucao = true;
        
        System.out.println("O nome do leitor(a): \n" +Livro.nome);
    }
}
