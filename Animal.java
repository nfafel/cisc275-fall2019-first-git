class Animal {
    //Every Animal object, no matter the kind of animal, will have a name and a number of legs
    private int numLegs;
    String name;

    public Animal(String name, int numLegs) {
        /* This constructor takes two variable which are the name of the animal, a String, and the number of legs of the animal, an int.
         * This constructor then sets the name and numLegs attributes with the appropriate argument values. */
        this.numLegs = numLegs;
        this.name = name;
    }
    
    public int getLegs() {
        //This is a getter method for the private attribute numLegs.
        return numLegs;
    }
}