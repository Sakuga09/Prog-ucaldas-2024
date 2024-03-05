import java.util.Scanner;
public class animal {

    public static void main(String[] args) {
        Scanner LeerAnimal = new Scanner(System.in);

        String Animal = " ";
        String Raza = " ";
        String Color = " ";
        int Edad = 0;

        System.out.print("Digite su animal: ");
        Animal = LeerAnimal.nextLine();

        System.out.println("Caracteristica 1");
        System.out.print("Digite la raza de su animal: ");
        Raza = LeerAnimal.nextLine();

        System.out.println("Caracteristica 2");
        System.out.print("Digite el color de piel de su animal: ");
        Color = LeerAnimal.nextLine();

        System.out.println("Caracteristica 3");
        System.out.print("Digite la edad de su animal: ");
        Edad = LeerAnimal.nextInt();

    }
}