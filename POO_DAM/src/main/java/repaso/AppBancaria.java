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
                    matenimientoCliente();
                    break;
                case "2":
                    mantenimientoCuenta();
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

    public static void verCuentas() {
        System.out.println("Cuentas de la sucursal (" + cuenta.size() + ")");
        for (Cuenta c : cuenta) {
            System.out.println(c.toString());
        }
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

    private static void modificarCliente() {
        Cliente cliente = null;
        mostarListadoClientes();
        System.out.println("que cliente quieres modificar:");
        int id = teclado.nextInt();
        for (Cliente cli : clientes) {
            if (cli.getId() == id) {
                cliente = cli;
            }
        }
        String nombre = "";
        System.out.println("quieres cambiar el nomnbre");
        String resp = teclado.next();
        if (resp.equals("si")) {
            System.out.println("introduce el nuevo nombre:");
            nombre = teclado.next();
            cliente.setNombre(nombre);
        }


    }

    public static void mostrarMenuCuenta() {
        System.out.println("Cuentas:");
        System.out.println("[1] Consultar cuentas cliente");
        System.out.println("[2] Ver todas las cuentas");
        System.out.println("[X] Volver al menú principal");
    }

    public static void mantenimientoCuenta() {
        String opcion = "";
        do {
            mostrarMenuCuenta();
            opcion = cogerEleccion();
            switch (opcion) {
                case "1":
                    consultarCuentasCliente();
                    break;
                case "2":
                    verCuentas();
                    break;
            }
        } while (!opcion.equals("X"));
    }

    public static void consultarCuentasCliente() {

        String nombre = "";
        String apellido = "";

        System.out.println("introduzca nombre");
        nombre = teclado.next();
        System.out.println("introduzca apellidos:");
        apellido = teclado.nextLine();

        for (Cuenta c : cuenta) {
            if (c.getTitular().equals(nombre) && c.getTitular().equals(apellido)) {
                System.out.println("Cuentas asociadas a " + nombre + apellido);
                System.out.println(c.getIban() + " - saldo:" + c.getSaldo() + "€");
                return;
            }
        }
        System.out.println("la persona que buscas, no tiene ninguna cuenta");
    }


}




