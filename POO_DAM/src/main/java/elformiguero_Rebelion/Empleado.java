package elformiguero_Rebelion;

public class Empleado {
    //contador de ID
    private static int ID=1;
    //constante que se concatena con el contador para formar EP001
    private final static String EP="EP";

    //atributos de Empleado
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    Empleado(String nombre, String cargo){
        this.nombre=nombre;
        id=EP+calcularId(); //genera el id automaticamente
        setCargo(cargo);
        this.director = null;

    }
    public void asignarDirector(Empleado director){
        this.director=director;
    }

    public String calcularId(){
        return String.format("%03d",ID);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {

        String valores []={"director", "técnico", "presentador", "colaborador"};

        for (String cargos: valores){
            if (cargos.equals(cargo)){
                this.cargo=cargo;
                return;
            }else if(cargo.equals("director")){
                this.director=null;
            }
        }
        this.cargo = "pte";
    }

    public Empleado getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Empleado: [" + "id='" + id + '\'' + ", nombre='" + nombre + '\'' + ", cargo='" + cargo + '\'' + ", director=" + director + " ]";
    }


}
