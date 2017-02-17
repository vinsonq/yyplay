package arithmetic.sort;

/**
 * Created by chensong on 2017/2/17.
 */
public class Quick {
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 4, 2, 5, 3, 55};
        sort(array, 3, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static void sort(int[] array, int key, int left, int right) {
        if (left >= right) {
            return;
        }
        int start = left, end = right;
        while (left < right) {
            while (array[right] >= key && right > left) {
                right--;
            }

            while (array[left] <= key && left < right) {
                left++;
            }
            if (left == right) {
                int tmp = array[start];
                array[start] = array[left];
                array[left] = tmp;
            } else {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }

        }
        sort(array, array[start], start, left - 1);
        sort(array, array[right + 1], right + 1, end);
    }
}
