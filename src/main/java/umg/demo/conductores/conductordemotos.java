package umg.demo.conductores;

public class conductordemotos extends conductor{
    private boolean dueñodelamoto;


    public conductordemotos(String nombre, String licencia,boolean dueñodelamoto) {
        super(nombre,licencia);
        this.dueñodelamoto = dueñodelamoto;
    }


    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("El es dueño de la moto: "+dueñodelamoto);
    }

    public boolean isdueñodelamoto() {
        return dueñodelamoto;
    }

    public void setdueñodelamoto(boolean dueñodelamoto) {
        this.dueñodelamoto = dueñodelamoto;
    }













}
