public class NextDayCalculator {
    public static String input(int day, int month, int year) {

        int dayInMonth = 0;
        int monthInyear = 12;
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if (isDivisibleBy4) {
            if (isDivisibleBy100){
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
                else {
                    isLeapYear = true;
                }
            }
        }


        switch (month) {
            case 2:
                if (isLeapYear){
                    dayInMonth = 28;
                } else {
                    dayInMonth = 29;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = 30;
                break;
            default:
                ;
        }


        if ( day < dayInMonth){
            day++;
        }
        if (day >= dayInMonth){
            day = 1;
            month++;
        }
        if ( month > monthInyear){
            month = 1;
            year++;
        }

        return day + "/" + month + "/" + year;

    }
}
