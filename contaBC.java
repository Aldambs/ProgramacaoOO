package pooAula;

import java.util.Date;

public class contaBC {
    
    Date dataAbertura = new Date();
    Date dataOperacoes = new Date();
    
    int cpf, rg;
    String nome, agencia, numero, telefone, numeroCASA;
    String endereco, cidade, complemento, barrio;
    boolean especial, transferencia, pagamento;
    double saldo, deposito, saque, cartaoCRED, cartaoDEB, limiteCONTA;
    double limiteESP, limite;
    
    public void depositarValor(double valorAdepositar){
        saldo =+ valorAdepositar;
    }
    
    public boolean realizarSaque(double quantiaAsacar){
        if(saldo >= quantiaAsacar){
            saldo -= quantiaAsacar;
            return true;
        }else{//não tem saldo na conta
            if(especial){
                //verificar se o limite especial
                limite = limiteESP + saldo;
                if(limite >= quantiaAsacar){
                    saldo -= quantiaAsacar;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }
    public void consultarSaldo(){
         System.out.println("Saldo atual da conta = " + saldo);  
    }
    
    public boolean verificarChequeEspecial(){
        return saldo < 0;
    }
    
    public static void main(String[] args) {
        contaBC conta = new contaBC();
        conta.agencia = "0645";
        conta.nome = "ANA";
        conta.numero = "236589-0";
        conta.especial = true;
        conta.limiteESP = 500;
        conta.saldo = -10;
        
        System.out.println("Saldo da conta " +conta.numero + " = " +conta.saldo);
        
        boolean saqueEfetuado = conta.realizarSaque(10);
        
        if(saqueEfetuado){
            System.out.println("Saque realizado com sucesso");
            conta.consultarSaldo();
        }else{
            System.out.println("Saldo insuficiênte");
        }
        
        saqueEfetuado = conta.realizarSaque(500);
        if (saqueEfetuado) {
            System.out.println("Saque realizado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Saldo insuficiênte");
        }
        conta.depositarValor(500);
        conta.consultarSaldo();
        
        if(conta.verificarChequeEspecial()){
            System.out.println("Está usando cheque especial");
        }else{
            System.out.println("Não usa cheque especial");
        }
       
    }
}
