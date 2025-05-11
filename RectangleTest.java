// Rectangle class
class Rectangle {
    // Private fields
    private double length;
    private double width;

    // Setter methods to assign values
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive!");
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive!");
        }
    }

    // Getter method to return area
    public double getArea() {
        return length * width;
    }

    // Getter method to return perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Main class to test the Rectangle class
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        
        obj.setLength(5);
        obj.setWidth(3);

        System.out.println("Area: " + obj.getArea());
        System.out.println("Perimeter: " +obj.getPerimeter());
    }
}