import Garage.Cliente;
import Garage.Garage;
import Garage.Tarifa;
import Garage.Vehiculo;
import com.sun.org.apache.xpath.internal.Arg;


import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mundial Qatar 2022");

        System.out.println("Grupo A");
        Grupo A = new Grupo("Grupos Mundial");
        System.out.println(A);

        Date comienzoDelMundial = new Date (2022, 11, 20);

        Equipo Argentina =new Equipo("Argentina");
        Equipo Alemania =new Equipo("Alemania");
        Equipo Francia =new Equipo("Francia");
        Equipo Australia =new Equipo("Australia");
        Equipo Belgica =new Equipo("Belgica");
        Equipo Uruguay =new Equipo("Uruguay");
        Equipo Brasil =new Equipo("Brasil");
        Equipo Japon =new Equipo("Japon");


        Partido pri =new Partido(new Date(2022, 10, 22) ,Argentina,Australia);
        Partido segundopartido =new Partido(new Date (2022, 10, 22),Australia,Argentina);
        Partido tercerpartido =new Partido(new Date (2022, 10, 22),Brasil,Uruguay);
        Partido cuartopartido =new Partido(new Date (2022, 10, 22),Alemania,Francia);
        Partido quintopartido =new Partido(new Date (2022, 10, 22),Argentina,Japon);
        Partido sextopartido =new Partido(new Date (2022, 10, 22),Francia,Japon);
        System.out.println("Primeros Partidos");
        System.out.println(pri);
        System.out.println(segundopartido);
        System.out.println(tercerpartido);
        System.out.println(cuartopartido);
        System.out.println(quintopartido);
        System.out.println(sextopartido);





        Resultado primerPartido = new Resultado(3,1);
        Resultado segundoPartido = new Resultado(0,2);
        Resultado tercerPartido = new Resultado(0,3);
        Resultado cuartoPartido = new Resultado(5,2);
        Resultado quintoPartido = new Resultado(3,1);
        Resultado sextoPartido = new Resultado(5,2);
        System.out.println("Resultados");
        System.out.println(primerPartido);
        System.out.println(segundoPartido);
        System.out.println(tercerPartido);
        System.out.println(cuartoPartido);
        System.out.println(quintoPartido);
        System.out.println(sextoPartido);


        pri.setResultado(primerPartido);
        segundopartido.setResultado(segundoPartido);
        tercerpartido.setResultado(tercerPartido);
        cuartopartido.setResultado(cuartoPartido);
        quintopartido.setResultado(quintoPartido);
        sextopartido.setResultado(sextoPartido);


        A.addPartido(pri);
        A.addPartido(segundopartido);

        System.out.println("Puntos de Argentina" + Argentina.getPuntajePartidoEtapaGrupo());


        A.addEquiposQueAvanzan(Argentina);
        A.addEquiposQueAvanzan(Brasil);
        System.out.println("Equipos que avanzan del grupo 1:");
        System.out.println(A.getEquiposQueAvanzan());
        System.out.println(" ");



//Garage//

        System.out.println("Garage");
        Garage garage = new Garage("Rolex", 1122222233, "Av.Corrientes 800", 8, 1000, 2500, 2600);
        System.out.println(garage);

        Cliente cliente = new Cliente(123, "Cosme Fulanito", 37555289, 1245789514, " Calle Falsa 123");
        System.out.println(cliente);


        Tarifa tarifa = new Tarifa(555, "Estandar", "Camioneta");
        System.out.println(tarifa);

        Vehiculo moto = new Vehiculo("Af398PP", 37555289, "Moto", comienzoDelMundial, comienzoDelMundial, "CABA", comienzoDelMundial);
        Vehiculo auto = new Vehiculo("Af388PP", 37555222, "Camioneta", comienzoDelMundial, comienzoDelMundial, "CABA", comienzoDelMundial);
        System.out.println(moto);
        System.out.println(auto);

    }

    }

