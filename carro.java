package pooAula;

public class carro {

    String marca, cor, placa, modelo;
    double capCombustivel, consumoCombustivel;
    int capPassageiro;

    void exibirAutonomia() {//método void
        System.out.println("Autonomia do carro é " +capCombustivel * consumoCombustivel + "km");
    }
    double obterAutonomia(){//método de retorno
        return capCombustivel * consumoCombustivel;
    }
    double calcularAutonomia(double km){//passando parametro
        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }
}