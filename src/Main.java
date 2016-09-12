import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner scanner = new Scanner(System.in);
		String option = "";
		String client_name;
		int client_age;
		int teller_number;
		

		while (!option.equals("3")) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Registrar cliente");
			System.out.println("2 - Solictar próximo cliente");
			System.out.println("3 - Sair");

			option = scanner.next();

			switch (option) {
				case "1":
					System.out.print("Nome do cliente: ");
					client_name = scanner.next();
					System.out.print("Idade do cliente: ");
					client_age = scanner.nextInt();
					bank.addClient(new Client(client_name, client_age));
					break;
				case "2":
					System.out.print("Número do caixa: ");
					teller_number = scanner.nextInt();
					bank.getTellers().get(teller_number).attendClient(bank.getClients());
					break;
			} 
		}

	}
}