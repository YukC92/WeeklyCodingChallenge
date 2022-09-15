//Wrtie a function that return true if you can partition an array into one element and the rest, 
//such that this element is equal to the product of all other elements excluding itself.

public class Solutions {
    public static boolean canPartition(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            int product = 1;
            for (int j = 0; j < numArr.length; j++) {
                if (j = i) {
                    continue;
                } else {
                    product *= numArr[j];
                }
            }
            if (product == numArr[i]) {
                return true;
            }
        }
        return false;
    }
}