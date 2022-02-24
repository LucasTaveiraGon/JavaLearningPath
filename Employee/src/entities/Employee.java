/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author lutagon
 */
public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    
    public double netSalary(){
        return grossSalary - tax;
    } 
    public void increaseSalary(double percent){
        grossSalary += grossSalary * percent / 100 ;
    }
    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
    
}
