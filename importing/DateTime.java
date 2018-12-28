import java.time.ZonedDateTime;

class DateTime {
    public static void main(String[] args) {
        ZonedDateTime date = ZonedDateTime.now();

        System.out.println("Date and time is now: " + date);
        System.out.println("TEST - next year: " + date.withYear(date.getYear() + 1));

        String fields = "Year: \t\t" + date.getYear();
        fields += "\nMonth: \t\t" + date.getMonth();
        fields += "\nMonth (1-12): \t" + date.getMonthValue();
        fields += "\nDay: \t\t" + date.getDayOfWeek();
        fields += "\nDay (0-31): \t" + date.getDayOfMonth();
        fields += "\nHour (0-23): \t" + date.getHour();
        fields += "\nMinute: \t" + date.getMinute();
        fields += "\nSecond: \t" + date.getSecond();
        fields += "\nTime zone: \t" + date.getZone();

        System.out.println(fields);
    }
}