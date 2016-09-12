import java.util.LinkedList;

public class Teller {

	private int number;
	private boolean free;

	public Teller(int number) {
		this.number = number;
		this.free = true;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree() {
		this.free = true;
	}

	public void attendClient(LinkedList<Client> clients) {
		int size = clients.size();
		this.free = false;
		boolean elderly_detected = false;
		if (this.number >= 1 && this.number <= 5) {
			// Caixa prioritário
			for (int c = 0; c < size; c++) {
				if (clients.get(c).getAge() >= 65) {
					elderly_detected = true;
					clients.remove(c);
					break;
				}
			}
			if (!elderly_detected) {
				clients.remove(0);
			}
		} else {
			clients.remove(0);
		}
	}
}