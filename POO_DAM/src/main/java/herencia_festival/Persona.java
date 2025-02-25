package herencia_festival;

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) throws EdadValidaException{
        this.nombre = nombre;
        setEdad(edad);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void accederEvento(){
        System.out.println("Accediendo al evento...");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)  {

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadValidaException{
        if (edad<18){
            throw new EdadValidaException("No puede ser menor de edad");
        }
            this.edad = edad;

    }
}