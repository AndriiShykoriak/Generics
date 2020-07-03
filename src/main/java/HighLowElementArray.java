public class HighLowElementArray<T extends Comparable> {
    private T[] array;

    public HighLowElementArray(T[] array) {
        this.array = array;
    }

    public T getHighElementArray() {
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public T getLowElementArray() {
        T min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }
}
