package classe;

import java.util.Date;

public class DadosPessoais extends Contato{
    //DADOS PESSOAIS
    private String NOME;
    private long RG;
    private long CPF;
    private char SEXO;
    private Date DATA_DE_NASCIMENTO;

    public DadosPessoais(String NOME, long RG, long CPF, char SEXO, Date DATA_DE_NASCIMENTO,
            String email, String telefone, String endereço, String cidade, 
            String estado, short cep, int numeroCasa) {
        super(email, telefone, endereço, cidade, estado, cep, numeroCasa);
        this.NOME = NOME;
        this.RG = RG;
        this.CPF = CPF;
        this.SEXO = SEXO;
        this.DATA_DE_NASCIMENTO = DATA_DE_NASCIMENTO;

    }    
    
    public DadosPessoais() {
        
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public long getRG() {
        return RG;
    }

    public void setRG(long RG) {
        this.RG = RG;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public char getSEXO() {
        return SEXO;
    }

    public void setSEXO(char SEXO) {
        this.SEXO = SEXO;
    }

    public Date getDATA_DE_NASCIMENTO() {
        return DATA_DE_NASCIMENTO;
    }

    public void setDATA_DE_NASCIMENTO(Date DATA_DE_NASCIMENTO) {
        this.DATA_DE_NASCIMENTO = DATA_DE_NASCIMENTO;
    }

    @Override
    public String toString() {
        return "DADOS PESSOAIS: " + "\nNOME = " + NOME + "\nRG = " + RG + 
                "\nCPF = " + CPF + "\nSEXO = " + SEXO +
                "\nDATA DE NASCIMENTO = " + DATA_DE_NASCIMENTO + super.toString();
  
    }
    
    
}
