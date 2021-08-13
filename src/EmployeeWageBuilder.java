public class EmployeeWageBuilder {
    //Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 10;

    public static void main(String[] args) {

        //variables
        int empHrs = 0, empWage = 0, totalEmpWage = 0;

        //Computation
        for (int days = 1; days <= NUM_OF_WORKING_DAYS; days++ ) {
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
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
        }
        System.out.println("Total Employee Wage = " + totalEmpWage);
    }
}
