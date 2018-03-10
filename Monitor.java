package pooAula;

public class Monitor extends Aluno{
   private String disciplina;
   private String horario;
   private int sala;

    public Monitor() {
        super();
    }
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
    
    public void cadastrarMonitor(){
        System.out.println("Digite a disciplina: ");
        setDisciplina(disciplina = ler.next());
        System.out.println("Digite os horários: ");
        setHorario(horario = ler.next());
        System.out.println("Digite a sala da monitoria: ");
        setSala(sala = ler.nextInt());
    }
    
    @Override
    public String toString() {
        return "Disciplina = " + disciplina + "\nHorario = " + horario + "\nSala = " + sala;
    }
    
    
}
