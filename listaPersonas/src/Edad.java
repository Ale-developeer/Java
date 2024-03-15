import java.util.Scanner;

public class Edad extends Main{
    public static Integer edad(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese edad: ");
        return Integer.valueOf(scanner.nextLine());

    }
}
