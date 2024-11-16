package info.patrickmaciel;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // TODO: entender porque não é recomendado usar a Classe e sim o tipo primitivo
    int numero;
    String agencia;
    String nomeCliente;
    // TODO: entender porque não é recomendado usar a Classe e sim o tipo primitivo
    double saldo;

    System.out.println("Bem-vindo a sua agência digital!");

    System.out.print("Digite o número da sua conta: ");
    numero = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Digite o nome da sua agência: ");
    agencia = scanner.nextLine();

    System.out.print("Digite o seu nome completo: ");
    nomeCliente = scanner.nextLine();

    System.out.print("Digite o saldo da sua conta: ");
    saldo = scanner.nextDouble();
    scanner.nextLine();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
  }
}
