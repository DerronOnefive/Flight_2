/**
 * ClassName:Bird
 * @Author:Derron
 * @Version:1.0
 * Course:ITEC 2140
 * Date: 3/18/2024
 */
// Bird class implementing the Movement interface
class Bird implements Movement {
    private String type;

    // Constructor for Bird
    public Bird(String type) {
        this.type = type;
    }

    // Getter and setter methods for type attribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Implementation of the fly() method for Bird
    @Override
    public void fly() {
        System.out.println("I flap my wings to fly.");
    }

    // Implementation of the walk() method for Bird
    @Override
    public void walk() {
        System.out.println("I walk on my feet.");
    }

    // Implementation of the jump() method for Bird
    @Override
    public void jump() {
        System.out.println("I jump by leaping from my feet.");
    }

    // Override the toString() method to provide a string representation of the Bird object
    @Override
    public String toString() {
        return "Bird [type=" + type + "]";
    }
}
