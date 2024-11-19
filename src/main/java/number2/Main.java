package number2;

import static number2.ArrayDifference.differenceMaxMin;

public class Main {

    public static void main(String[] args) {

        System.out.println(differenceMaxMin(new int[]{1, 3, 5, 7, 9}));
        System.out.println(differenceMaxMin(new int[]{-10, -1, -5, -7}));
        System.out.println(differenceMaxMin(new int[]{2, 2, 2, 2}));
    }
}
