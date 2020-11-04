import java.util.*;

public class GroupOfCards {
	private ArrayList<Cards> cartas = new ArrayList<Cards>();
	private int tamañoActual = 0;

	public void addCards() {
		cartas.add(new Cards());
		tamañoActual++;
	}

	public GroupOfCards() {

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

	public void setTamañoActual(int tamañoActual) {
		this.tamañoActual = tamañoActual;
	}
	
	

}
