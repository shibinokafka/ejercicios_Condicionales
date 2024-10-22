import java.util.Scanner;

public class CondicionalDividir {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        double dividendo, divisor;

        
        System.out.println("Programa para dividir dos números. No se permite división por cero.");

        
        System.out.print("Introduzca el dividendo: ");
        dividendo = sc.nextDouble(); 

       
        System.out.print("Introduzca el divisor: ");
        divisor = sc.nextDouble(); 

        
        if (divisor == 0) {
        
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            double resultado = dividendo / divisor;
            
           
            System.out.println(dividendo + " / " + divisor + " = " + resultado);

            
            System.out.printf("%.2f / %.2f = %.2f%n", dividendo, divisor, resultado);
        }
    }
}
