import java.util.Scanner;
public class Person {

    public static void main(String[] args) {
        Scanner LeerPersona = new Scanner(System.in);
        String Nombre = " ";
        String TipoDocumento = " ";
        int Edad = 0;
        int NumeroDocumento = 0;

        System.out.print("Digite su Nombre completo: ");
        Nombre = LeerPersona.nextLine();

        System.out.print("Digite su tipo de Documento: ");
        TipoDocumento = LeerPersona.nextLine();

        System.out.print("Digite su Numero de Documento: ");
        NumeroDocumento = LeerPersona.nextInt();

        System.out.print("Digite su Edad: ");
        Edad = LeerPersona.nextInt();

        System.out.println();
        System.out.println("Su información Digitada fue: ");

        System.out.println(Nombre);
        System.out.println(TipoDocumento);
        System.out.println(NumeroDocumento);
        System.out.println(Edad);
        
    }
}