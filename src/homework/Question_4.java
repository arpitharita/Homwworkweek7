package homework;
//
//Number of Days In Month
//        Write a method isLeapYear with a parameter of type int named year.
//        The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//        If the parameter is not in that range return false.
//        Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
//        otherwise return false.
//        A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
//        Example of input/Output:
//        ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
//        ● isLeapYear(1600); should return true since 1600 is a leap year
//        ● isLeapYear(2017); should return false since 2017 is not a leap year
//        ● isLeapYear(2000); should return true because 2000 is a leap year
//        Write another method getDaysInMonth with two parameter month and year. Both of type
//        int.
//        If parameter month is < 1 or >12 return -1.
//        If parameter year is <1 or >9999 than return -1.
//        This method needs to return the number of days in the month. Be careful about leap years
//        they have 29 days in month 2 (February).
//        You should check if the year is a leap year using the method isLeapYear describe above.
//        | Mark Sheet |
//        |
//        Name : Jay |
//        Roll No: 08 |
//        |
//        | Subjects : Marks |
//        |
//        Math : 98 |
//        Science : 90 |
//        English : 85 |
//        |
//        Total : 273 |
//        |
//        Percentage : 91.0 |
//        Result : Pass |
//        Grade : A+ |
//        |
//
//        Example of input/Output:
//        ● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
//        ● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
//
//        year.
//
//        ● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
//
//        2018 is not a leap year.
//
//        ● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
//        ● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
//
//        9999
//
//        HINT: Use the switch statement.
//        NOTE: Methods isLeapYear and getDaysInMonth need to be public static

public class Question_4 {
    public static void main(String[] args) {
        Question_4 que = new Question_4();
        que.isleapyear(2006);
        que.getDaysMonth(2,2021);
    }

    private void isleapyear(int year) {
        boolean result;
        if(year < 1 && year>9999 ){
            System.out.println("Not in range");
        }
        else{
            if(0 == (year % 4) && (0 !=(year % 100)||(0 ==(year % 400)))){
                System.out.println("This is leap year ");
            }
            else {
                System.out.println("This is not leap year ");
            }
        }
        //boolean stap;
    }

    public static void getDaysMonth(int month, int year) {
        int t1 = month;
        int t2 = year;
        switch (t1) {
            case 1:
                System.out.println("January" + t2 + "Has 31 days");
                break;
            case 2:
                System.out.println("February" + t2 + "Either 28 or Either 29 days");
                break;
            case 3:
                System.out.println("March" + t2 + "Has 31 days");
                break;
            case 4:
                System.out.println("April" + t2 + "Has 30 days");
                break;
            case 5:
                System.out.println("May" + t2 + "Has 31 days");
                break;
            case 6:
                System.out.println("Jun" + t2 + "Has 30 days");
                break;
            case 7:
                System.out.println("July" + t2 + "Has 30 days");
                break;
            case 8:
                System.out.println("August" + t2 + "Has 31 days");
                break;
            case 9:
                System.out.println("September" + t2 + "Has 30 days");

            case 10:
                System.out.println("October" + t2 + "Has 31 days");
                break;
            case 11:
                System.out.println("November" + t2 +"Has 30 days");
                break;
            case 12:
                System.out.println("December" + t2 +"Has 31 days");
                break;
            default:
                System.out.println("valid nuber between 1 to 12");

        }
    }
}
