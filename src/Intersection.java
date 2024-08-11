import java.util.Arrays;

public class Intersection {

    public static void main(String[] args) {

    }

    public static int[] intersection(int[] a, int[] b) {
        int[] counterA = new int[1001];
        int[] counterB = new int[1001];
        for (int i : a) {
            counterA[i] ++;
        }
        for (int i : b) {
            counterB[i] ++;
        }
        int[] result = new int[1];
        int length = 0;
        for (int i = 0; i < counterA.length; i++) {
            if (counterA[i] > 0 && counterB[i] > 0) {
                result = Arrays.copyOf(result, length + 1);
                result[length] = i;
                length ++;
            }
        }
        return result;
    }

}
