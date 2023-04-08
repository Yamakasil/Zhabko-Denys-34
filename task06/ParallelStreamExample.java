package task06;

import java.util.Arrays;

public class ParallelStreamExample {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        
        int min = Arrays.stream(array).parallel().min().getAsInt();
        System.out.println("Minimum value: " + min);
        
        int max = Arrays.stream(array).parallel().max().getAsInt();
        System.out.println("Maximum value: " + max);
    }
}
