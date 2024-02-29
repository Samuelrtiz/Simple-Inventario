import java.util.Scanner;

public class SimpleAgenda {
    String [] contactos = new String [10];
    public static void main(String[] args) {

        removerContacto(1250);
    }
    public static void agregarContacto() {

        String [] contactos = new String [10];
        Scanner sz = new Scanner(System.in);
        System.out.println("Ingrese un contacto a agregar");

         contactos = new String[]{sz.next()};

         //--------------------------------------------------------------------
        String contacts;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un nuevo contacto a agregar");
        contacts = sc.next();

        if (contacts.length() >= 4 && contacts.length() <= 8) {
            System.out.println("El Contacto fue agregado con éxito");
        } else if (contacts.length() > 8 && contacts.length() <= 30) {
            System.out.println(" Agregado, contiene entre 8-30 caracteres");
        } else {
            System.out.println("el Nombre es muy largo");
        }
    }

    public static void removerContacto(int id) {
        if (id >= 1000 && id <= 9999) {
            System.out.println("Verificando contacto a eliminar..");
        } else {
            System.out.println("el ID no es valido");
        }

    }

    public static String actualizarContacto(int a) {
        return "N/A";
    }

    public static void mostrarContactos() {
        System.out.println("Mostrando contactos..");

    }

}