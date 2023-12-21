public class main {
    public static void main(String[] args) {
        ToyDropApp toyCollection = new ToyDropApp();


        String[] toyStrings = {"1 2 constructor", "2 2 robot", "3 6 doll"};

        for (String toyString : toyStrings) {
            String[] parts = toyString.split(" ");
            int toyId = Integer.parseInt(parts[0]);
            int toyDropFrequency = Integer.parseInt(parts[1]);
            String toyName = parts[2];

            Toy toy = new Toy(toyId, toyName, toyDropFrequency);
            toyCollection.addToy(toy);
        }


        toyCollection.writeResultToFile("Result.txt");
    }
}