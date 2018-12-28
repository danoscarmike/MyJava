import java.time.LocalDateTime;
import java.time.format.*;
import java.text.NumberFormat;

class Formats {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        NumberFormat pf = NumberFormat.getPercentInstance();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalDateTime date = LocalDateTime.now();
        int gazillions = 1234567892;
        float aFewBucks = 3.25f;
        float threeQuarters = 0.75f;

        System.out.println("The month is: " + date.format(df));
        System.out.println("The time is: " + date.format(tf));
        System.out.println("Grouped number: " + nf.format(gazillions));
        System.out.println("Three dollars, 25c: " + cf.format(aFewBucks));
        System.out.println("Three quarter: " + pf.format(threeQuarters));
    }
}