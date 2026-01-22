package application;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Variáveis que receberam indices i das linhas e j das colunas
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int n = sc.nextInt();

        int[][] mat = new int[m][n]; 

        System.out.println("Enter the numbers below:");

        // for que vai criar o vetor personalizado
        for (int i = 0; i < m; i++) { // for para preencher as linhas 
            for (int j = 0; j < n; j++) { // for para preencher as colunas
                mat[i][j] = sc.nextInt(); // comando para preencher a matriz
            }
        }

        System.out.println("Enter the number to search for its neighbors:");
        int x = sc.nextInt(); // entrada do valor que será pesquisado na matiz

        // for para ler a matiz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) { // condição de que a combinação dos indices i e j tenha o valor de x
                    
                    System.out.println("Position : " + i + " , " + j);
                    // Condição de que j seja maior que 0 para descobrir o valor a esquerda de x 
                    if (j > 0) {
                        // Condição aceita se mantém o indice da linha i e subtrai 1 para encontrar o número a esquerda na coluna j 
                        System.out.println("Left: " + mat[i][j - 1]); 
                    }
                    // Condição de que j não seja maior que o último indice de colunas da matiz  
                    if (j < mat[i].length - 1) {

                        // Condição aceita se mantém o indice da linha de i e adiciona 1 para encontra o número a direita na coluna j 
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    // Condição de que i seja maior que 0 para descobrir o valor a acima de x 
                    if (i > 0) {
                        // Condição aceita se mantém o indice da coluna j e adiciona 1 para encontrar o número da linha i acima
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    // Condição de que i não seja maior que o último indice de linhas da matiz 
                    if (i < mat.length - 1) {
                        // Condição aceita se mantém o indice da linha de j e adiciona 1 para encontra o número da linha i abaixo
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        
        }

        sc.close();
    }
}
