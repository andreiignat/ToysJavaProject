class Toy {
    int toyId;
    String toyName;
    int toyDropFrequency;

    public Toy(int toyId, String toyName, int toyDropFrequency) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.toyDropFrequency = toyDropFrequency;
    }

    public int getToyId() {
        return toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public int getToyDropFrequency() {
        return toyDropFrequency;
    }
}