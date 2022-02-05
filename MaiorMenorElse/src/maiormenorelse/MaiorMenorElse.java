/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maiormenorelse;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class MaiorMenorElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Digite o ano do seu nascimento");
        int nasc = scanner.nextInt();
        nasc = year - nasc;
        System.out.println("A sua idade é: "+nasc);
        if (nasc >=18) {
            System.out.println("É Maior");
        }else{
            System.out.println("É Menor");
        }
    }
    
}
