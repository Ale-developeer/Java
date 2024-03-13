import java.util.Scanner;
public class Saludo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        scanner.close();
        System.out.println("hola, " + nombre + "! Bienvenido a tu primer programa en Java");
    }
}
