public class methodOverloading {
  public static void main(String[] args) {
    System.out.println(convertToCentimeters(70));
  }

  public static double convertToCentimeters(int height_inches) {
    // inches to centimeters
    double centimeters = height_inches * 2.54;
    return centimeters;
  }

  public static double convertToCentimeters(int height_feet, int remaining_inches) {
    // feet+inches to centimeters

    int inches = (height_feet * 12) + remaining_inches;
    return convertToCentimeters(inches);
  }
}
