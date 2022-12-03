import java.util.ArrayList;

public class Grupo extends EtapaMundial{
    private ArrayList<Equipo> EquiposQueAvanzan;

    public Grupo(String descripcionEtapa, ArrayList<Partido> partidos, ArrayList<Equipo> equiposQueAvanzan,
                 ArrayList<Equipo> equiposQueAvanzan2) {
        super(descripcionEtapa, partidos, equiposQueAvanzan);
        EquiposQueAvanzan = equiposQueAvanzan2;
    }

    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return EquiposQueAvanzan;
    }

    @Override
    public String toString() {
        return "Grupo [EquiposQueAvanzan=" + EquiposQueAvanzan + "]";
    }
}
