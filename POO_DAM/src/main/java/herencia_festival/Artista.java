package herencia_festival;

class Artista extends Persona {

    String generoMusical;

    public Artista(String nombre, int edad, String generoMusical) throws EdadValidaException {
        super(nombre, edad);
        this.generoMusical = generoMusical;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Género Musical: " + generoMusical);
    }

    public void accederEvento(){
        System.out.println("Accediendo como Artista: Preparando el show.");
    }

}