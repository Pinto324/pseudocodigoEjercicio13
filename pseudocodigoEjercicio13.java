import java.util.InputMismatchException;
import java.util.*;
 
public class pseudocodigoEjercicio13{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        double a,b,suma,division;
        int opcion;
        while (!salir) {
            System.out.println("1. Sumar 2 Nmeros");
            System.out.println("2. Dividir 2 Numeros");
            System.out.println("3. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese un numero");
                        a = sn.nextDouble();
                        System.out.println("Ingrese otro numero");
                        b = sn.nextDouble();
                        suma = a+b;
                        System.out.println("El Resultado de la Suma es "+suma);
                        break;
                    case 2:
                         System.out.println("Ingrese un numero");
                         a = sn.nextDouble();
                         System.out.println("Ingrese otro numero");
                         b = sn.nextDouble();
                         division = a/b;
                         System.out.println("El Resultado de la Division es "+division);
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        sn.close();
    }
 
}