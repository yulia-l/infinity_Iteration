import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected final int min;
    protected final int interval;

    public Randoms(int min, int max) {
        this.min = min;
        this.interval = max - min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                while (true) {
                    return (random.nextInt(interval + 1) + min);
                }
            }
        };
    }
}