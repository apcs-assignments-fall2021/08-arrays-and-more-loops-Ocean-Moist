import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int[] arr1 = new int[arr.length];
        int tmp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr1[i-1] = arr[i];
        }
        arr1[arr1.length-1] = tmp;
        return arr1;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int[] arr1 = new int[arr.length];
        int tmp = arr[arr.length-1];
        for (int i = 1; i < arr.length ; i++) {
            arr1[i] = arr[i-1];
        }
        arr1[0] = tmp;
        return arr1;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) { // definetly there exists a more time efficient way to do this
        int[] arr1 = new int[arr.length];
        int k = 0;
        for (int i : arr) {
            for (int j : arr1) {
                if (i == j) {
                    arr[k] = -1;
                }
            }
            arr1[k] = arr[k];
            k++;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {0,1,2};
        System.out.println(Arrays.toString(rotateLeft(arr)));
        System.out.println(Arrays.toString(rotateRight(arr)));
        System.out.println(Arrays.toString(duplicateReplacer(new int[]{1, 1, 2, 3})));
    }
}
