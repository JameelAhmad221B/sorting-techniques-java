
// Jameel Ahmad

public class SelectionSort {
	
    public static void main(String[] args) {
        int[] array = {32,13,6,11,5};
			
        System.out.println("Unsorted array");
        printArray(array);
			
        selectionSort(array);
			
        System.out.println("Sorted array");
        printArray(array);
    }
	
    public static void selectionSort(int[] array) {
			int minimum, temp;
        for (int i = 0; i < array.length-1; i++) {
            minimum = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j] < array[minimum]) minimum = j;
					  temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
        }
    }
	
    public static void printArray(int[] array) {
        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }
}
