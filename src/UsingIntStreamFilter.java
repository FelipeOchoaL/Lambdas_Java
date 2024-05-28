import java.util.Arrays;
import java.util.stream.IntStream;
public class UsingIntStreamFilter {
    public static void main(String[] args) {
        int fuente[] = {3, 7, 4, 1, 5, 9};
        int array[] = {4,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //vamos a separar los valores impares y los vamos a ordenar.
        System.out.println(" Valores impares en orden ");
        IntStream.of(fuente).filter(x -> (x % 2 != 0)).sorted().forEach(x -> System.out.printf(" %d |", x));

        System.out.println("");
        System.out.println("------------------------------------------");

        //Ahora vamos a mostrar los valores mayores o iguales a 5 en fuente
        System.out.println("Mayores o iguales a 5:");
        IntStream.of(fuente).filter(x -> x >= 4).sorted().forEach(x -> System.out.printf(" %d |", x));
        System.out.println("");
        System.out.println("------------------------------------------");

    }

}
