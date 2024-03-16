public class deciAbina {
    public static void deciToBina(int decimal){
        var number = decimal;
        var binary="";

        while (number != 0){
            var reminder=number%2;
            number /= 2;
            binary = reminder + " "+binary;
        }
        System.out.println(binary);
    }

    public static void main(String[] args) {
        deciToBina(0);
        deciToBina(8);
    }

}
