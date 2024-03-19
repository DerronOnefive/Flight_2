/**
 * ClassName:ThingsThatMove
 * @Author:Derron
 * @Version:1.0
 * Course:ITEC 2140
 * Date: 3/18/2024
 */
// Main class to run the program
public class ThingsThatMove {
    public static void main(String[] args) {
        // Create an array to store instances of Movement
        Movement[] movingThings = new Movement[3];
        // Create instances of Airplane and Bird and store them in the array
        movingThings[0] = new Airplane("Boeing 747", 2016);
        movingThings[1] = new Bird("Eagle");
        movingThings[2] = new Bird("Hummingbird");

        // Loop through the array and print information about each moving thing
        for (Movement movingThing : movingThings) {
            // Print the type of moving thing
            System.out.println(movingThing.toString() + ": ");
            // Call the fly() method specific to each moving thing
            movingThing.fly();
            // Call the walk() method specific to each moving thing
            movingThing.walk();
            // Call the jump() method specific to each moving thing
            movingThing.jump();
            // Add a blank line for separation
            System.out.println();
        }
    }
}
