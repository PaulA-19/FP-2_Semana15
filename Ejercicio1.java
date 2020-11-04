
public class Ejercicio1 {

	public static void main(String[] args) {
		GroupOfCards g1 = new GroupOfCards();
		
		for (int i = 0; i < 14; i++) {
			g1.addCards();
			System.out.println("Tamaño actual: "+g1.getTamañoActual());
		}
		for (Cards card : g1.getCartas()) {
			System.out.println(card);
			
			
		}
	}
}
