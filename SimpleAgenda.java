import java.util.Scanner;

public class SimpleAgenda {

    private static String[] contactos = new String[10];

    public static void main(String[] args) {

        removerContacto(1250);
    }

    public static void agregarContacto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un contacto a agregar:");
        String nuevoContacto = sc.next();


        boolean existe = false;
        for (String contacto : contactos) {
            if (contacto != null && contacto.equals(nuevoContacto)) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("Ya se ha agregado anteriormente");
        } else {

            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] == null) {
                    contactos[i] = nuevoContacto;
                    System.out.println("Agregado satisfactoriamente");
                    break;
                }
            }
        }
    }

    public static void removerContacto(int id) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el contacto a remover:");
        String contactoARemover = sc.next();

        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(contactoARemover)) {
                encontrado = true;
                System.out.println("El contacto " + contactoARemover + " fue removido exitosamente!");

                contactos[i] = null;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No existe tal contacto");
        }
    }

    public static void mostrarContacto() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el contacto a mostrar:");
        String contactoAMostrar = sc.next();

        boolean encontrado = false;
        for (String contacto : contactos) {
            if (contacto != null && contacto.equals(contactoAMostrar)) {
                encontrado = true;
                System.out.println("El contacto " + contactoAMostrar + ".");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No existen registros de este contacto");
        }
    }

    public static void mostrarContactos() {
        System.out.println("Mostrando contactos…");
        for (String contacto : contactos) {
            if (contacto != null) {
                System.out.println(contacto);
            }
        }
    }
}
