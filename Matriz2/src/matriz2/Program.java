/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz2;

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
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        int x = sc.nextInt();
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("POSITION " +i+ "," +j+":");
                    if (j > 0) {
                        System.out.println("Left: "+ mat[i][j-1]);
                        
                    }
                   
                    if (i > 0) {
			System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
			System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
			System.out.println("Down: " + mat[i+1][j]);
                    }
		}
            }
	}
		
	sc.close();
    }
}