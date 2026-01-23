import java.util.Locale;
import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar ? ");
        int n = sc.nextInt();
        double valor;
        int indice = 0;
                
        double [] numeros = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        numeros[i] = sc.nextDouble();
	    }

        valor = numeros[0];

        for (int i=0; i<n; i++) {
            if(numeros[i] > valor){
                valor = numeros[i];
                indice = i;
            }
        }

	    System.out.printf("MAIOR VALOR = %.1f\n", valor);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", indice);

        sc.close();
    }
}
