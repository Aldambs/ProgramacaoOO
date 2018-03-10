package pooAula;

import java.util.Scanner;

public class medTurma {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       float nota, soma = 0, med;
       int cont = 0;
       System.out.println("Informe a nota: ");
       nota = ler.nextFloat();
       while(nota > -1){          
           soma = soma + nota;
           cont++;
           System.out.println("Informe a nota: ");
           nota = ler.nextFloat();
       }
       med = soma / cont;
       System.out.println("A média é = " +med);
    }
    
}
