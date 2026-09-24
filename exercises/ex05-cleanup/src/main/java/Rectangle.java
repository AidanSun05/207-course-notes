/**
 * Represents a 2D rectangle with width and height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructs a new Rectangle with given dimensions.
   *
   * @param w Width of the new Rectangle
   * @param h Height of the new Rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Gets the area of this rectangle.
   *
   * @return The area (width times height)
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor The scale factor to multiply by
   */
  public void scale(double factor) {
    width *= factor;
    height *= factor;
  }

  /**
   * Checks whether this rectangle is larger than another.
   *
   * @param other The rectangle to compare to
   * @return Whether the area of this rectangle is greater than the other's
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
