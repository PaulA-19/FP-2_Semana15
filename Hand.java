
public class Hand extends GroupOfCards {

	public int obneterNumCarta(int indice) {
		return cartas.get(indice).getNumero();
	}

	public Cards juagrPrimeraCartaEliminar() {
		DisminuirTamaño();
		return cartas.remove(0);
	}

	public Cards juagrCartaPosicionEliminar(int num) {
		DisminuirTamaño();
		return cartas.remove(num);
	}

	public void añadirCartasJugada(CadsWars guerra) {
		for (Cards cards : guerra.getCartas()) {
			this.addCards(cards);
		}
		guerra.getCartas().clear();
		guerra.setTamañoActual(0);

	}

}
