package contaBancaria;

import java.util.Scanner;

public class ContaBancaria {
	public static void main(String[] args) {

		System.out.println(
				"Seja bem vindo ao sistema de cadastro de clientes do banco delta, por favor nos informe os seguintes dados:");

		System.out.println("Por favor nos informe seu nome");

		ContaBanco conta01 = new ContaBanco();

		Scanner scannername = new Scanner(System.in);

		conta01.nomeCliente = scannername.nextLine();

		System.out.println("Seja bem vindo " + conta01.nomeCliente);

		System.out.println("Agora nos informe seu sobrenome: ");

		Scanner scannerlastname = new Scanner(System.in);

		conta01.sobrenomeCliente = scannerlastname.nextLine();

		conta01.numeroConta = 0001;
		conta01.numeroAgencia = "0-001";
		conta01.numeroContaString = String.format("%04d", conta01.numeroConta);

		System.out.println("Seja bem vindo " + conta01.nomeCliente + " " + conta01.sobrenomeCliente
				+ " o seu numero de conta será: " + conta01.numeroContaString + " e sua agencia será: "
				+ conta01.numeroAgencia);

		conta01.saldoBanco = 00;

		System.out.println("Seu saldo atual é igual a " + "R$" + conta01.saldoBanco);

		System.out.println("O que deseja fazer: ");
		System.out.println("1 - Sacar");
		System.out.println("2 - Depositar");
		Scanner comando = new Scanner(System.in);
		int comandotemp = comando.nextInt();

		if (comandotemp == 1) {
			System.out.println("digite o valor do saque em R$: ");
			Scanner saque = new Scanner(System.in);
			int saquetemp = saque.nextInt();
			conta01.sacarSaldo(saquetemp);
			System.out.println("Saque de: R$ " + saquetemp + " Realizado com sucesso");
		} else if (comandotemp == 2) {

			System.out.println("digite o valor do depósito em R$: ");
			Scanner deposito = new Scanner(System.in);
			int deptemp = deposito.nextInt();
			conta01.depositarSaldo(deptemp);
			System.out.println("Depósito de: R$ " + deptemp + " Realizado com sucesso");
		}
	}

	// @Test
	// void addition() {
	// assertEquals(2, 1 + 1);
	// }
}