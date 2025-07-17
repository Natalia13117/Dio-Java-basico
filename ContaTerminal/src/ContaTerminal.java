import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       System.out.println("Olá, para seguirmos com a abertura da sua conta precisamos de algumas informações");
       System.out.print("Qual seu nome e sobrenome?");
       String nomeCliente = scanner.nextLine();
       System.out.print("Por favor, Qual numéro da sua agência? ");
       int numeroAgencia = scanner.nextInt();
       System.out.print("Por favor, qual o número da sua conta?");
       int numeroConta = scanner.nextInt();
       System.out.print("Qual o valor do seu primeiro depósito?");
       double saldoConta = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque!",
                nomeCliente, numeroAgencia, numeroConta, saldoConta);
         {
        }


        }
    }
