/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javarepeat;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class JavaRepeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: (0 interrompe)"));
            JOptionPane.showMessageDialog(null,"O numero digitado é: " + n);
        } while (n !=0);
    }
}
