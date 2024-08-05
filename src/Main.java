import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String a = "a";
        int[] test = new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(test)));
    }


    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] * nums[i];
        }
        Arrays.sort(res);
        return res;
    }

}
