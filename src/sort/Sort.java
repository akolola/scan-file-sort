package sort;

public class Sort {

	public Integer lastMinInArr(Integer[] numArr) {

		int i;
		Integer min;
		final Integer MAXINT = 2147483647;
		Integer cellNumMin = 0;

		min = numArr[0];
		for (i = 0; i < numArr.length; i++) {

			if (min > numArr[i]) {

				min = numArr[i];
				cellNumMin = i;

			}

		}

		numArr[cellNumMin] = MAXINT;
		return min;
	};

	public Integer[] createSortedArr(Integer[] numArr) {

		int k;
		Integer[] sortedNumArr = new Integer[numArr.length];

		for (k = 0; k < numArr.length; k++) {

			sortedNumArr[k] = lastMinInArr(numArr);

		}

		return sortedNumArr;

	};
	
	
	

}
