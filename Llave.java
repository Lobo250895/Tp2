import java.util.ArrayList;

public class Llave extends EtapaMundial {
    private ArrayList<Equipo> EquiposQueAvanzan;

    public Llave(String descripcionEtapa, ArrayList<Partido> partidos, ArrayList<Equipo> equiposQueAvanzan,
                 ArrayList<Equipo> equiposQueAvanzan2) {
        super(descripcionEtapa, partidos, equiposQueAvanzan);
        EquiposQueAvanzan = equiposQueAvanzan2;
    }

    @Override
    public String toString() {
        return "Llave [EquiposQueAvanzan=" + EquiposQueAvanzan + "]";
    }
}
