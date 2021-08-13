public class EmployeeWageBuilder {
    //Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 50;

    public static void main(String[] args) {

        //variables
        int  totalWorkingdays = 0,
            totalworkingHRS = 0, totalEmpWage = 0;

        //Computation
        while (totalWorkingdays < NUM_OF_WORKING_DAYS &&
                totalworkingHRS < MAX_HRS_IN_MONTH){
            int empHrs = 0;
            totalWorkingdays++;
            int EmpCheck = (int) (Math.floor(Math.random() * 10) % 3);
            System.out.println(EmpCheck);

            switch (EmpCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalworkingHRS += empHrs;
            System.out.println("working hrs = "+totalworkingHRS);
            int empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
        }
        System.out.println("Total Employee Wage = " + totalEmpWage);
    }
}
