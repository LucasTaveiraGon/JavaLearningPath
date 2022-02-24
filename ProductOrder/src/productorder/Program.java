/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productorder;


import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lutagon
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();
        System.out.println();
        System.out.println(product);
        System.out.println();
        
        System.out.print("Enter the number of products to be add in Stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println(product);
        
           System.out.println();
        
        System.out.print("Enter the number of products to be remove in Stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println(product);

        sc.close();
    }
    
}
