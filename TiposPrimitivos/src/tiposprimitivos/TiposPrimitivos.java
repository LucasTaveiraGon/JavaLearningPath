/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author lucas
 */

public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite O nome do Aluno");
        String nome = teclado.nextLine()    ;
        float nota = 8.5777777676f;
        System.out.printf("A nota de %s é \n %.2f \n", nome ,nota);
        
        int idade = 35;
        String valor = Integer.toString(idade);
        System.out.printf("A idade de %s \n é %s \n ",nome ,valor);
        
        // TODO code application logic here
    }
    
}
