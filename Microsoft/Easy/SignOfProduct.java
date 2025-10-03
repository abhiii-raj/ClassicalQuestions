public class SignOfProduct {
    public static int arraySign(int nums[]) {
        /*
         * QSP -> if the product of elements of an integer
         *        array is negative means the negative numbers are odd by number
         */

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                count++;
            }
        }

        if (count % 2 != 0) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String args[]) {
        int arr[] = { -1, -2, -3, -4, 3, 2, 1 };
        int arr1[] = { 1, 5, 0, 2, -3 };
        int arr2[] = { -1, 1, -1, 1, -1 };

        System.out.println(arraySign(arr));
        System.out.println(arraySign(arr1));
        System.out.println(arraySign(arr2));

        int a = 1;
        Integer b = Integer.valueOf(a);
        String str = "abhi";

        Integer.valueOf(str);
        
    }
}
