/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota 1");
        float n1 = teclado.nextFloat(); 
        System.out.println("Digite a nota 2");
        float n2 = teclado.nextFloat();
        double media = (n1 +n2) / 2;
        System.out.println("Sua media foi: " +media);
        if (media >= 9 ) {
            System.out.println("Parabéns");
            
        }
        
        
        
        // TODO code application logic here
    }
    
}
