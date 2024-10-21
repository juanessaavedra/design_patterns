package patrones_comportamiento.strategy.strategy_laboratory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortContext context = new SortContext();

        int[] array = {64, 34, 25, 12, 22, 11, 90};

        context.setSortStrategy(new BubbleSortStrategy());
        context.executeStrategy(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        array = new int[]{64, 34, 25, 12, 22, 11, 90};
        context.setSortStrategy(new QuickSortStrategy());
        context.executeStrategy(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        array = new int[]{64, 34, 25, 12, 22, 11, 90};
        context.setSortStrategy(new MergeSortStrategy());
        context.executeStrategy(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
    }
}
