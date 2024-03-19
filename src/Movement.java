/**
 * ClassName:Movement
 * @Author:Derron
 * @Version:1.0
 * Course:ITEC 2140
 * Date: 3/18/2024
 */
// Interface defining the movement behavior, extending the Flight interface
interface Movement extends Flight {
    void walk(); // Method to perform walking action
    void jump(); // Method to perform jumping action
}
