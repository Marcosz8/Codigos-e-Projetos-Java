import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        int maisVelha, indice;
        
        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i=0; i<n; i++){
            System.out.printf("Dados da %da pessoa:\n ", i + 1 );
            System.out.print("Nome : " );
            sc.nextLine();
            nome[i] = sc.next();
            System.out.print("Idade : " );
            idade[i] = sc.nextInt();
        }

        maisVelha = idade[0];
        indice = 0;

        for (int i=0; i<n; i++){
            if(idade[i] > maisVelha){
                maisVelha = idade[i];
                indice = i;
            }
            
        }

        System.out.print("PESSOA MAIS VELHA: " + nome[indice]);
        sc.close();
    }
}
