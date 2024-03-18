public class BarkingDog {
  public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
    boolean wakeUp = false;
    if ((hourOfDay < 0) || (hourOfDay > 23)) {
      return false;
    }
    if (isBarking && ((hourOfDay < 8) || (hourOfDay > 22))) {
      wakeUp = true;
    }
    return wakeUp;
  }
}
