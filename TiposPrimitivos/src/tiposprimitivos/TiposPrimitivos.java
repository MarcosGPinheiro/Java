/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;
/**
 *
 * @author Marcos
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Informar o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Informar a nota do " + nome + ": ");
        float nota = teclado.nextFloat();
        System.out.println("A nota é " + nota);
        System.out.printf("A nota do %s é %.2f \n", nome, nota);
        System.out.format("A nota do %s é %.3f \n", nome, nota);
    }
    
}
