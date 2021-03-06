import java.util.*;

public class GroupOfCards {
	protected ArrayList<Cards> cartas = new ArrayList<Cards>();
	protected int tamañoActual = 0;

	public void addNewCard() {
		cartas.add(new Cards());
		aumentarTamaño();
	}
	public void addCards(Cards carta) {
		cartas.add(carta);
		aumentarTamaño();

	}


	public GroupOfCards() {

	}


	public int mostrarNumCartaIndice(int indice) {
		return cartas.get(indice).getNumero();
	}

	public GroupOfCards(ArrayList<Cards> cartas, int tamañoActual) {
		this.cartas = cartas;
		this.tamañoActual = tamañoActual;
	}

	public ArrayList<Cards> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Cards> cartas) {
		this.cartas = cartas;
	}

	public int getTamañoActual() {
		return tamañoActual;
	}
	public void setTamañoActual(int tammañoActual) {
		this.tamañoActual = tammañoActual;
	}

	public void aumentarTamaño() {
		tamañoActual++;
	}
	public void DisminuirTamaño() {
		tamañoActual--;
	}
	
	public void mostrarCartas() {
		for (Cards cards : cartas) {
			System.out.println(cards);
		}
	}


}
