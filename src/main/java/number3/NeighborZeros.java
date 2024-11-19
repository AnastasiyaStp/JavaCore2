package number3;

public class NeighborZeros {

    public static boolean hasAdjacentZeros(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }

        return false;
    }
}