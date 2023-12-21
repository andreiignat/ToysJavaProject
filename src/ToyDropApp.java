import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Random;

public class ToyDropApp {
    private PriorityQueue<Toy> toyQueue = new PriorityQueue<>((t1, t2) -> t2.getToyDropFrequency() - t1.getToyDropFrequency());

    public void addToy(Toy toy) {
        toyQueue.add(toy);
    }

    public Toy getToy() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        if (randomNumber < 20) {
            return getRandomToy(1);
        } else if (randomNumber < 40) {
            return getRandomToy(2);
        } else {
            return getRandomToy(3);
        }
    }

    private Toy getRandomToy(int toyId) {
        for (Toy toy : toyQueue) {
            if (toy.getToyId() == toyId) {
                return toy;
            }
        }
        return null;
    }

    public void writeResultToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (int i = 0; i < 10; i++) {

                Toy toy = getToy();
                writer.write("attempt: " + i + "  ID: " + toy.getToyId() + ", Name: " + toy.getToyName() + ", Frequency: " + toy.getToyDropFrequency() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}