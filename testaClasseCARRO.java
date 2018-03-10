package pooAula;

public class testaClasseCARRO {

    public static void main(String[] args) {
        carro Carro = new carro();
        Carro.modelo = "Ducado";
        Carro.marca = "Fiat";
        Carro.placa = "AMBS 1988";
        Carro.capCombustivel = 50;
        Carro.capPassageiro = 5;
        Carro.consumoCombustivel = 3.4;
        
        System.out.println(Carro.marca + " , " +Carro.modelo);
        Carro.exibirAutonomia();
         
        double autonomia = Carro.obterAutonomia();
        System.out.println("A autonomia é = " +autonomia);
        
        double qtdCombustivel = Carro.calcularAutonomia(10);
        System.out.println("A quantidade de combustivel é = " +qtdCombustivel);
    }
    
}
