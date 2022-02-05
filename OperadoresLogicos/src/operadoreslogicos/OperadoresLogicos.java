/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author lucas
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x ,y, z;
        x = 14;
        y = 22;
        z = 11;
        boolean res = (x<y && y>z)? true:false;
        /* 
          boolean res = (x<y || y>z)? true:false;
          boolean res = (x<y ^ y>z)? true:false;
          boolean res = (x<y != y>z)? true:false;
        
        */
        System.out.println(res);
    }
    
}
