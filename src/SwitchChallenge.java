public class SwitchChallenge {
  public static void main(String[] args) {
    printDayOfWeek(9);
  }

  public static void enhancedSwitch() {

    char myChar = 'A';
    switch (myChar) {
      case 'A' -> System.out.println(myChar + " in NATO is Able");
      case 'B' -> System.out.println(myChar + " in NATO is Baker");
      case 'C' -> System.out.println(myChar + " in NATO is Charlie");
      case 'D' -> System.out.println(myChar + " in NATO is Dog");
      case 'E' -> System.out.println(myChar + " in NATO is Easy");
      default -> System.out.println(myChar + " is out of range");
    }
  }

  public static void printDayOfWeek(int day) {
    switch (day) {
      case 0:
        System.out.println("Sunday");
        break;
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Please specify a number between 0 and 6.");
        break;
    }
  }
}
