public class Counter {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(5);
        Numbers numbers2 = new Numbers();
        numbers.value();
        numbers2.value();
        numbers.increase();
        numbers.decrease();
        numbers.increaseBy(6);
        numbers.decreaseBy(4);
        numbers.decreaseBy(-4);
        numbers.value();
        }
    }

