package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Cosas_ArrayList {

    public static void main(String[] args){
//
//        ArrayList<Integer> Listanumeros = new ArrayList<>();
//        //añadir en la lista:
//        Listanumeros.add(3);
//        Listanumeros.add(14);
//        Listanumeros.add(45);
//        Listanumeros.add(1,9);
//        System.out.println(Listanumeros.get(0));//pinta el  numero que esta en esa posicion
//        Listanumeros.remove(0);
//        System.out.println(Listanumeros.get(0));
//        Listanumeros.remove(2);//borrar
//        System.out.println(Listanumeros);
//        System.out.println("Posición del numero 14: "+Listanumeros.indexOf(14));
//        System.out.println("Posición del numero 45: "+Listanumeros.indexOf(45));
//
//
//        for (int i = 0; i < Listanumeros.size(); i++) {//coges la posicion
//            System.out.println(Listanumeros.get(i));
//        }
//
//        for (int lista:Listanumeros){
//            System.out.println(lista);
//        }
//        Listanumeros.set(0, 56);
//        System.out.println(Listanumeros.get(0));
//
//        Object lista_copia =Listanumeros.clone();
//        System.out.println(lista_copia);
//
//        Listanumeros.clear();//borra la lista
//        System.out.println(Listanumeros);
//
//        if(Listanumeros.contains(56)){
//            System.out.println("esta en la lista");
//        }else{
//            System.out.println("No esta en la lista");
//        }
//
//        //comprobar que esta vacia:
//        if (Listanumeros.isEmpty()){
//            System.out.println("esta vacia");
//        }else {
//            System.out.println("no esta vacia");
//        }
//
//        Listanumeros.addAll(Arrays.asList(2,3,4,5,6,7,8));
//        System.out.println(Listanumeros);
//
//        insertar_varios(Listanumeros,4,5,6);
//        System.out.println(Listanumeros);

        ArrayList<String> listaCompra = new ArrayList<>();
        ArrayList<String> banyo = new ArrayList<>();
        //a
        addElemento(listaCompra,"Lechuga");
        addElemento(listaCompra,"Tomate");
        addElemento(listaCompra, "Jamón");
        System.out.println(listaCompra);
        addElemento(banyo, "toalla");
        addElemento(banyo,"alfombra");
        addElemento(banyo, "ducha");
        addElemento(banyo, "vater");

        if (listaCompra.isEmpty()){
            System.out.println("La lista está vacia");
        }else {
            System.out.println("La lista no está vacia");
        }
        //b
        listaCompra.addAll(Arrays.asList("pepino","papel","naranjas","patatas","nuggets"));
        System.out.println(listaCompra);

        //d cambiar un elemento en cierta posicion
        listaCompra.set(1,"Queso");
        System.out.println(listaCompra);

        //c
        System.out.println(listaCompra.get(3));

        //e
        if (listaCompra.contains("pepino")){
            System.out.println("Pepino está en la lista");
        }else{
            System.out.println("Pepino no está enla lista");
        }

        //g mostrar numero de elementos en la lista
        System.out.println("Numero de elementos de la lista "+listaCompra.size());
        //h clonar
        ArrayList<String> lista_copia = (ArrayList<String>) listaCompra.clone();
        System.out.println("Lista de la compra clonada: " + lista_copia);

        //i
        lista_copia.clear();
        System.out.println("Lista clonada vacia "+lista_copia);
        if (lista_copia.isEmpty()){
            System.out.println("la lista copiada esta vacia");
        }else{
            System.out.println("la lista copiada no esta vacia");
        }

        //j)
        boolean sonIguales = listaCompra.equals(banyo);
        if (sonIguales){
            System.out.println("Las 2 listas son iguales");
        }else{
            System.out.println("las 2 listas no son iguales");
        }
        //k)
        addElemento(lista_copia, "cafe");
        addElemento(lista_copia, "galletas");
        System.out.println("Lista clonadaa con 2 elementos: "+lista_copia);

        //l)
        ArrayList<String> faltantes =new ArrayList<>(listaCompra);
        faltantes.removeAll(lista_copia);
        System.out.println("Los elementos que faltan son :"+faltantes);


    }
    //f
    public  static  void  addElemento(ArrayList <String> lista, String elemento){
        if (!lista.contains(elemento)){
            lista.add(elemento);
        }else {
            System.out.println("El elemento"+ elemento+ " ya esta en la lista");
        }
    }
    public static void insertar_varios(ArrayList<Integer>lista,Integer... numero){
        lista.addAll(Arrays.asList(numero));
    }
}
