import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

    private static Employee[] worker = new Employee[10];
    public static void main(String[] args) {
        worker[0] = new Employee("Марк Алексей Андреевич",1, 89000);
        worker[1] = new Employee("Аванесян Артур Дмитриевич",2, 5000);
        worker[2] = new Employee("Кирильчук Арсен Петрович",3, 3000);
        worker[3] = new Employee("Де Юлия Ким",4, 40_000);
        worker[4] = new Employee("Васильев Армен Артурович",4, 50_000);
        worker[5] = new Employee("Юрьевич Антон  Штац",5, 60_000);
        worker[6] = new Employee("Муров Евгений Александрович",2, 70_000);
        worker[7] = new Employee("Киров Сергей Никулин",3, 8000);
        worker[8] = new Employee("Ландешев Петров Красов",4, 9000);
        worker[9] = new Employee("Ильна Амина Васильевна",1, 100_000);

        printWorker(worker);
        calculateSalary(worker);
        findEmployeeMinWorker(worker);
        findEmployeeMaxWorker(worker);

    }

    public static void printWorker(Employee[] worker) {
        for (int i = 0; i < worker.length; i++) {
        Employee employee= worker[i];
        System.out.println(employee);
        }
    }

    public static void calculateSalary(Employee[] worker) {
        int startSalary = 0;
        for (Employee employee : worker) {
            startSalary += employee.getSalary();
        }
        System.out.println("Сумма затарт по ЗП в месяц на сотрудников = " + startSalary);
    }

    public static void findEmployeeMinWorker(Employee[] worker) {
        int salaryMin = Integer.MAX_VALUE;
        for (Employee employee: worker) {
            if (employee.getSalary() < salaryMin) {
             salaryMin = employee.getSalary();
         }
        }
        System.out.println("Сотрудник с max ЗП = " + salaryMin);
    }

    public static void findEmployeeMaxWorker(Employee[] worker) {
        int salaryMax = Integer.MIN_VALUE;
        for (Employee employee : worker) {
            if (employee.getSalary() > salaryMax) {
                salaryMax = employee.getSalary();
            }
        }
        System.out.println("Сотрудник с max ЗП = " + salaryMax);
    }
    }

