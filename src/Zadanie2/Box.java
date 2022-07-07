package Zadanie2;


public class Box <T extends Fruit> {
    T[] fruitArray;

    public Box(T[] fruitArray) {
        this.fruitArray = fruitArray;
    }

    public Integer getWeight() {
        Integer result = 0;
        for (T t : getFruitArray()) {
            if (t != null) {
                Integer value = t.getCartonWeight();
                result = result + value;
            }
        }
        return result;
    }

    public Boolean compare(Box<? extends Fruit> box) {
        if (this.getWeight().intValue() == box.getWeight().intValue()) return true;
        return false;

    }

    public void toEmptyCarton(Box<T> box) {
        System.out.println("� ������� " + this.getWeight());
        System.out.println("� ��������� ������� " + box.getWeight());
        for(int i = 0; i< box.getFruitArray().length;i++) {
            if (box.getFruitArray()[i] != null) {
                this.getFruitArray()[getSize()] = box.getFruitArray()[i];
                box.getFruitArray()[i] = null;
            }
        }
        System.out.println("� ������� ����� ����������� " + this.getWeight());
        System.out.println("� ������� ������� " + box.getWeight() + '\n');
    }

    private int getSize() {
        int result = 0;
        for (T t : getFruitArray()) {
            if (t != null) result++;
        }
        return result;
    }

    public T[] getFruitArray() {
        return fruitArray;
    }

}


