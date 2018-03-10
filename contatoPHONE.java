package pooAula;

public class contatoPHONE {
    String nome, endereco;
    String email[];
    String telefone[];
    
    public static void main(String[] args) {
        contatoPHONE contato = new contatoPHONE();
        contato.nome = "sonia";
        contato.email = new String[2];
        contato.email[0] = "soniambs@hotmail.com";
        contato.email[1] = "sonia@hotmail.com";
        contato.telefone = new String[2];
        contato.telefone[0] = "79 998784121";
        contato.telefone[1] = "79 36512012";
        contato.endereco = "AGUA FRIA";
        
        System.out.println("Nome " +contato.nome);
    }
}
