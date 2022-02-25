/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeelist;
import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class EmployeeList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Locale.setDefault(Locale.US );
        Scanner sc = new Scanner(System.in);
        
        List<Employee> list = new ArrayList<>();
        
        System.out.println("How many employees will be registered?  ");
        int n = sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            System.out.println();
            System.out.println("Employee #"+i+ ": ");
            
            System.out.println("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken. Try again: ");
                id = sc.nextInt();
                
            }
            
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
            
        }
        System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
        sc.close();
    }

    private static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
    
}
