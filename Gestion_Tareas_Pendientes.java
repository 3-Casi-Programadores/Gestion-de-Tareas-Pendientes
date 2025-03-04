//LIBRERIAS
import java.util.ArrayList; //UTILIZADO PARA CREAR UNA LISTA DE ARREGLOS
import java.util.List; //IMPORTAR LISTAS
import java.util.Scanner; //LEE ENTRADA DE USUARIOS AL SISTEMA
import java.util.stream.Collectors; //RECOPILA DATOS DE LOS STREAMS

class Tarea {
    private String descripcion;
    private boolean completada;

    //LLAMAR CONSTRUCTORES
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    //SETTER Y GETTERS
    //MODIFICAN LOS VALORES DE LOS ATRIBUTOS EN UNA CLASE
    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    @Override
    public String toString() {
        return (completada ? "[✔] " : "[ ] ") + descripcion;
    }
}

//MAIN PRINCIPAL
public class Gestion_Tareas_Pendientes {
    public static void main(String[] args) {
        List<Tarea> listaTareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n* * * * *Menu de Gestion de Tareas* * * * *");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Ver todas las tareas");
            System.out.println("4. Ver solo tareas incompletas");
            System.out.println("5. Salir\n");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            scanner.nextLine(); //SALTO DE LINEA

            //USO DE SWITCH PARA SELECCIONAR UNA OPCION EN LISTA DE MENU 
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la descripcion de la tarea: ");
                    String descripcion = scanner.nextLine();
                    listaTareas.add(new Tarea(descripcion));
                    System.out.println("Tarea agregada con exito.");
                    break;

                case 2:
                    System.out.println("Lista de tareas:");
                    for (int i = 0; i < listaTareas.size(); i++) {
                        System.out.println(i + ". " + listaTareas.get(i));
                    }
                    System.out.print("Ingrese el nuumero de la tarea a completar: ");
                    int indice = scanner.nextInt();

                    if (indice >= 0 && indice < listaTareas.size()) {
                        listaTareas.get(indice).marcarComoCompletada();
                        System.out.println("Tarea marcada como completada.");
                    } 
                    else {
                        System.out.println("Indice invalido.");
                    }
                    break;

                case 3:
                    System.out.println("\n Todas las tareas:");
                    listaTareas.forEach(System.out::println);
                    break;

                case 4:
                    System.out.println("\n Tareas incompletas:");
                    listaTareas.stream()
                            .filter(t -> !t.isCompletada())
                            .forEach(System.out::println);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } 

        while (opcion != 5);

        scanner.close(); //CIERRA EL SCANNER
    }
}