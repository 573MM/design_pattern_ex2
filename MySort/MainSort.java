package MySort;

public class MainSort {
    public static void main(String[] args) {
        ChooseSort.choose(new SelectionSort());
        ChooseSort.choose(new InsertionSort());
        ChooseSort.choose(new MergeSort());
    }

    
}
