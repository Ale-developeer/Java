import java.util.Scanner;

public class DNI extends Main {
    public static String dni(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese dni: ");
        int dni = scanner.nextInt();
        return scanner.nextLine();

    }
}
