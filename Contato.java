package classe;

public class Contato {
    //ATRIBUTOS
    private String email;
    private String telefone;
    private String endereço;
    private String cidade;
    private String estado;
    private short cep;
    private int numeroCasa;

    //CONSTRUTORES
    public Contato() {
    }

    public Contato(String email, String telefone, String endereço,  
            String cidade, String estado, short cep, int numeroCasa) {
        this.email = email;
        this.telefone = telefone;
        this.endereço = endereço;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.numeroCasa = numeroCasa;
    }

    //ENCAPSULAMENTO
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public short getCep() {
        return cep;
    }

    public void setCep(short cep) {
        this.cep = cep;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    @Override
    public String toString() {
        return "CONTATOS: " + "\nE-MAIL = " + email + "\nTELEFONE = " + telefone + 
                "\nENDEREÇO = " + endereço + "\nCOMPLEMENTO = " +
                "\nCIDADE = " + cidade + "\nESTADO = " + estado + "\nCEP = " + cep +
                "\nNÚMERO DA CASA = " + numeroCasa;
    }
    
    
    
}
