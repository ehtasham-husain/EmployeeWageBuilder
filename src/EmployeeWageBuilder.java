public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int EmpCheck = (int) (Math.floor(Math.random() * 10) % 2);
        System.out.println(EmpCheck);
        if (EmpCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
