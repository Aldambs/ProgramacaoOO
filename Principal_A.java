package pooAula;

public class Principal_A {
    
    public static void main(String[] args) {
        Aluno a = new Aluno();
        Pessoa p = new Pessoa();
        Monitor m = new Monitor();
        
        p.cadastrarDados();
        a.cadastrarAluno();
        m.cadastrarMonitor();
        
        System.out.println(p.toString());
        System.out.println(a.toString());
        System.out.println(m.toString());
    }
}
