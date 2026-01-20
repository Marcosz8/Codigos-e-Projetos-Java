import java.util.Locale;
import java.util.Scanner;

public class Exe08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Quantos elementos vai ter o vetor? ");
        
        int n  =sc.nextInt();
        double somaN = 0;
        double media = 0;
        int cont = 0;

        int [] numeros = new int[n];

        for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        numeros[i] = sc.nextInt();
            
        }
        for (int i=0; i<n; i++) {
            if (numeros[i] % 2 == 0) {
                somaN = somaN + numeros[i];
                cont++;
            }              
        }
        
        media = somaN / cont;

        if (media != 0) {            
            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
            }
        else{
            System.out.print("NENHUM NUMERO PAR ");
        }
        
        sc.close();
    }
}
