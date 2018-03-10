package classe;


public class Disciplina {
    //ATRIBUTOS
    private String codigo;
    private String nomeDisciplina;
    private Disciplina [] preRequisito;
    private Professor prof;
    private int credito;
    private boolean obrigatoria;
    private String ementa;

    //CONSTRUTORES

    public Disciplina(String codigo, String nomeDisciplina, Professor prof,
            Disciplina[] preRequisito, int credito, boolean obrigatoria, String ementa) {
        this.codigo = codigo;
        this.nomeDisciplina = nomeDisciplina;
        this.preRequisito = preRequisito;
        this.prof = prof;
        this.credito = credito;
        this.obrigatoria = obrigatoria;
        this.ementa = ementa;
    }
    

    public Disciplina() {
        
    }
 
    //MÉTODO GET e SET
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Disciplina[] getPreRequisito() {
        return preRequisito;
    }

    public void setPreRequisito(Disciplina[] preRequisito) {
        this.preRequisito = preRequisito;
        
    }
    
    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public boolean isObrigatoria() {
        return obrigatoria;
    }

    public void setObrigatoria(boolean obrigatoria) {
        this.obrigatoria = obrigatoria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
 
    @Override
    public String toString() {
        return  "\nCÓDIGO = " + codigo + "\nNOME = " + nomeDisciplina + 
                "\nPRÉ REQUISITO = " + preRequisito + 
                "\nCRÉDITO = " + credito + "\nOBRIGATÓRIO = " + obrigatoria + 
                "\nEMENTA = " + ementa;
    }
    
    
}
