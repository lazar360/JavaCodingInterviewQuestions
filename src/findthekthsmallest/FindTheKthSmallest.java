package findthekthsmallest;

import java.util.Arrays;

public class FindTheKthSmallest {

    public static void main(String[] args) {

        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 3; // Find the 3rd smallest element
        array = Arrays.stream(array).sorted().toArray();
        int smallest = array[k-1];

        System.out.println(k+"th smallest number : " + smallest);
    }


}
