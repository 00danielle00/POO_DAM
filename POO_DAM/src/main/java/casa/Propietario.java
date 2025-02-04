package casa;

public class Propietario {


    private String nombre;
    private int edad;


    Propietario(String nombre,int edad){
        this.edad=edad;
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Propietario: [ nombre: "+nombre+ " con edad "+edad+ " ]";
    }
}
