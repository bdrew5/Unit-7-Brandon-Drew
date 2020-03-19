public abstract class Employee {
    public static final double BASE_WAGE = 10.00;

    private String name;
    private int age;
    private double hoursWorked;
    private boolean atWork;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
        hoursWorked = 0;
        atWork = false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAtWork() {
        return atWork;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    private void logHoursWorked(double hours) {
        hoursWorked += hours;
    }
    public void startWork(double hours) {
        atWork = true;
        logHoursWorked(hours);
    }

    public void leaveWork() {
        atWork = false;

    }

    public abstract double computeWage();

}
