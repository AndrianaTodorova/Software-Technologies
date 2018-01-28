import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Problem_20_CountWorkingDays {
    public static boolean IsHolidayInBulgaria(Calendar startDate) {

        int month = startDate.get(Calendar.MONTH);
        int day = startDate.get(Calendar.DATE);
        month++;
        String dateAsString = day + "-" + month;

        String[] holidaysInBulgaria = { "1-1", "3-3", "1-5",
                "6-5", "24-5", "6-9", "22-9",
                "1-11", "24-12", "25-12", "26-12" };

        return Arrays.asList(holidaysInBulgaria).contains(dateAsString);
    }
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        String startDate = scanner.nextLine();
        Date startDateStr = sdf.parse(startDate);
        Calendar startDateCal = Calendar.getInstance();
        startDateCal.setTime(startDateStr);
        String endDate = scanner.nextLine();
        Date endDateStr = sdf.parse(endDate);
        Calendar endDateCal = Calendar.getInstance();
        endDateCal.setTime(endDateStr);
        endDateCal.add(Calendar.DATE,1);

        int count=0;
        while (!startDateCal.equals(endDateCal)){
            if (startDateCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY &&
                    startDateCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY &&
                    !IsHolidayInBulgaria(startDateCal)) {

                count++;
            }

            startDateCal.add(Calendar.DATE, 1);
        }

        System.out.println(count);
        }

    }

