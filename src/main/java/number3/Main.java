package number3;

import static number3.NeighborZeros.hasAdjacentZeros;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasAdjacentZeros(new int[]{1, 0, 0, 2})); // → true
        System.out.println(hasAdjacentZeros(new int[]{0, 1, 2, 0})); // → false
        System.out.println(hasAdjacentZeros(new int[]{0, 0, 0})); // → true
    }
}
