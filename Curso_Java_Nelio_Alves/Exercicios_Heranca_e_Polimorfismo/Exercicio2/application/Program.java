package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Array para armazenar os objetos
        List<TaxPayer> list = new ArrayList<TaxPayer>(); 
        
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        // Laço for para inserir as informações no menu
        for (int i = 1; i <= n; i++) { 
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anuaDouble = sc.nextDouble();
            //Se a condição for 1 aplica as regras abaixo se não pula para as proximas
            if(type == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name,anuaDouble,healthExpenditures));
            }else{
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anuaDouble, numberOfEmployees));
            }
        } 
        // Exibe o resultado na tela com um laço for para repassar as informações dos obejtos do Array
        System.out.println("TAXES PAID:");
        double total = 0.0;
        for(TaxPayer taxPayer : list){
            System.out.println(taxPayer.getName() + ": $ "+ String.format("%.2f", taxPayer.tax()));
            total += taxPayer.tax();
            } 

        System.out.println("TOTAL TAXES: $ "+ String.format("%.2f", total));        
        
        sc.close();
    }
}
