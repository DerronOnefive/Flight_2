/**
 * ClassName:Flight_2
 * @Author:Derron
 * @Version:1.0
 * Course:ITEC 2140
 * Date: 3/18/2024
 */
// Airplane class implementing the Movement interface
class Airplane implements Movement {
    private String model;
    private int yearBuilt;

    // Constructor for Airplane
    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    // Getter and setter methods for model attribute
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and setter methods for yearBuilt attribute
    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    // Implementation of the fly() method for Airplane
    @Override
    public void fly() {
        System.out.println("I rely on my engine to fly.");
    }

    // Implementation of the walk() method for Airplane
    @Override
    public void walk() {
        System.out.println("I tax on my wheels.");
    }

    // Implementation of the jump() method for Airplane
    @Override
    public void jump() {
        System.out.println("I cannot jump.");
    }

    // Override the toString() method to provide a string representation of the Airplane object
    @Override
    public String toString() {
        return "Airplane [model=" + model + ", year=" + yearBuilt + "]";
    }
}
