package patrones_comportamiento.strategy.strategy_laboratory;

public class QuickSortStrategy implements SortStrategy{


    @Override
    public void sort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("Array sorted using Quick Sort");
    }

    private void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int pi = partition(numbers, low, high);
            quickSort(numbers, low, pi - 1);
            quickSort(numbers, pi + 1, high);
        }
    }

    private int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (numbers[j] < pivot) {
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[high];
        numbers[high] = temp;
        return i + 1;
    }
}
