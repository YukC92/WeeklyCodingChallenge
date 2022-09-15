//Create a function that reorders the digits of each numerical element in an array based ascending (asc) or decending (desc) order.

import java.util.*;

public class Solutions {
	public static int[] reorderDigits(int[] numArr, String order) {
        if (order.equals("asc")) {
			for (int i = 0; i < numArr.length; i++) {
				int num = numArr[i];
				ArrayList<Integer> tempArr = new ArrayList<>();
				while (num > 0) {
					tempArr.add(temp%10);
					num /= 10;
				}
				Collections.sort(tempArr);
				for (int j = tempArr.size()-1; j >= 0; j--) {
					num += tempArr.get(j) * Math.pow(10, tempArr.size()-j-1);
				}
				numArr[i] = num;
			}
		} else if (order.equals("dsc")) {
			for (int i = 0; i < numArr.length; i++) {
				int num = numArr[i];
				ArrayList<Integer> tempArr = new ArrayList<>();
				while (num > 0) {
					//System.out.println(temp/10);
					tempArr.add(temp%10);
					num /= 10;
				}
				Collections.sort(tempArr);
				for (int j = 0; j < tempArr.size(); j++) {
					num += tempArr.get(j) * Math.pow(10, j);
				}
				numArr[i] = num;
			}
		}
		
		return numArr;
	}
}