import java.util.LinkedList;

public class Bank {

	private LinkedList<Client> clients;
	private LinkedList<Teller> tellers;

	public Bank() {
		this.clients = new LinkedList<Client>();
		this.tellers = new LinkedList<Teller>();
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