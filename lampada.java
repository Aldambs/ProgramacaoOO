package pooAula;

public class lampada {
    String modelo, tensao, cor, tipoluz;
    int potencia, garantiaM;
    boolean ligada;
    String tipo[];
    
    void ligarLampada(){
        ligada = true;
    }
    void desligarLampada(){
        ligada = false;
    }
    void mostrarEstado(){
        if(ligada == true){
            System.out.println("LIGADA");
        }else{
            System.out.println("DESLIGADA");
        }
    }
    void mudarEstado(){
        if(ligada){
            desligarLampada();
        }else{
            ligarLampada();
        }
    }
    
    public static void main(String[] args) {
        lampada Lampada = new lampada();
        Lampada.modelo = "A60";
        Lampada.tensao = "bivolt";
        Lampada.garantiaM = 36;
        Lampada.cor = "Amarela";
        Lampada.potencia = 7;
        Lampada.tipoluz = "Amarela";
        Lampada.tipo = new String[5];
        Lampada.tipo[0] = "Abaju";
        Lampada.tipo[1] = "Lampeões";
        
        Lampada.ligarLampada();
        Lampada.mostrarEstado();
        Lampada.desligarLampada();
        Lampada.mostrarEstado();
        Lampada.mudarEstado();
        Lampada.mostrarEstado();
    }
}
