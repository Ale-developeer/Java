import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        private static List<Personas> Persona() {
            List<Personas> persona = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Ingrese los datos de la persona:");
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Apellido: ");
                String apellido = scanner.nextLine();

                System.out.print("Edad: ");
                int edad = scanner.nextInt();
                scanner.nextLine();  // Consumir el salto de línea

                personas.add(new Persona(nombre, apellido, edad));

                System.out.print("¿Desea ingresar otra persona? (s/n): ");
                String respuesta = scanner.nextLine();
                if (!respuesta.equalsIgnoreCase("s")) {
                    break;
                }
    }
}