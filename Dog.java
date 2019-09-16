class Dog extends Animal {

    public Dog(String name, int numLegs) {
        //The Dog class constructor just calls the constructor of its super class Animal using the same arguments as passed into the Dog class constructor.
        super(name, numLegs);
    }

    @Override
    public String toString() {
        //This toString method overrides the Object toString method and returns the name of the dog object. 
        return name;
    }

}