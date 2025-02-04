package equipo;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private int peso;
    private int edad;

    public Persona(String nombre, String apellido, String dni, int peso, int edad){

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.peso = peso;
        this.edad = edad;

    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getDni(){
        return this.dni;
    }

    public int getPeso(){
        return this.peso;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        if (!nombre.equalsIgnoreCase("Messi")){
            this.nombre=nombre;
        }
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void setDni(String dni){
        this.dni=dni;
    }

    public void setPeso(int peso){
        this.peso=peso;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public String concatenar(){

        return this.nombre + " " + this.apellido;

    }

    public void imprimirInfoPersona(){
        System.out.println(this.nombre + " " + this.apellido +" " + this.dni +" " + this.peso +" " + this.edad);
    }

    @Override
    public String toString(){
        return "Persona "+nombre+" con el apellido "+ apellido+ " y con el dni "+dni+ " con la edad "+edad + "y con el peso "+peso;
    }

}