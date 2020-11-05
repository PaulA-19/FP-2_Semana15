import java.util.ArrayList;
import java.util.Random;

public class Deck extends GroupOfCards {

	public void repartir(Hand ju1, Hand ju2) {
		for (int i = 0; i < cartas.size(); i += 2) {
			ju1.addCards(cartas.get(i));
			ju2.addCards(cartas.get(i + 1));
		}
	}

	public Deck() {
		//52
		for (int i = 0; i < 52; i++) {

			this.addNewCard();
		}
	}
	public Deck(int cantidad) {
		for (int i = 0; i < cantidad; i++) {

			this.addNewCard();
		}
	}

	public void barajear() {
		Random rd = new Random();
		ArrayList<Cards> temporal = new ArrayList<Cards>();
		int tamaño = cartas.size();
		for (int i = 0; i < tamaño; i++) {
			int aleatorio = rd.nextInt(cartas.size());
			temporal.add(cartas.get(aleatorio));
			cartas.remove(aleatorio);
		}
		cartas = temporal;
	}
}
