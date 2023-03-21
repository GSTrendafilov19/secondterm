import java.util.Iterator;

public class Garage implements Iterable<Car>{
    private Car[] cars;

    public Garage(Car... cars) {
        this.cars = cars;
    }

    private final class GarageIterator implements Iterator<Car> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Car next() {
            return null;
        }
    }

    @Override
    public Iterator<Car> iterator() {
        return null;
    }

    public void test() {
        for (int i = 0; i < 10; i++) {

        }
    }
}
