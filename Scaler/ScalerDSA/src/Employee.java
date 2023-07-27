public class Employee {
    int deptid;
    int salary;
    public Employee( int deptid,int salary) {
        this.deptid = deptid;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "deptid=" + deptid +
                ", salary=" + salary +
                '}';
    }
}
