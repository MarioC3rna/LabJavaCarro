package umg.demo;

import umg.demo.conductores.conductor;
import umg.demo.conductores.conductordecoche;
import umg.demo.conductores.conductordemotos;


public class Main {
    public static void main(String[] args)
    {
        //conductor en general
        conductor conductor=new conductor("Juan","13132e");
        conductor.mostrarInfo();

     //coductor de carros
    conductordecoche conductordecoche = new conductordecoche("Tulio","4343",1);
    conductordecoche.mostrarInfo();

    //conductor de motos
    conductordemotos conductormotos= new conductordemotos("jairito","3083JER",true);
    conductormotos.mostrarInfo();

    }
}

