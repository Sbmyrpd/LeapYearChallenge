public class Main {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000) ? "Is leap year" : "Not a leap year");
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                return true;
            }
        } else {
            return false;
        }
        return false;

    }
}