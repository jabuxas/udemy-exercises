public class SecondsAndMinutes {
    public static void main(String[] args){
    System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
       int minutes = seconds / 60;
       int remainingSeconds = seconds % 60;
       return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        int allMinutes = (seconds / 60) + minutes;
        int remainingSeconds = (seconds % 60);
        int hours = allMinutes / 60;
        int remainingMinutes = allMinutes % 60;
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }
}
