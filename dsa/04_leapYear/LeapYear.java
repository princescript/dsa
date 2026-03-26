
public class LeapYear {

    public static void main(String[] args) {
        //Check year is Leap or not.
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Year is Leap" + " " + year);
        } else {
            System.out.println("Year is not Leap" + " " + year);
        }
    }
}
