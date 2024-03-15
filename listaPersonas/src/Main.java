import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        ArrayList<Object> nomb = new ArrayList<>();
        ArrayList<String> apell = new ArrayList<>();
        ArrayList<Integer> eda= new ArrayList<>();
        ArrayList<String> dni = new ArrayList<>();
        ArrayList<String> sex = new ArrayList<>();

        while (true) {
            nomb.add(Datos.nombre()) ;
            apell.add(Apellido.apellido()) ;
            eda.add(Edad.edad()) ;
            dni.add(DNI.dni()) ;
            sex.add(Sexo.sexo()) ;


            System.out.println("terminar la carga ??");
            respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí")) {
                System.out.println("continuar carga..");
            } else {
                System.out.println("carga completa. ");
                break;

            }

        }
        scanner.close();
        System.out.println("Consultas_");

        System.out.println("Consulta 1 \n  El que tiene mayor edad y las personas de sexo femenino ");
        int maximo = Integer.MIN_VALUE;
        for (int edamax : eda){
            if (edamax > maximo){
                maximo = edamax;
            }
        }
        System.out.println( "es correcto " + maximo);

        System.out.println("Consulta 2 \n De las personas que tienen el mismo apellido ");

        System.out.println("Consulta 3 \n Mostrara quien tiene el Numero de DNI mayor ");

        System.out.println("Consulta 4 \n Mostarar la lista completa ingresada ");

    }
}