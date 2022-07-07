package Zadanie1;

public class SwapMain<T> {
    T intermediate;

    public SwapMain() {
    }

    public T[] swapElements(T[] array, int indexA, int indexB) {
        this.intermediate = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = this.intermediate;
        return array;
    }

}
