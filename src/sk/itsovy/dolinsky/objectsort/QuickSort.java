package sk.itsovy.dolinsky.objectsort;

/**
 * @author Martin Dolinsky
 */
public class QuickSort {
	private int partition(Student[] arr, int begin, int end) {
		Student pivot = arr[end];
		int i = (begin-1);

		for (int j = begin; j < end; j++) {
			if (arr[j].compareTo(pivot) <= 0) {
				i++;

				Student swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}

		Student swapTemp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = swapTemp;

		return i+1;
	}

	public void quickSort(Student[] arr, int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);

			quickSort(arr, begin, partitionIndex-1);
			quickSort(arr, partitionIndex+1, end);
		}
	}
}
