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

    public EtapaMundial() {
        super();
        this.partidos= new ArrayList<Partido>();
        this.EquiposQueAvanzan = new ArrayList<Equipo>();
    }


    @Override
    public String toString() {
        return "EtapaMundial [descripcionEtapa=" + descripcionEtapa + ", partidos=" + partidos + ", EquiposQueAvanzan="
                + EquiposQueAvanzan + "]";
    }

    public void addPartido(Partido partido) {
        this.partidos.add(partido);
    }

    public void addEquiposQueAvanzan(Equipo equipo) {
        this.EquiposQueAvanzan.add(equipo);
    }

    public ArrayList<Equipo>EquiposQueAvanzan(){
        return EquiposQueAvanzan;
    }


}
