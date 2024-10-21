package patrones_comportamiento.strategy.strategy_laboratory;

public class SortStrategyFactory {
    public static SortStrategy getSortStrategy(String type) {
        switch (type) {
            case "bubble":
                return new MergeSortStrategy();
            case "quick":
                return new QuickSortStrategy();
            case "merge":
                return new MergeSortStrategy();
            default:
                throw new IllegalArgumentException("Invalid sort strategy type");
        }
    }
}
