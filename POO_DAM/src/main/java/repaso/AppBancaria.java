package repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBancaria {
    private static int id = 1;
    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Cuenta> cuenta = new ArrayList<>();

    public static void main(String[] args) {
        String eleccion = "";
        do {
            mostrarMenuPrincipal();
            eleccion = cogerEleccion();
            switch (eleccion) {
                case "1":

                    break;
                case "2":
                    break;
            }


        } while (!eleccion.equals("X"));

        System.out.println("xao");

    }

    private static String cogerEleccion() {
        System.out.println("introcude la opcion:");
        return teclado.nextLine();
    }


    private static void mostrarMenuPrincipal() {
        System.out.println("Menú principal: ");
        System.out.println("[1] Mantenimiento de Clientes");
        System.out.println("[2] Mantenimiento de Cuentas");
        System.out.println("[X] Salir");
    }

    private static void motrarMenuClientes() {
        System.out.println("CLIENTES");
        System.out.println("[1] Altas");
        System.out.println("[2] Bajas");
        System.out.println("[3] Modificaciones");
        System.out.println("[4] Listado de clientes");
        System.out.println("[X] Volver al menú principal");
    }

    private static void matenimientoCliente() {
        String opcion = "";
        do {
            motrarMenuClientes();
            opcion = cogerEleccion();
            switch (opcion) {
                case "1":
                    crearCliente();
                    break;
                case "2":
                    eliminarCliente();
                    break;
                case "3":
                    mostarListadoClientes();
                    break;
                case "4":
                    modificarCliente();
                    break;
            }
        } while (!opcion.equals("X"));
    }

    private static void crearCliente() {
        System.out.println("dame tu nombre");
        String nombre = teclado.next();
        System.out.println("dame tu apellido");
        String apellido = teclado.nextLine();
        Cliente cliente = new Cliente(id++, nombre, apellido);
        clientes.add(cliente);
        System.out.println("cliente añadido con éxito");
    }

    private static void eliminarCliente() {
        mostarListadoClientes();
        System.out.println("indica el id a eliminar");
        int id = teclado.nextInt();
        clientes.remove(id);

    }

    private static void mostarListadoClientes() {

        System.out.println("Listado de clientes (" + clientes.size() + "):");
        for (Cliente cli : clientes) {
            System.out.println(cli.toString());
        }
    }

    private static void modificarCliente(){
        Cliente cliente = null;
        mostarListadoClientes();
        System.out.println("que cliente quieres modificar:");
        int id = teclado.nextInt();
        for (Cliente cli: clientes){
            if (cli.getId() == id){
                cliente = cli;
            }
        }
        String nombre = "";
        System.out.println("quieres cambiar el nomnbre");
        String resp = teclado.next();
        if (resp.equals("si")){
            System.out.println("introduce el nuevo nombre:");
             nombre = teclado.next();
             cliente.setNombre(nombre);
        }


    }


}




