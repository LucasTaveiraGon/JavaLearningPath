/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author lutagon
 */


import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

          Employee emp = new Employee();
          
         System.out.print("Name: ");

         emp.name = sc.nextLine();
         System.out.print("Gross salary: ");
          emp.grossSalary = sc.nextDouble();
          System.out.print("Tax: ");
          emp.tax = sc.nextDouble();
        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percent = sc.nextDouble();
        emp.increaseSalary(percent);
        System.out.println();
        System.out.println("Updated data: " + emp);
        
        sc.close();
    } 
}
    

