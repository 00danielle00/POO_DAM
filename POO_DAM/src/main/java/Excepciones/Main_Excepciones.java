package Excepciones;

public class Main_Excepciones {
    public static void main(String[] args) throws NivelValidoException {
        int nivel =150;

//        try {
            if (nivel>100){
                throw new NivelValidoException("no es correcto");
            }
//        }catch (NullPointerException n){
//
//        }
    }
}
