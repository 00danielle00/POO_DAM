package elformiguero;

public class Empleado {
    private static int contadorID= 1;
    private static String[] valoresCargo= {"director", "técnico","presentador","colaborador"};


    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo, Empleado director){
        this.nombre=nombre;
        id=String.format("EP%03d", contadorID++);

        for (String valor:valoresCargo){
            if (valor.equals(cargo)){
                this.cargo=cargo;
                return;
            }
        }
        this.cargo="pte";

        if (cargo.equals("director")){
            this.director=null;
        }else {
            this.director=director;
        }

    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
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

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }



}
