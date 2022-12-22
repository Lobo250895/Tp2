import Garage.Cliente;
import Garage.Garage;
import Garage.Tarifa;
import Garage.Vehiculo;
import Garage.ReportedeRuedas;
import com.sun.org.apache.xpath.internal.Arg;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mundial Qatar 2022");

        Date comienzoDelMundial = new Date (2022, 11, 20);

        System.out.println("Grupo a");
        Equipo catar = new Equipo("Catar");
        Equipo ecuador = new Equipo("Ecuador");
        Equipo senegal = new Equipo("Senegal");
        Equipo paisesbajos = new Equipo("Paises Bajos");
        System.out.println();

        System.out.println("Grupo b");
        Equipo inglaterra = new Equipo("Inglaterra");
        Equipo iran = new Equipo("Iran");
        Equipo estadosunidos = new Equipo("Estados Unidos");
        Equipo gales = new Equipo("Gales");

        System.out.println("Grupo c");
        Equipo argentina = new Equipo("Argentina");
        Equipo arabiasaudita = new Equipo("Arabia Saudita");
        Equipo mexico = new Equipo("México");
        Equipo polonia = new Equipo("Polonia");

        System.out.println("Grupo d");
        Equipo dinamarca = new Equipo("Dinamarca");
        Equipo tunez = new Equipo("Tunez");
        Equipo francia = new Equipo("Francia");
        Equipo australia = new Equipo("Australia");

        System.out.println("Grupo e");
        Equipo alemania = new Equipo("Alemania");
        Equipo japon = new Equipo("Japón");
        Equipo españa = new Equipo("España");
        Equipo costarica = new Equipo("Costa Rica");

        System.out.println("Grupo f");
        Equipo marruecos = new Equipo("Marruecos");
        Equipo croacia = new Equipo("Croacia");
        Equipo belgica = new Equipo("Bélgica");
        Equipo canada = new Equipo("Canada");

        System.out.println("Grupo g");
        Equipo suiza = new Equipo("Suiza");
        Equipo camerun = new Equipo("Camerun");
        Equipo brasil = new Equipo("Brasil");
        Equipo serbia = new Equipo("Serbia");
        Equipo portugal = new Equipo("Portugal");


        Partido partido1= new Partido(new Date(2022,11,02), paisesbajos, estadosunidos);
        Partido partido2= new Partido(new Date(2022,11,02), argentina, australia);
        Partido partido3= new Partido(new Date(2022,112,02), francia,polonia);
        Partido partido4= new Partido(new Date(2022,11,10), inglaterra, senegal);
        Partido partido5= new Partido(new Date(2022,11,10), japon, croacia);
        Partido partido6= new Partido(new Date(2022,11,11), brasil, españa);
        Partido partido7= new Partido(new Date(2022,11,11), marruecos, españa);
        Partido partido8= new Partido(new Date(2022,11,12), japon, suiza);

        System.out.println("Partidos del torneo Octavos de final");
        System.out.println("Partido:" + partido1);
        System.out.println("Partido:" + partido2 );
        System.out.println("Partido:" + partido3 );
        System.out.println("Partido:" + partido4 );
        System.out.println("Partido:" + partido5 );
        System.out.println("Partido:" + partido6 );
        System.out.println("Partido:" + partido7 );
        System.out.println("Partido:" + partido8 );

        Resultado resultado1= new Resultado(3,0);
        Resultado resultado2= new Resultado(3,2);
        Resultado resultado3= new Resultado(4,1);
        Resultado resultado4= new Resultado(3,0);
        Resultado resultado5= new Resultado(1,2);
        Resultado resultado6= new Resultado(4,1);
        Resultado resultado7= new Resultado(3,0);
        Resultado resultado8= new Resultado(6,1);
        System.out.println("Resultados del torneo Octavos de final");
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println(resultado5);
        System.out.println(resultado6);
        System.out.println(resultado7);
        System.out.println(resultado8);

        Grupo grupoA= new Grupo();
        Grupo grupoB= new Grupo();
        Grupo grupoC= new Grupo();
        Grupo grupoD= new Grupo();
        Grupo grupoE= new Grupo();
        Grupo grupoF= new Grupo();
        Grupo grupoG= new Grupo();

        partido1.setResultado(resultado1);
        partido2.setResultado(resultado2);
        partido3.setResultado(resultado3);
        partido4.setResultado(resultado4);
        partido5.setResultado(resultado5);
        partido6.setResultado(resultado6);
        partido7.setResultado(resultado7);
        partido8.setResultado(resultado8);

        grupoA.addPartido(partido1);
        grupoA.addPartido(partido4);
        grupoB.addPartido(partido1);
        grupoB.addPartido(partido4);
        grupoC.addPartido(partido2);
        grupoC.addPartido(partido3);
        grupoD.addPartido(partido2);
        grupoD.addPartido(partido3);
        grupoE.addPartido(partido5);
        grupoE.addPartido(partido7);
        grupoF.addPartido(partido7);
        grupoF.addPartido(partido5);
        grupoG.addPartido(partido8);
        grupoG.addPartido(partido6);


        System.out.println("Puntaje Senegal:" + senegal.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Holanda:" + paisesbajos.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Inglaterra:" + inglaterra.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Estados Unidos:" + estadosunidos.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Argentina" + argentina.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Polonia:" + polonia.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Francia:" + francia.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Australia:" + australia.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Japón:" + japon.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje España:" + españa.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Marruecos:" + marruecos.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Croacia:" + croacia.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Suiza:" + suiza.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Brasil:" + brasil.getPuntajePartidoEtapaGrupo());

        grupoA.addEquiposQueAvanzan(paisesbajos);
        grupoB.addEquiposQueAvanzan(inglaterra);
        grupoC.addEquiposQueAvanzan(argentina);
        grupoD.addEquiposQueAvanzan(francia);
        grupoF.addEquiposQueAvanzan(croacia);
        grupoF.addEquiposQueAvanzan(marruecos);
        grupoG.addEquiposQueAvanzan(brasil);

        System.out.println("Equipos que avanzan a Cuartos de Final:");
        System.out.println(grupoA.getEquiposQueAvanzan().get(0).getNombre());
        System.out.println(grupoB.getEquiposQueAvanzan().get(0).getNombre());
        System.out.println(grupoC.getEquiposQueAvanzan().get(0).getNombre());
        System.out.println(grupoD.getEquiposQueAvanzan().get(0).getNombre());
        System.out.println(grupoF.getEquiposQueAvanzan().get(0).getNombre());
        System.out.println(grupoF.getEquiposQueAvanzan().get(1).getNombre());
        System.out.println(grupoG.getEquiposQueAvanzan().get(0).getNombre());
        System.out.println(grupoG.getEquiposQueAvanzan().get(0).getNombre());

        System.out.println("Equipos en los Cuartos de Final:");
        Partido partido9= new Partido(new Date(2022,11,9), croacia, brasil);
        Partido partido10= new Partido(new Date(2022,11,9), paisesbajos, argentina);
        Partido partido11= new Partido(new Date(2022,11,10), marruecos, portugal);
        Partido partido12= new Partido(new Date(2022,11,10), inglaterra, francia);

        System.out.println("Partidos del torneo.Cuartos");
        System.out.println("Partido:" + partido9);
        System.out.println("Partido:" + partido10);
        System.out.println("Partido:" + partido11);
        System.out.println("Partido:" + partido12);

        Resultado rp9= new Resultado(4,2);
        Resultado rp10= new Resultado(3,4);
        Resultado rp11= new Resultado(1,0);
        Resultado rp12= new Resultado(1,2);

        System.out.println("Resultados del torneo.Cuartos");
        System.out.println(rp9);
        System.out.println(rp10);
        System.out.println(rp11);
        System.out.println(rp12);

        partido9.setResultado(rp9);
        partido10.setResultado(rp10);
        partido11.setResultado(rp11);
        partido12.setResultado(rp12);

        grupoA.addPartido(partido10);
        grupoB.addPartido(partido12);
        grupoC.addPartido(partido10);
        grupoD.addPartido(partido12);
        grupoF.addPartido(partido9);
        grupoF.addPartido(partido11);
        grupoG.addPartido(partido9);
        grupoG.addPartido(partido11);

        System.out.println("Puntaje Croacia:" + croacia.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Brasil:" + brasil.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Holanda:" + paisesbajos.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Argentina:" + argentina.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Marruecos:" + marruecos.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Portugal:" + portugal.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Inglaterra:" + inglaterra.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Francia:" + francia.getPuntajePartidoEtapaGrupo());

        grupoC.addEquiposQueAvanzan(argentina);
        grupoD.addEquiposQueAvanzan(francia);
        grupoF.addEquiposQueAvanzan(croacia);
        grupoF.addEquiposQueAvanzan(marruecos);

        System.out.println("Equipos que avanza a la SemiFinal:");
        System.out.println(grupoC.getEquiposQueAvanzan().get(0).getNombre());
        System.out.println(grupoD.getEquiposQueAvanzan().get(0).getNombre());
        System.out.println(grupoF.getEquiposQueAvanzan().get(0).getNombre());
        System.out.println(grupoF.getEquiposQueAvanzan().get(1).getNombre());

        System.out.println("SEMI FINAL");
        Partido partido13= new Partido(new Date(2022,11,13), argentina,croacia);
        Partido partido14= new Partido(new Date(2022,11,14), francia,marruecos);

        System.out.println("Partidos del torneo.SemiFinal");
        System.out.println("Partido:" + partido13);
        System.out.println("Partido:" + partido14);

        Resultado resultado13= new Resultado(3,0);
        Resultado resultado14= new Resultado(2,0);

        System.out.println("Resultados del torneo.SemiFinal");
        System.out.println(resultado13);
        System.out.println(resultado14);

        partido13.setResultado(resultado13);
        partido14.setResultado(resultado14);

        grupoC.addPartido(partido13);
        grupoD.addPartido(partido14);
        grupoF.addPartido(partido13);
        grupoF.addPartido(partido14);

        System.out.println("Puntaje Argentina:" + argentina.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Croacia:" + croacia.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Francia:" + francia.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Marruecos:" + marruecos.getPuntajePartidoEtapaGrupo());

        grupoC.addEquiposQueAvanzan(argentina);
        grupoD.addEquiposQueAvanzan(francia);

        System.out.println("Equipos que avanza a la Final:");
        System.out.println(grupoC.getEquiposQueAvanzan().get(0).getNombre());
        System.out.println(grupoD.getEquiposQueAvanzan().get(0).getNombre());

        System.out.println("FINAL");
        Partido partido15= new Partido(new Date(2022,11,18), argentina,francia);

        System.out.println("Partidos del torneo.Final");
        System.out.println("Partido:" + partido15);

        Resultado resultado15= new Resultado(3,3);

        System.out.println("Resultados del torneo.Final");
        System.out.println(resultado15);

        partido15.setResultado(resultado15);

        grupoC.addPartido(partido13);
        grupoF.addPartido(partido13);

        System.out.println("Puntaje Argentina:" + argentina.getPuntajePartidoEtapaGrupo());
        System.out.println("Puntaje Francia:" + francia.getPuntajePartidoEtapaGrupo());

        System.out.println("Equipo ganador del Mundial: " + " Argentina");

        Llave octavos= new Llave("Octavos de Final");
        Llave cuartos= new Llave("Cuartos de Final");
        Llave semi= new Llave("Semifinal");


//Garage//

        System.out.println("Garaje");

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

