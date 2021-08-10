public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int Empcheck = (int) (Math.floor(Math.random() * 10) % 2);
        System.out.println(Empcheck);
        if (Empcheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
