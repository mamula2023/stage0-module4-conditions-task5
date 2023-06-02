package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int mod4 = year % 4;
        int mod100 = year %100;
        int mod400 = year %400;
        switch (mod4){
            case 0:
                switch (mod100){
                    case 0:
                        switch (mod400){
                            case 0:
                                System.out.println("leap");
                                break;
                            default:
                                System.out.println("not leap");
                                break;
                        }
                        break;
                    default:
                        System.out.println("leap");
                        break;
                }
                break;
            default:
                System.out.println("not leap");
            break;
        }
    }
}
