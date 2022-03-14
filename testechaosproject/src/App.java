import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0E00");    // Formato

		Double valorDouble =  leitor.nextDouble();
		System.out.println(df.format(valorDouble));

		leitor.close();
	}
}

