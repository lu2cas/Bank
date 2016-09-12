import java.util.LinkedList;

public class Bank {

	private LinkedList<Client> clients;
	private LinkedList<Teller> tellers;

	public Bank() {
		this.clients = new LinkedList<Client>();
		this.tellers = new LinkedList<Teller>();

		this.addTeller(new Teller(1));
		this.addTeller(new Teller(2));
		this.addTeller(new Teller(3));
		this.addTeller(new Teller(4));
		this.addTeller(new Teller(5));
		this.addTeller(new Teller(6));
		this.addTeller(new Teller(7));
		this.addTeller(new Teller(8));
		this.addTeller(new Teller(9));
		this.addTeller(new Teller(10));
	}

	public boolean addClient(Client client) {
		return this.clients.add(client);
	}

	public boolean addTeller(Teller teller) {
		return this.tellers.add(teller);
	}

	public LinkedList<Client> getClients() {
		return this.clients;
	}

	public LinkedList<Teller> getTellers() {
		return this.tellers;
	}
}