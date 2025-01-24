package org.example;

public class Televisor {

    private int canal=1;
    private int volumen=5;


    public Televisor(int canal,int volumen){

        this.canal = canal;
        this.volumen=volumen;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal<1||canal>99) {
            System.out.println("No hay mas canales");
        }else{
            System.out.println("Canal"+canal);
            this.canal = canal;
        }
    }
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen<0||volumen>100) {
            System.out.println("No puedes aumentar el volumen");
        }else{
            System.out.println("Volumen"+volumen);
            this.volumen = volumen;
        }
    }
    public void subircanal(){
        if (canal < 99){
            canal++;
        }else {
            System.out.println("no se puede cambiar el canal");
        }
    }
    public void bajarcanal(){
        if (canal>1){
            canal--;
        }else {
            System.out.println("no se puede cambiar el canal");
        }
    }
    @Override
    public String toString(){
        return "";
    }


}