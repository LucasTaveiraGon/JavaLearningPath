/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
        
        String path = "C:\\Users\\lucas\\OneDrive - SOCIEDADE ANHANGUERA DE ENSINO LTDA\\Coisas da facul\\JAVA\\JAVA PROJECTS\\TestesReader\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try
        {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            
            String line = br.readLine();
            while (line != null)
            {
                System.out.println(line);
                line = br.readLine();
            }
            
        } catch (IOException e)
        {
            System.out.println("Error: " +e.getMessage());
        }finally{
            try
            {
                if (br != null )
                {
                    br.close();
                }
                if (fr !=null)
                {
                    fr.close();
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    
    }
    
}
