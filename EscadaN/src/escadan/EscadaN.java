package escadan;
import java.util.Scanner;


/**
 *
 * @author lucas
 */
public class EscadaN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.println("Insira um numero e vamos fazer uma escadinha :) ");
        
        int n = tec.nextInt();
        int i, j;
        for (i=0; i<=n; i++){  
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print(' ');
    }
}
