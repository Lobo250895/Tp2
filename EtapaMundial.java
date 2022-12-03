import java.util.ArrayList;
public class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido>partidos;
    private ArrayList<Equipo>EquiposQueAvanzan;


    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }
    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }
    public ArrayList<Partido> getPartidos() {
        return partidos;
    }
    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return EquiposQueAvanzan;
    }
    public void setEquiposQueAvanzan(ArrayList<Equipo> equiposQueAvanzan) {
        EquiposQueAvanzan = equiposQueAvanzan;
    }

    public EtapaMundial(String descripcionEtapa, ArrayList<Partido> partidos, ArrayList<Equipo> equiposQueAvanzan) {
        super();
        this.descripcionEtapa = descripcionEtapa;
        this.partidos = partidos;
        EquiposQueAvanzan = equiposQueAvanzan;
    }

    @Override
    public String toString() {
        return "EtapaMundial [descripcionEtapa=" + descripcionEtapa + ", partidos=" + partidos + ", EquiposQueAvanzan="
                + EquiposQueAvanzan + "]";
    }


}
