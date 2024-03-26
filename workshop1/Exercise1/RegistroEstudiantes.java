import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RegistroEstudiantes {
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);

    //Leer Archivo txt
    public void leerArchivo(ArrayList <Estudiante> alumno) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Asus\\OneDrive\\Documentos\\2024\\Segundo Semestre\\Programación II otros\\Archivos\\Estudiantes.txt"));
            String linea = "";
            while((linea = lector.readLine()) != null) {
                String [] bloques = linea.split(";");
                if(bloques.length == 4) {
                    String nombre = bloques[0];
                    String codigo = bloques[1];
                    String carrera = bloques[2];
                    double promedio = Double.parseDouble(bloques[3]);
                    alumno.add(new Estudiante(nombre, codigo, carrera, promedio));
                }
            }
        lector.close();
        }
        catch(IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }        
    }

    //Agregar Estudiante
    public void agregarEstudiante(ArrayList <Estudiante> alumno) {
        int auxiliar = 0;
        int auxiliar2 = 0;
        while (auxiliar == 0) {
            System.out.print("Digite el nombre completo del Estudiante: ");
            String nombre = leer.nextLine();
            System.out.print("Digite el código del Estudiante: ");
            String codigo = leer.nextLine();
            System.out.print("Digite el nombre de la carrera del Estudiante: ");
            String carrera = leer.nextLine();
            System.out.print("Digite el promedio del Estudiante (el promedio debe estar entre 0 y 5): ");
            double promedio = leer2.nextDouble();

            //Validar que no se ingrese un estudiante ya existente
            for (int i = 0; i < alumno.size(); i++) {
                if((alumno.get(i).getNombre()).equals(nombre)) {
                    System.out.println("Nombre ya existente, intente nuevamente");
                    auxiliar2 += 1;
                    break;
                }
                if((alumno.get(i).getCodigo()).equals(codigo)) {
                    System.out.println("Código ya existente, intente nuevamente");
                    auxiliar2 += 1;
                    break;
                }
            }
            
            //Validar el promedio
            if (promedio < 0 || promedio > 5) {
                System.out.println("Promedio fuera del rango establecido, intente nuevamente");
                auxiliar2 +=1;
            }

            //Hechas las validaciones, y si no hay algun error, agregamos el estudiante
            if (auxiliar2 == 0) {
                alumno.add(new Estudiante(nombre, codigo, carrera, promedio));
                auxiliar = 1;
            }

            auxiliar2 = 0;
        }
        System.out.println("El estudiante fue ingresado con exito.");
    }

    //Eliminar Estudiante
    public void eliminarEstudiante(ArrayList <Estudiante> alumno,String codigo) {
        int auxiliar = 0;

        //Validamos y eliminamos en caso del que código exista
        for(int j = 0; j < alumno.size(); j++) {
            if((alumno.get(j).getCodigo()).equals(codigo)){
                alumno.remove(j);
                System.out.println("Alumno eliminado con exito.");
                auxiliar += 1;
                break;
            }
        }

        //Mensaje en caso de que el código ingresado no exista
        if(auxiliar == 0) {
            System.out.println("Código no encontrado, intente nuevamente");
        }
        
    }

    //Listar Estudiantes
    public void listarEstudiantes(ArrayList <Estudiante> alumno) {
        for(int k = 0; k < alumno.size(); k++) {
            System.out.print("Alumno no." + k + ": ");
            System.out.println("Nombre: " + alumno.get(k).getNombre() + "  Código: " +alumno.get(k).getCodigo() + "  Carrera: " + alumno.get(k).getCarrera() + "  Promedio: " + alumno.get(k).getPromedio());
        }
    }

    //Filtro
    public void buscarEstudiantes(ArrayList <Estudiante> alumno,String filtro) {
        int auxiliar = 0;

        //Validadomos y imprimimos los alumnos con el filtro ingresado
        for(int l = 0; l < alumno.size(); l++) {
            if((alumno.get(l).getNombre()).equals(filtro) || (alumno.get(l).getCodigo()).equals(filtro) || (alumno.get(l).getCarrera()).equals(filtro)) {
                System.out.println("Nombre: " + alumno.get(l).getNombre() + "  Código: " +alumno.get(l).getCodigo() + "  Carrera: " + alumno.get(l).getCarrera() + "  Promedio: " + alumno.get(l).getPromedio());
                auxiliar +=1;
            }
        }

        //Mensaje en caso de que no existan estudiantes con el filtro ingresado
        if (auxiliar == 0) {
            System.out.println("No existen estudiantes con el filtro ingresado");
        }
    }

}