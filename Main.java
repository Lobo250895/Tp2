import Garage.Cliente;
import Garage.Garage;
import Garage.Tarifa;
import Garage.Vehiculo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mundial Qatar 2022");

        Date comienzoDelMundial = new Date(2022, 11, 20);

        Equipo Argentina = new Equipo("Argentina");
        Equipo Alemania = new Equipo("Alemania");
        Equipo Francia = new Equipo("Francia");
        Equipo Australia = new Equipo("Australia");
        Equipo Belgica = new Equipo("Belgica");
        Equipo Uruguay = new Equipo("Uruguay");
        Equipo Brasil = new Equipo("Brasil");
        Equipo Japon = new Equipo("Japon");

        Partido primerpartido = new Partido(new Date(2022, 11, 20), Francia, Belgica);
        Partido segundopartido = new Partido(new Date(2022, 11, 21), Australia, Argentina);
        Partido tercerpartido = new Partido(new Date(2022, 11, 22), Brasil, Uruguay);
        Partido cuartopartido = new Partido(new Date(2022, 11, 23), Alemania, Francia);
        Partido quintopartido = new Partido(new Date(2022, 11, 23), Argentina, Japon);
        Partido sextopartido = new Partido(new Date(2022, 11, 21), Francia, Japon);


        Resultado primerPartidoTerminado = new Resultado(3, 1);
        Resultado segundoPartidoTerminado = new Resultado(0, 2);
        Resultado tercerPartidoTerminado = new Resultado(0, 3);
        Resultado cuartoPartidoTerminado = new Resultado(5, 2);
        Resultado quintoPartidoTerminado = new Resultado(3, 1);
        Resultado sextoPartidoTerminado = new Resultado(5, 2);

        primerpartido.setResultado(primerPartidoTerminado);
        segundopartido.setResultado(segundoPartidoTerminado);
        tercerpartido.setResultado(tercerPartidoTerminado);
        cuartopartido.setResultado(cuartoPartidoTerminado);
        quintopartido.setResultado(quintoPartidoTerminado);
        sextopartido.setResultado(sextoPartidoTerminado);

        Grupo grupo = new Grupo(null, null, null);
        grupo.addPartido(primerpartido);
        grupo.addPartido(segundopartido);
        grupo.addPartido(tercerpartido);

        Grupo grupoB = new Grupo("Primer Etapa", primerpartido, Argentina);
        grupoB.addPartido(cuartopartido);
        grupoB.addPartido(quintopartido);
        grupoB.addPartido(sextopartido);

        grupo.addEquiposQueAvanzan(Argentina);
        System.out.println(Argentina.getPuntajePartidoEtapaGrupo());

        grupo.addEquiposQueAvanzan(Francia);
        System.out.println(Francia.getPuntajePartidoEtapaGrupo());


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

