package task7;

class MonthUtils {
    private static Month[] months = new Month[12];

    public static void setMonths() {
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                    months[i].setMonthName("January");
                    months[i].setCountOfDays(31);
                    months[i].setCountOfWorkingDays(20);
                    break;
                case 1:
                    months[i].setMonthName("February");
                    months[i].setCountOfDays(28);
                    months[i].setCountOfWorkingDays(20);
                    break;
                case 2:
                    months[i].setMonthName("March");
                    months[i].setCountOfDays(31);
                    months[i].setCountOfWorkingDays(23);
                    break;
                case 3:
                    months[i].setMonthName("April");
                    months[i].setCountOfDays(30);
                    months[i].setCountOfWorkingDays(22);
                    break;
                case 4:
                    months[i].setMonthName("May");
                    months[i].setCountOfDays(31);
                    months[i].setCountOfWorkingDays(23);
                    break;
                case 5:
                    months[i].setMonthName("June");
                    months[i].setCountOfDays(30);
                    months[i].setCountOfWorkingDays(22);
                    break;
                case 6:
                    months[i].setMonthName("July");
                    months[i].setCountOfDays(31);
                    months[i].setCountOfWorkingDays(23);
                    break;
                case 7:
                    months[i].setMonthName("August");
                    months[i].setCountOfDays(31);
                    months[i].setCountOfWorkingDays(23);
                    break;
                case 8:
                    months[i].setMonthName("September");
                    months[i].setCountOfDays(30);
                    months[i].setCountOfWorkingDays(22);
                    break;
                case 9:
                    months[i].setMonthName("October");
                    months[i].setCountOfDays(31);
                    months[i].setCountOfWorkingDays(23);
                    break;
                case 10:
                    months[i].setMonthName("November");
                    months[i].setCountOfDays(30);
                    months[i].setCountOfWorkingDays(22);
                    break;
                case 11:
                    months[i].setMonthName("December");
                    months[i].setCountOfDays(31);
                    months[i].setCountOfWorkingDays(21);
                    break;
            }
        }
    }

    public static Month[] getMonths() {
        return months;
    }

}
