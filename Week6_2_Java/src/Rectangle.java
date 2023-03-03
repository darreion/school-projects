public class Rectangle {
    private double length;  // the length of the rectangle
    private double width;   // the width of the rectangle

    // constructor with no arguments, sets length and width to 1.0
    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    // constructor with arguments, sets length and width using the setLength and setWidth methods
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // getter for length
    public double getLength() {
        return length;
    }

    // setter for length, throws an exception if length is not between 0.0 (exclusive) and 20.0 (exclusive)
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be between 0.0 and 20.0 (exclusive)");
        }
    }

    // getter for width
    public double getWidth() {
        return width;
    }

    // setter for width, throws an exception if width is not between 0.0 (exclusive) and 20.0 (exclusive)
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be between 0.0 and 20.0 (exclusive)");
        }
    }

    // calculates and returns the area of the rectangle
    public double getArea() {
        return length * width;
    }

    // calculates and returns the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
