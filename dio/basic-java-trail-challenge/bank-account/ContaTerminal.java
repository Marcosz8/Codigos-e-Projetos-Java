import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        // Locale para formatação de números com ponto decimal
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Declaração das variáveis
        int numero;
        double saldo;
        String agencia,nomeCliente;

        // Captura a data e hora atual e formtação personalizada
        LocalDateTime dataHora = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");        
        
        // Solicita os dados ao usuário
        System.out.println("Por favor, digite o número da agência:");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da conta:");
        numero = sc.nextInt(); 
        sc.nextLine(); // Consumir a quebra de linha pendente      
        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o saldo da conta:");
        saldo = sc.nextDouble();
        
        // Exibe a mensagem de boas-vindas com os dados fornecidos
        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + String.format("%.2f", saldo) + " já está disponível para saque.");
        System.out.println("Data e hora do acesso: " + dataHora.format(fmt));

        sc.close();
    }
}
