import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Partido>partidosJugados;
    private int partidosGanadosporGrupo;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(String nombre){
        this.nombre = nombre;
        this.partidosJugados = new ArrayList<Partido>();
        this.partidosGanadosporGrupo = 0;
    }

    public Equipo(String nombre, ArrayList<Partido> partidosJugados) {
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
        this.partidosGanadosporGrupo = 0;
    }


    public void ganaPartido(){
        this.partidosGanadosporGrupo += 4;
    }

    public void empataPartido(){
        this.partidosGanadosporGrupo += 1;
    }

    public void addPartidoJugado(Partido partido){
        this.partidosJugados.add(partido);
    }

    public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPuntajePartidoEtapaGrupo() {
        return partidosGanadosporGrupo;
    }


}
