package herencia_festival;

class Asistente extends Persona {
    protected TipoEntrada entrada; //tipo de entrada (General, VIP, etc.)

    public Asistente(String nombre, int edad, TipoEntrada entrada) throws EdadValidaException {
        super(nombre, edad); //llamamos al constructor de la clase Persona
        this.entrada = entrada;
    }

    public void mostrarInfo() {
        super.mostrarInfo(); //llamamos al método de la clase Persona
        System.out.println("Tipo de entrada: " + entrada);
    }

    public void prueba(){

    }

    public void accederEvento(){
        System.out.println("Accediendo como Asistente: Buscando asiento.");
    }



}