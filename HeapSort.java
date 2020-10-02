package heapSorting;

class HeapSort {
	static void sort(int[] array) {
		
		Heap heap = new Heap(array);
		heap.buildMaxHeap();
		
		for (int i = array.length - 1; i >= 1; i--) {
			heap.swap(array,i,0);
			heap.heapSize = heap.heapSize - 1;
			heap.maxHeapify(array, 0);
		}
	}

}
