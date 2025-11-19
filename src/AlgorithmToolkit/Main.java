package AlgorithmToolkit;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {12, 5, 7, 3, 9, 1};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        // ---------------- SORTING TEST ----------------
        long timeMerge = AnalysisUtil.time(() -> SortingUtil.mergeSort(arr));

        System.out.println("\nAfter Merge Sort (Ascending):");
        System.out.println(Arrays.toString(arr));
        System.out.println("Merge Sort Time: " + timeMerge + " ns");

        // ---------------- SEARCH TEST ----------------
        int target = 9;

        long timeBinary = AnalysisUtil.time(() ->
                SearchUtil.binarySearch(arr, target)
        );

        int index = SearchUtil.binarySearch(arr, target);

        System.out.println("\nBinary Search:");
        System.out.println("Target = " + target);
        System.out.println("Found at index = " + index);
        System.out.println("Binary Search Time: " + timeBinary + " ns");

        // ---------------- STACK TEST ----------------
        CollectionUtil.Stack<String> stack = new CollectionUtil.Stack<>();

        System.out.println("\n--- Stack Operations ---");
        stack.push("Java");
        stack.push("DSA");
        stack.push("Toolkit");

        System.out.println("Top element: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top after pop: " + stack.peek());

        // ---------------- QUEUE TEST ----------------
        CollectionUtil.Queue<Integer> queue = new CollectionUtil.Queue<>();

        System.out.println("\n--- Queue Operations ---");
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Queue Empty? " + queue.isEmpty());
    }
}