 package heapSorting;

class Heap {

	int arrayLength;
	int heapSize;
	int[] array;

	Heap(int[] array) {

		arrayLength = array.length;
		heapSize = 0;
		this.array = array;

	}

	void buildMaxHeap() {

		heapSize = arrayLength;
		for (int i = arrayLength / 2; i >= 0; i--) {
			maxHeapify(array, i);
		}
	}

	void maxHeapify(int[] array, int i) {

		int left, right, largest;

		left = leftChild(i);
		right = rightChild(i);

		if (left < heapSize && array[left] > array[i])
			largest = left;
		else
			largest = i;

		if (right < heapSize && array[right] > array[largest])
			largest = right;

		if (largest != i) {
			swap(array, i, largest);
			maxHeapify(array, largest);
		}

	}

	void swap(int[] a, int i, int largest) {

		int temp = a[i];
		a[i] = a[largest];
		a[largest] = temp;

	}

	private int rightChild(int i) {
		return 2 * i + 2;
	}

	private int leftChild(int i) {
		return 2 * i + 1;
	}

}