import java.util.ArrayList;

public class Grupo extends EtapaMundial{
    private ArrayList<Equipo> EquiposQueAvanzan;


    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return EquiposQueAvanzan;
    }


    public Grupo(String descripcionEtapa, ArrayList<Partido> partidos, ArrayList<Equipo> equiposQueAvanzan) {
        super(descripcionEtapa, partidos, equiposQueAvanzan);
    }


    @Override
    public String toString() {
        return "Grupo [EquiposQueAvanzan=" + EquiposQueAvanzan + "]";
    }

}
