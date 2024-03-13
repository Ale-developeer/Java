import java.util.Arrays;
import java.util.Scanner;

public class unAnagram {
    public static boolean sonAnagramas(String palabra1, String palabra2){
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
        char[] arregloPalabra1 = palabra1.toCharArray();
        char[] arregloPalabra2 = palabra2.toCharArray();
        Arrays.sort(arregloPalabra1);
        Arrays.sort(arregloPalabra2);
        return Arrays.equals(arregloPalabra1, arregloPalabra2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese primer palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.print("ingrese segunda palabra: ");
        String palabra2 = scanner.nextLine();
        scanner.close();
        if (sonAnagramas(palabra1,palabra2)){
            System.out.println("son anagramas");
        } else {
            System.out.println("no son anagramas");
        }
    }
}
