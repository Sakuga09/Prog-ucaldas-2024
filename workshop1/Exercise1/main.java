import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static RegistroEstudiantes instancia = new RegistroEstudiantes();
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2= new Scanner(System.in);

        ArrayList <Estudiante> alumnos = new ArrayList<Estudiante>();

        int auxiliar = 0;
        instancia.leerArchivo(alumnos);

        do {
            System.out.println("Menu de opciones:\n1. Agregar Estudiante\n2. Eliminar Estudiante\n3. Listar Estudiantes\n4. Buscar por filtro\n5. Salir");
            System.out.print("Digite el número de la opción que desea realizar: ");
            int eleccion = leer.nextInt();
            switch (eleccion) {
                //Agregar
                case 1:
                instancia.agregarEstudiante(alumnos);
                break;
                
                //Eliminar
                case 2:
                System.out.print("Digite el código del alumno que desea eliminar: ");
                String codigo = leer2.nextLine();
                instancia.eliminarEstudiante(alumnos, codigo);
                break;

                //Listar
                case 3:
                instancia.listarEstudiantes(alumnos);
                break;

                //Filtrar
                case 4:
                System.out.print("Digite el nombre, el código o la carrera segun cómo desee filtrar: ");
                String filtro = leer2.nextLine();
                instancia.buscarEstudiantes(alumnos, filtro);
                break;

                //Salir
                case 5:
                auxiliar = 1;
                break;
            }
        } while (auxiliar == 0);
    }
}