import java.util.ArrayList;
import java.util.Scanner;

public class tareas {
    ArrayList <Lista> tareas = new ArrayList<Lista>();
    Scanner sc = new Scanner(System.in);

    //Rellenar lista de tareas
    public void DigitarInformacion() {
        for(int i = 1; i <= 5; i++ ) {
            System.out.print("Digite el nombre de la tarea " + i + ": ");
            String NombreTarea = sc.nextLine();

            System.out.print("Digite la duración de la tarea " + i + ": ");
            String Duracion = sc.nextLine();

            System.out.print("Digite el nombre del encargado de la tarea " + i + ": ");
            String NombreEncargado =sc.nextLine();

            System.out.print("Digite el estado de la tarea " + i + " Segun las siguientes opciones\nActiva\nEn desarrollo\nRealizada\nDigite su opción: ");
            String Estado = sc.nextLine();

            tareas.add(new Lista(NombreTarea, Duracion, NombreEncargado, Estado));
            System.out.println();
        }
    }

    //Mostrar lista de tareas
    public void ListaDeTareas() {
        for(int j = 0; j < 5; j++) {
            System.out.println("Tarea " + (j+1) + ": " + tareas.get(j));
        }
    }
    
    //Preguntar por algun cambio en el Estado de la tarea
    public boolean RealizarCambio(String confirmacion) {
        String ConfirmarMinuscula = confirmacion.toLowerCase();
        if ("si".equals(ConfirmarMinuscula)) {
            return true;
        }
        else {
            return false;
        }    

    }

    //Realizar el cambio de estado
    public void CambioEstado(int posicion) {
        System.out.println("Digite el Nuevo estado segun las siguiente opciones\nActiva\nEn desarrollo\nRealizada");
        String cambio = sc.nextLine();
        if (cambio.toLowerCase() == "activo" || cambio.toLowerCase() == "en desarrollo" || cambio.toLowerCase() == "realizada") {
            String parametro = tareas.get(posicion-1).Estado;
        }
        else {
            System.out.println("Esa opción no puede realizarce, intente nuevamente");
        }

    }
}