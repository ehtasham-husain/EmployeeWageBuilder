public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //Constants
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        //variables
        int empHrs = 0;
        int empWage = 0;

        //Computation
        int EmpCheck = (int) (Math.floor(Math.random() * 10) % 2);
        System.out.println(EmpCheck);
        if (EmpCheck == IS_FULL_TIME)
            empHrs = 8;

        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee Wage = "+empWage);
    }
}
