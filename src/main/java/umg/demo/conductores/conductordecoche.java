package umg.demo.conductores;
import umg.demo.conductores.conductor;

public class conductordecoche extends conductor
{

    private int  experiencia;


    public conductordecoche(String nombre, String licencia, int experiencia)
    {
        super(nombre, licencia);
        this. experiencia = experiencia;

    }

    @Override
    public void mostrarInfo(){
       super.mostrarInfo();
        System.out.println("Años de esperiencia: " + experiencia);
    }
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

}
