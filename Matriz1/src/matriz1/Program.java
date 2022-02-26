/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz1;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da matriz ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Main Diagonal: ");
        
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i]+" ");
        }
        System.out.println();
        
        int count = 0;
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;    
                }
            }
           
        }
        System.out.println("Negative numbers = "+count);
        
        sc.close();
    }
    
}
