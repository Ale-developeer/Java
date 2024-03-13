import java.util.Scanner;
public class nombre {
    public static void main(String[] args) {
    nombres();
    }
    public static void nombres(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese primer palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.print("ingrese segunda palabra: ");
        String palabra2 = scanner.nextLine();
        scanner.close();

        System.out.println(palabra1 + palabra2);
    }
}
