import java.util.Scanner;

public class DNI extends Main {
    public static Integer dni(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese dni: ");
        return Integer.valueOf(scanner.nextLine());

    }
}
