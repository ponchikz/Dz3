package Zadanie2;

public class Main {
    public  static void main(String[] args) {

        Apple_extends_Fruit[] apples = new Apple_extends_Fruit[10];
        Apple_extends_Fruit apple0 = new Apple_extends_Fruit(2);
        Apple_extends_Fruit apple1 = new Apple_extends_Fruit(2);
        apples[0] = apple0;
        apples[1] = apple1;
        Box<Apple_extends_Fruit> carton1 = new Box<>(apples);

        Apple_extends_Fruit[] apples2 = new Apple_extends_Fruit[10];
        Apple_extends_Fruit apple2 = new Apple_extends_Fruit( 4);
        apples2[0] = apple2;
        Box<Apple_extends_Fruit> carton2 = new Box<>(apples2);

        System.out.println(carton1.getWeight());
        System.out.println(carton1.compare(carton2));

        carton1.toEmptyCarton(carton2);



        Orange_extends_Fruit[] oranges = new Orange_extends_Fruit[10];
        Orange_extends_Fruit orange0 = new Orange_extends_Fruit(2);
        oranges[0] = orange0;
        Box<Orange_extends_Fruit> carton3 = new Box<>(oranges);
        carton1.compare(carton3);


        Orange_extends_Fruit[] oranges1 = new Orange_extends_Fruit[10];
        Orange_extends_Fruit orange1 = new Orange_extends_Fruit(8);
        oranges1[1] = orange1;
        Box<Orange_extends_Fruit> carton4 = new Box<>(oranges1);


        System.out.println(carton3.getWeight());// сколько долларов
        System.out.println(carton3.compare(carton4));

        carton3.toEmptyCarton(carton4);

        System.out.println(carton1.compare(carton3));
    }

}
