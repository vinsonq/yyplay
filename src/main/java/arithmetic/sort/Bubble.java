package arithmetic.sort;

/**
 * Created by chensong on 2017/2/17.
 */
public class Bubble {

    public static void main(String args[]) {
        int[] array = new int[]{5, 2, 1, 4, 3, 5};
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
