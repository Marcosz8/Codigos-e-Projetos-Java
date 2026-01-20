import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
     
        int n, tPares;

        System.out.print("Quantos numeros você vai digitar ? ");
        n = sc.nextInt();

        int [] numeros = new int[n];

        for (int i = 0; i < n; i++ ) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        tPares = 0;
        System.out.println("NUMEROS PARES : ");
        for (int i=0; i<n; i++){
            if (numeros[i] % 2 == 0) {
               System.out.printf("%d  ", numeros[i]);
               tPares ++;
                          
	    }  
                   
        }
        System.out.println();
        System.out.print("Quantidade de pares =  " + tPares);

        sc.close();

    }
}
