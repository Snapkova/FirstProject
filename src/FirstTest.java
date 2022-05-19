import java.util.Arrays;

public class FirstTest {
    public static int[] oddIndices(int[] arr) {
        int newArrLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                newArrLength++;
            }
        }
        int[] newArr = new int[newArrLength];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                newArr[counter] = arr[i];
                counter++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arrTest = {-45, 590, 234, 985, 12, 68};
        System.out.println(Arrays.toString(oddIndices(arrTest)));
    }


}



