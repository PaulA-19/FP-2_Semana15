
public class Cards {
	private static int valor = 1;
	private int numero;
	private String palo = "";

	public void mostrar() {
		System.out.println("El valor de la carta es: " + numero);
	}

	public Cards() {
		this.numero = valor;
//		this.palo = palo;
		aumentarValor();

	}

	public Cards(int numero, String palo) {
		this.numero = valor;
		this.palo = palo;
		aumentarValor();

	}

	private static void aumentarValor() {
		if (valor == 13) {
			valor = 1;
		} else {
			valor++;
		}
	}

	@Override
	public String toString() {
		return "Cards [numero=" + numero + ", palo=" + palo + "]";
	}

}
