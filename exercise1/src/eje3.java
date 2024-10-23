import java.io.*;
import java.util.*;
public class eje3{
    public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);
        char car, car1;
        System.out.print("Introduzca un carácter: ");
        car = (char)System.in.read();

        if (Character.isUpperCase(car)) {
            System.out.println("Es una letra mayus");
        } else {
            System.out.println("es una letra minus");
        }
        }
}