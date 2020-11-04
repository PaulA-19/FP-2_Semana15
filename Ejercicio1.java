
public class Ejercicio1 {

	public static void main(String[] args) {
		Deck g1 = new Deck();

		for (int i = 0; i < 52; i++) {
			g1.addCards();
			System.out.println("Tamaño actual: " + g1.getTamañoActual());
		}
		for (Cards card : g1.getCartas()) {
			System.out.println(card);

		}
		g1.barajear();
		System.out.println("barajeado");
		for (Cards card : g1.getCartas()) {
			System.out.println(card);

		}
		Hand jugador1 = new Hand();
		Hand jugador2 = new Hand();

		g1.repartir(jugador1, jugador2);
		System.out.println("Juagor 1");
		jugador1.mostrarCartas();
		System.out.println("Jugador 2");

		jugador2.mostrarCartas();
		
	}
}
