package umg.demo.conductores;

import java.sql.SQLOutput;

public class conductor
{
    private String nombre;
    private String licencia;

    public conductor (String nombre, String licencia){

        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void mostrarInfo()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Licencia: " + licencia);
    }
}
