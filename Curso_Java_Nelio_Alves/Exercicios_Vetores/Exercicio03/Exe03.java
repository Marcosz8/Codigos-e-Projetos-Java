import java.util.Locale;
import java.util.Scanner;

public class Exe03 {
   
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner  sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas serão digitadas ?");
        int p = sc.nextInt();

        double alturaTotal, alturaMedia, percentualMenores; 
        int nMenores;
                        
        String[] nome = new String[p];
        int[] idade = new int[p];
        double[] altura = new double[p];

        for (int i=0; i<p; i++){
            System.out.printf("Dados da %da pessoa:\n ", i + 1 );
            System.out.print("Nome : " );
            sc.nextLine();
            nome[i] = sc.next();
            System.out.print("Idade : " );
            idade[i] = sc.nextInt();
            System.out.print("Altura : " );
            altura[i] = sc.nextDouble();
            
        } 

        nMenores = 0;
        alturaTotal = 0;
        for (int i=0; i<p; i++){
            if (idade[i]<16) {
                nMenores++;
            }
            alturaTotal = alturaTotal + altura[i]; 
        }

        alturaMedia = alturaTotal / p;
        percentualMenores = ((double)nMenores/p)*100.0;

       
        System.out.printf("\n Altura média: = %.2f  ", alturaMedia );
        System.out.println();
        System.out.printf("Pessoas com menos de 16 anos:  %.1f%%\n", percentualMenores);
        
        for (int i=0; i<p; i++){
            if (idade[i]<16) {
                System.out.printf("%s\n",nome[i]);
            }
        }
  
        sc.close();
    }
}
