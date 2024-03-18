public class TeenNumberChecker {
  public static boolean hasTeen(int first, int second, int third) {
    boolean isFirstTeen = (first >= 13 && first <= 19);
    boolean isSecondTeen = (second >= 13 && second <= 19);
    boolean isThirdTeen = (third >= 13 && third <= 19);
    if (isFirstTeen || isSecondTeen || isThirdTeen) {
      return true;
    }
    return false;
  }

  public static boolean isTeen(int age) {
    return (age >= 13 && age <= 19);
  }
}
