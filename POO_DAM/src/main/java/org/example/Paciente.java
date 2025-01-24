
package org.example;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;

public class Paciente {

    private final static char GENERO_DEF = 'X';
    public final static int SOBREPESO = 1;
    public final static int PESO_BAJO = -1;
    public final static int PESO_IDEAL = 0;
    public final static int MAYOR_EDAD = 18;

    private String nombre;
    private String dni;
    private int edad;
    private char genero;
    private float peso;
    private float altura;

    public Paciente (String nombre, int edad, char genero, float peso, float altura){

        this.nombre=nombre;
        this.edad=edad;

        comprobarGenero(genero);
        this.peso=peso;
        this.altura=altura;
        generarDni();
    }

    public Paciente(){
//        generarDni();
//        this.genero = GENERO_DEF;
        this("",0,GENERO_DEF,0,0);
    }

    public Paciente(String nombre, int edad, char genero){
        this(nombre,edad,genero,0,0);
    }

    private void generarDni(){
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10000000,99999999);

        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int resto = numero%23;

        this.dni = Integer.toString(numero) + letras[resto];
    }

    public void mostrarInfoPaciente(){

        System.out.println();
        System.out.println("Paciente: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Género: " + this.genero);
        System.out.println("DNI: " + this.dni);
        System.out.println("Peso: " +  this.peso);
        System.out.println("Altura: " +  this.altura);

    }

    public int calcularIMC(){

        double imc = peso/(Math.pow(altura,2));

        if(imc < 20){
            return PESO_BAJO;
        } else if (imc > 25) {
            return SOBREPESO;
        }else{
            return PESO_IDEAL;
        }

    }

    public boolean esMayorDeEdad(){

        if(edad>=MAYOR_EDAD){
            return true;
        }

        return false;

    }

    private void comprobarGenero(char sexo){

        if(sexo != 'H' && sexo != 'M'){
            this.genero=GENERO_DEF;
        }else{
            this.genero=sexo;
        }

    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public char getGenero(){
        return this.genero;
    }

    public String getDni(){
        return this.dni;
    }

    public float getPeso(){
        return this.peso;
    }

    public float getAltura(){
        return this.altura;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public void setGenero(char genero){
        comprobarGenero(genero);
    }

    public void setAltura(float altura){
        this.altura=altura;
    }
    public void setPeso(float peso){
        this.peso=peso;
    }

    @Override
    public String toString(){

        return "Paciente: con nombre "+this.nombre+" y "+this.edad+" años de edad. Genero "+this.genero+" y dni "+ this.dni+ " con una altura de "+this.altura+" y un peso de "+this.peso;
    }


}