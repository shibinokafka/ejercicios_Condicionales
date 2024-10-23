import java.io.*;
public class condicional1_5 {
    public static void main(String[] args) throws IOException {
        char car1, car2;
        System.out.print("Introduzca primer carácter: ");
        car1 = (char) System.in.read();
        System.in.read();
        System.out.print("Introduzca segundo carácter: ");
        car2 = (char) System.in.read();
        if (car1 == car2)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");
    }
}
