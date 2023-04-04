public class Employee {
    private String nameSurname;
    private int department;
    private int salary;
    private int id;
    private static int country = 1;

    public Employee(String nameSurname, int department, int salary) {
       if (department < 1 || department > 6) {
           throw new IllegalThreadStateException("Деартаментов только 5");
        }
        this.nameSurname = nameSurname;
        this.department = department;
        this.salary = salary;
        this.id = country++;
    }

    public String getNameSurname() {
        return this.nameSurname;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameSurname='" + nameSurname + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }


}
