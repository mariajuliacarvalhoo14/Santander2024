import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int numeroConta;
        //char agencia;
        //char nome;
        //float saldo;
        
        System.out.println("\nPor favor, digite o número da Agência !\n");
        String agencia = scanner.nextLine();
        System.out.println("\nVocê digitou: \n" + agencia);
        
        System.out.println("\nPor favor, digite o número da da sua conta !\n");
        int numeroConta  = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\nVocê digitou: \n" + numeroConta);
        
        System.out.println("\nPor favor, digite o seu nome completo!\n");
        String nome = scanner.nextLine();
        System.out.println("\nVocê digitou: \n" + nome);

        System.out.print("\nDigite o valor do saldo: \n");
        double saldo = scanner.nextDouble();
        System.out.println("\nVocê digitou: \n" + saldo);

       System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+ " com conta de número: " +numeroConta+" e seu saldo " +saldo+ " já está disponível para saque \n");

       scanner.close();

    }

}
