import java.util.*;
public class eje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Numero entero: ");
        N = sc.nextInt();
        if(N%10==0)
            System.out.println("es multiplo de 10");
            else
            System.out.println("no es multiplo de 10");
    }
}
