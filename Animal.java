class Animal {
    private int numLegs;
    String name;

    public Animal(String name, int numLegs) {
        this.numLegs = numLegs;
        this.name = name;
    }
    
    public int getLegs() {
        return numLegs;
    }
}