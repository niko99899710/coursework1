import java.sql.SQLOutput;

public class EmployeeBook {
    private Employee[] worker;
    public EmployeeBook (int size){
        this.worker= new Employee [size];
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] == null) {
                worker[i] = employee;
                System.out.println("Новый сотрудник " + employee.getNameSurname());
                return;
            }
        }
        System.out.println("Мест нет");
    }

    public void printWorker(){
        for (int i = 0; i < worker.length; i++); {
           Employee employee = worker[i];
            if (employee != null) {
                System.out.println(employee.getNameSurname());
            }
        }
    }

}
