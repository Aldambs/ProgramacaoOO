package pooAula;

import java.util.Scanner;

public class jogoVelha {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char jogoVelha[][] = new char [3][3];
        char sinal;
        int linha = 0, coluna = 0;
        System.out.println("Jogador1 = x");
        System.out.println("Jogador2 = o");
        
        boolean ganhou = false;
        int jogada = 1;
        
        while(!ganhou){
            if(jogada % 2 == 1){ //jogador 1
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1 - 3).");
                sinal = 'x';
            }else{
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1 - 3).");
                sinal = 'o';
            }
            
            boolean linhaValida = false;
            while(!linhaValida){
                System.out.println("Entre com a linha 1, 2 ou 3: ");
                linha = ler.nextInt();
                if(linha >= 1 && linha <= 3){
                    linhaValida = true;
                }else{
                    System.out.println("Entrada inválida! Tente novamente!");
                }
            }
            boolean colunaValida = false;
            while(!colunaValida){
                System.out.println("Entre com a coluna 1, 2 ou 3: ");
                coluna = ler.nextInt();
                if(coluna >= 1 && coluna <= 3){
                    colunaValida = true;
                }else{
                    System.out.println("Entrada inválida! Tente novamente!");
                }            
            }
            linha--;
            coluna--;
            if (jogoVelha[linha][coluna] == 'x' || jogoVelha[linha][coluna] == 'o') {
                System.out.println("");
            } else {//jogada invalida
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }
            //imprimir tabuleiro
            for (int i = 0; i < jogoVelha.length; i++) {
                for (int j = 0; j < jogoVelha[i].length; j++) {
                    System.out.print(jogoVelha[i][j]+ " | ");
                }
                System.out.println();
            }
            //verifica se tem jogador
            if((jogoVelha[0][0] == 'x' && jogoVelha[0][1] == 'x' && jogoVelha[0][2] == 'x') ||//linha 1
                    (jogoVelha[1][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[1][2] == 'x')||//linha 2
                    (jogoVelha[2][0] == 'x' && jogoVelha[2][1] == 'x' && jogoVelha[2][2] == 'x')||//linha 3
                    (jogoVelha[0][0] == 'x' && jogoVelha[1][0] == 'x' && jogoVelha[2][0] == 'x')||//coluna 1
                    (jogoVelha[0][1] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][1] == 'x')||//coluna 2
                    (jogoVelha[0][2] == 'x' && jogoVelha[1][2] == 'x' && jogoVelha[2][1] == 'x')||//coluna 3
                    (jogoVelha[0][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][2] == 'x')||//diagonal
                    (jogoVelha[0][2] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][0] == 'x')){  //diagonal inversa
                ganhou = true;
                System.out.println("Parabéns jogador 1");
            }else{
                if((jogoVelha[0][0] == 'o' && jogoVelha[0][1] == 'o' && jogoVelha[0][2] == 'o') ||//linha 1
                    (jogoVelha[1][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[1][2] == 'o')||//linha 2
                    (jogoVelha[2][0] == 'o' && jogoVelha[2][1] == 'o' && jogoVelha[2][2] == 'o')||//linha 3
                    (jogoVelha[0][0] == 'o' && jogoVelha[1][0] == 'o' && jogoVelha[2][0] == 'o')||//coluna 1
                    (jogoVelha[0][1] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][1] == 'o')||//coluna 2
                    (jogoVelha[0][2] == 'o' && jogoVelha[1][2] == 'o' && jogoVelha[2][1] == 'o')||//coluna 3
                    (jogoVelha[0][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][2] == 'o')||//diagonal
                    (jogoVelha[0][2] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][0] == 'o')){  //diagonal inversa
                    ganhou = true;
                    System.out.println("Parabéns jogador 2");
                }else{
                    if(jogada > 9){
                        ganhou = true;
                        System.out.println("Ninguém ganhou essa partida");
                    }
                }
            }
        }

    }
}
