public class Game {

	private Deck baraja = new Deck();
	private Hand gamer1 = new Hand();
	private Hand gamer2 = new Hand();
	private CadsWars guerra = new CadsWars();

	public void prepararCartas() {

		baraja.barajear();
		baraja.repartir(gamer1, gamer2);

		status(-1);
	}

	public void status(int i) {

		System.out.println("\n------NUEVA RONDA-----\nPasada " + i);
		System.out.println("Tamaño actual 1 : " + gamer1.getTamañoActual());

		System.out.println("Tamaño actual 2: " + gamer2.getTamañoActual() + "\n----------------------");

	}

	public void ganador() {
		if (gamer1.tamañoActual == 0) {
			System.out.println("\nEL GANADOR ES EL JUGADOR NUMERO 2\n FELICITACIONES!!! ... ");

		} else {
			System.out.println("\nEL GANADOR ES EL JUGADOR NUMERO 1\n FELICITACIONES!!! ... ");
		}
	}

	public void playAGame() {
		int i = 1;
		do {

			Cards carta1 = gamer1.juagrPrimeraCartaEliminar();
			guerra.addCards(carta1);
			Cards carta2 = gamer2.juagrPrimeraCartaEliminar();
			guerra.addCards(carta2);
			status(i);

			System.out.println("Numero de cartas en juego: " + guerra.getTamañoActual());

			System.out.println("Carta jugador 1: " + carta1.getNumero());
			System.out.println("Carta jugador 2: " + carta2.getNumero());
			if (carta1.getNumero() > carta2.getNumero()) {

				System.out.println("Gana el jugador 1 ");
				gamer1.añadirCartasJugada(guerra);
			} else if (carta1.getNumero() < carta2.getNumero()) {

				System.out.println("Gana el jugador 2: ");
				gamer2.añadirCartasJugada(guerra);
			} else {
				System.out.println("BATALA!!! .... ");
				batalla();
			}
			i++;

		} while (!isFinJuego());
		ganador();

	}

	public boolean isFinJuego() {
		return ((gamer1.tamañoActual == 0) || (gamer2.tamañoActual == 0));
	}

	public void batalla() {
		if (gamer1.tamañoActual <= 3 && gamer2.tamañoActual > 3) {
			for (int i = 0; i < gamer1.tamañoActual - 1; i++) {
				guerra.addCards(gamer1.juagrPrimeraCartaEliminar());
			}
			for (int i = 0; i < 3; i++) {
				guerra.addCards(gamer2.juagrPrimeraCartaEliminar());
			}
		} else if (gamer2.tamañoActual <= 3 && gamer1.tamañoActual > 3) {
			for (int i = 0; i < gamer2.tamañoActual - 1; i++) {
				guerra.addCards(gamer2.juagrPrimeraCartaEliminar());
			}
			for (int i = 0; i < 3; i++) {
				guerra.addCards(gamer1.juagrPrimeraCartaEliminar());
			}
		} else if (gamer1.tamañoActual <= 3 && gamer2.tamañoActual <= 3) {
			for (int i = 0; i < gamer1.tamañoActual - 1; i++) {
				guerra.addCards(gamer1.juagrPrimeraCartaEliminar());
			}
			for (int i = 0; i < gamer2.tamañoActual - 1; i++) {
				guerra.addCards(gamer2.juagrPrimeraCartaEliminar());
			}
		}

		else {
			for (int i = 0; i < 3; i++) {
				guerra.addCards(gamer1.juagrPrimeraCartaEliminar());
				guerra.addCards(gamer2.juagrPrimeraCartaEliminar());
			}
		}

	}
}
