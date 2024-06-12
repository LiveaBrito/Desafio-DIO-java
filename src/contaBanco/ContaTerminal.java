package contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		
		//TODO: Conhecer e importar a classe Scanner
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		//Exibir a mensagem para o usu�rio na tela do terminal
		System.out.println("**************************************");
		System.out.println("      Criando a Conta no Banco");
		System.out.println("**************************************");
		
		System.out.println("\nPor favor, digite o numero da Ag�ncia: ");
		int numeroAgencia = scanner.nextInt();
		
		System.out.println("Digite o nome da Ag�ncia: ");
		String agencia = scanner.next();
		
		System.out.println("Digite seu Nome: ");
		String nomeCliente = scanner.next();
		
		System.out.println("Digite seu Sobrenome: ");
		String sobrenomeCliente = scanner.next();
		
		//concatenando o nome e o sobrenome
		String concatenada = nomeCliente.concat(" " ).concat(sobrenomeCliente);
		
		System.out.println("Digite o saldo da conta: ");
		double saldoConta = scanner.nextDouble();
				
		//Obtendo e retornando na tela os valores digitados no terminal da conta criada.
		System.out.println("\n");
		System.out.println("Ol�"+ " " + concatenada + ", " + "obrigada por criar uma conta em nosso banco.");
		System.out.println("Sua Ag�ncia �: " + agencia + ", " + "Conta: " + numeroAgencia + ", " + "e seu saldo de: " + saldoConta + " " + "j� est� dispon�vel para saque.");
		
		System.out.println("\n");
		System.out.println("Agradecemos a Confian�a!");
		

	}

}
