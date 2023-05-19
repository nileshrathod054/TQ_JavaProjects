package arrayListExtraAssignment;

import java.util.ArrayList;
import java.util.List;

public class PowerOfTwoMaxHeap<T extends Comparable<T>> {
	private List<T> heap;
	private int degree;

	public PowerOfTwoMaxHeap(int degree) {
		this.heap = new ArrayList<>();
		this.degree = degree;
	}

	public void insert(T value) {
		heap.add(value);
		heapifyUp(heap.size() - 1);
	}

	public T popMax() {
		if (heap.isEmpty()) {
			throw new IllegalStateException("Heap is empty");
		}

		T max = heap.get(0);
		int lastIndex = heap.size() - 1;
		heap.set(0, heap.get(lastIndex));
		heap.remove(lastIndex);
		heapifyDown(0);

		return max;
	}

	private void heapifyUp(int index) {
		int parent = (index - 1) / degree;

		while (index > 0 && heap.get(index).compareTo(heap.get(parent)) > 0) {
			swap(index, parent);
			index = parent;
			parent = (index - 1) / degree;
		}
	}

	private void heapifyDown(int index) {
		int maxChild;

		while (true) {
			maxChild = getMaxChild(index);

			if (maxChild == -1 || heap.get(index).compareTo(heap.get(maxChild)) >= 0) {
				break;
			}

			swap(index, maxChild);
			index = maxChild;
		}
	}

	private int getMaxChild(int index) {
		int leftChild = index * degree + 1;
		int rightChild = leftChild + degree - 1;
		int maxChild = -1;
		T maxValue = null;

		for (int i = leftChild; i <= rightChild && i < heap.size(); i++) {
			T value = heap.get(i);

			if (maxValue == null || value.compareTo(maxValue) > 0) {
				maxValue = value;
				maxChild = i;
			}
		}

		return maxChild;
	}

	private void swap(int i, int j) {
		T temp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
}
