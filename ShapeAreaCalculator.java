import javax.swing.JOptionPane;

public class ShapeAreaCalculator {

    public static void main(String[] args) {
        String choice = JOptionPane.showInputDialog(
            "Would you like to calculate the area of a rectangle or a circle?\nType 'r' for rectangle or 'c' for circle:"
        );

        if (choice == null) {
            JOptionPane.showMessageDialog(null, "No input provided. Exiting program.");
            return;
        }

        choice = choice.trim().toLowerCase();

        if (choice.equals("r")) {
            double length = getLength();
            double width = getWidth();
            double area = calculateRectangleArea(length, width);
            JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + area);
        } else if (choice.equals("c")) {
            double radius = getRadius();
            double area = calculateCircleArea(radius);
            JOptionPane.showMessageDialog(null, "The area of the circle is: " + area);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid choice. Please restart and enter 'r' or 'c'.");
        }
    }

    // ----- Rectangle methods -----
    public static double getLength() {
        String input = JOptionPane.showInputDialog("Enter the length of the rectangle:");
        return Double.parseDouble(input);
    }

    public static double getWidth() {
        String input = JOptionPane.showInputDialog("Enter the width of the rectangle:");
        return Double.parseDouble(input);
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // ----- Circle methods -----
    public static double getRadius() {
        String input = JOptionPane.showInputDialog("Enter the radius of the circle:");
        return Double.parseDouble(input);
    }

    public static double calculateCircleArea(double radius) {
        // Correct formula: A = π * r^2 (rounded to 4 decimal places)
        double area = Math.PI * Math.pow(radius, 2);
        return Math.round(area * 10000.0) / 10000.0;
    }
}