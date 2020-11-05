import java.sql.Array;
import java.util.*;

public class CadsWars extends GroupOfCards {
    public void añadirConjuntoCartas(ArrayList<Cards> cartas) {
        for (Cards cards : cartas) {

            addCards(cards);
            DisminuirTamaño();
        }
    }
    // ojo
}
