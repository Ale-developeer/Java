import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        List<Personas> personas = new ArrayList<>();


        while (true) {
            String nombre = Nombres.nombre();
            String apellido = Apellido.apellido();
            Integer edad = Edad.edad();
            Integer dni = DNI.dni();
            String sexo = Sexo.sexo();

            if (!sexo.equalsIgnoreCase("masculino") && !sexo.equalsIgnoreCase("femenino") ){
                continue;
            }

            Personas persona = new Personas(nombre, apellido, edad, dni, sexo);
            personas.add(persona);

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
        System.out.println("Consultas_ Mostrar_Nombre_y_Apellido");

        System.out.println("Consulta 1 \n  El que tiene mayor edad y las personas de sexo femenino ");
        Personas personaMayor = null;
        for (Personas persona : personas) {
            if (personaMayor == null || persona.getEdad() > personaMayor.getEdad()) {
                personaMayor = persona;
            }
        }
        if (personaMayor != null){
            System.out.println(" Mayor Edad : " + personaMayor.getNombre() + " " + personaMayor.getApellido());
        }
        for (Personas persona : personas){
            if (persona.getSexo().equalsIgnoreCase("femenino")) {
                System.out.println("Personas de sexo Femenino: " + persona.getNombre() + " " + persona.getApellido());
            }
        }

        System.out.println(" Consulta 2 \n  Nombre y Apellido de las personas que tienen el mismo apellido");
        for (Personas persona : personas){
            String apellidoActual=persona.getApellido();
            boolean mismoApellido=false;

            for (Personas otraPersona : personas){
                if (!personas.equals(otraPersona) && otraPersona.getApellido().equals(apellidoActual)) {
                    mismoApellido=true;
                    break;
                }
            }
            if (mismoApellido){
                System.out.println(persona.getNombre() + " " + persona.getApellido());
            }
        }
        System.out.println("Consulta 3 \n Mostrar el DNI mayor ");
        Personas personaDniMayor = null;
        for (Personas persona : personas) {
            if (personaDniMayor == null || persona.getDni() > personaMayor.getDni()) {
                personaDniMayor = persona;
            }
        }
        if (personaDniMayor != null){
            System.out.println("Dni Mayor : " + personaDniMayor.getNombre() + " " + personaDniMayor.getApellido());

        }
        System.out.println("Consulta 4 \n Mostrar la lista completa ingresada");
        System.out.println("Lista Completa de Personas: ");
        for (Personas persona : personas){
            System.out.println("NOMBRES: "+ persona.getNombre());
            System.out.println("APELLIDOS: "+ persona.getApellido());
            System.out.println("EDAD: "+ persona.getEdad());
            System.out.println("DNI: "+ persona.getDni());
            System.out.println("SEXO: "+ persona.getSexo());

        }
    }
}