import java.sql.SQLOutput;

public class EmployeeBook {
    private Employee[] worker = new Employee[10];

    public EmployeeBook(int size) {
        this.worker = new Employee[size];
    }

        public static void EmployeeBook1(){
        EmployeeBook employeeBook = new EmployeeBook(2);
        employeeBook.addEmployee(new Employee("Марк Алексей Андреевич", 1, 89000));
        employeeBook.addEmployee(new Employee("Аванесян Артур Дмитриевич", 2, 5000));
        employeeBook.addEmployee(new Employee("Кирильчук Арсен Петрович", 3, 3000));
        employeeBook.addEmployee(new Employee("Де Юлия Ким", 4, 40_000));
        employeeBook.addEmployee(new Employee("Васильев Армен Артурович", 4, 500_000));
        employeeBook.addEmployee(new Employee("Юрьевич Антон  Штац", 5, 60_000));
        employeeBook.addEmployee(new Employee("Муров Евгений Александрович", 2, 70_000));
        employeeBook.addEmployee(new Employee("Киров Сергей Никулин", 3, 8000));
        employeeBook.addEmployee(new Employee("Ландешев Петров Красов", 4, 9000));
        employeeBook.addEmployee(new Employee("Ильна Амина Васильевна", 1, 100_000));


        //System.out.println();
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

    public void printWorker(Employee employee) {
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] != null) {
                worker[i] = employee;
                System.out.println(employee.getNameSurname());
            }
        }
    }
}

