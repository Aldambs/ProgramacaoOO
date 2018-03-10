package pooAula;

public class Aluno extends Pessoa{
    private String matricula;
    private String curso;
    
    public Aluno() {
        super();
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cadastrarAluno(){
        System.out.println("Digite a matricula do curso: ");
        setMatricula(matricula = ler.next());
        System.out.println("Digite o curso: ");
        setCurso(curso = ler.next());
    }

    @Override
    public String toString() {
        return  "Matricula = " + matricula + "\nCurso = " + curso;
    }
    
    
    
}
