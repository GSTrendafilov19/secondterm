import java.util.Iterator;

public class Garage implements Iterable<Car>{
    private Car[] cars;

    public Garage(Car... cars) {
        this.cars = cars;
    }

    private final class GarageIterator implements Iterator<Car> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return this.index < cars.length;
        }

        @Override
        public Car next() {
            return cars[index++];
        }
    }

    @Override
    public Iterator<Car> iterator() {
        return new GarageIterator();
    }

    public void test() {
        for (int i = 0; i < 10; i++) {

        }
    }
}
