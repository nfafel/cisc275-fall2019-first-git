class Dog extends Animal {
    //The Dog class extends the Animal class, so it will inherit all of the Animal class's attributes and methods.

    public Dog(String name, int numLegs) {
        //The Dog class constructor just calls the constructor of its super class Animal, passing its arguments into the parameters of the call to super class constructor.
        super(name, numLegs);
    }

    @Override
    public String toString() {
        //This toString method overrides the Object toString method and returns the name of the dog object. 
        return name;
    }

}