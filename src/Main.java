import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();

		bank.addTeller(new Teller(1));
		bank.addTeller(new Teller(2));
		bank.addTeller(new Teller(3));
		bank.addTeller(new Teller(4));
		bank.addTeller(new Teller(5));
		bank.addTeller(new Teller(6));
		bank.addTeller(new Teller(7));
		bank.addTeller(new Teller(8));
		bank.addTeller(new Teller(9));
		bank.addTeller(new Teller(10));

		Scanner scanner = new Scanner(System.in);
		String option = "";
		String client_name;
		int client_age;
		int teller_number;

		while (!option.equals("3")) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Registrar cliente");
			System.out.println("2 - Solicitar próximo cliente");
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