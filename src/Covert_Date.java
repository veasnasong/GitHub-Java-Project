import java.util.Scanner;

public class Covert_Date {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a short date (YYYY-MM-DD): ");
                String shortDate = scanner.nextLine();
                String[] dates = shortDate.split("-");
                int year = Integer.parseInt(dates[0]);
                int month = Integer.parseInt(dates[1]);
                int day = Integer.parseInt(dates[2]);
                String monthName = getMonthName(month);
                System.out.println("Full Date: " + monthName + " " + day + ", " + year);
                scanner.close();
            }

            private static String getMonthName(int month) {
                String[] monthNames = {
                        "January", "February", "March", "April",
                        "May", "June", "July", "August",
                        "September", "October", "November", "December"
                };

                if (month >= 1 && month <= 12) {
                    return monthNames[month - 1];
                } else {
                    return "Invalid Month";
                }
            }



}
