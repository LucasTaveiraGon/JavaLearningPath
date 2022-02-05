/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author lucas
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 15; 
        int n2 = 43; 
        int r = (n1 > n2) ? n1:n2;
        int ex2 = (n1 > n2) ? n1-n2:n1+n2;
        System.out.println(r);
        System.out.println(ex2);
      
    }
    
}
