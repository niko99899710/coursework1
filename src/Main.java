public class Main {

    private static Employee[] worker = new Employee[10];

    public static void main(String[] args) {
        worker[0] = new Employee("Марк Алексей Андреевич", 1, 89000);
        worker[1] = new Employee("Аванесян Артур Дмитриевич", 2, 5000);
        worker[2] = new Employee("Кирильчук Арсен Петрович", 3, 3000);
        worker[3] = new Employee("Де Юлия Ким", 4, 40_000);
        worker[4] = new Employee("Васильев Армен Артурович", 4, 500_000);
        worker[5] = new Employee("Юрьевич Антон  Штац", 5, 60_000);
        worker[6] = new Employee("Муров Евгений Александрович", 2, 70_000);
        worker[7] = new Employee("Киров Сергей Никулин", 3, 8000);
        worker[8] = new Employee("Ландешев Петров Красов", 4, 9000);
        worker[9] = new Employee("Ильна Амина Васильевна", 1, 100_000);


        printWorker(worker);
        calculateSalary(worker);
        findEmployeeMinWorker(worker);
        findEmployeeMaxWorker(worker);
        calculateMiddle(worker);
        getName(worker);
        raiseSalary(worker);
        System.out.println("Сотрудник с min ЗП по отделу = " + findEmployeeMinWorkerDepartment(worker, 1));
        System.out.println("Сотрудник с max ЗП по отделу = " + findEmployeeMaxWorkerDepartment(worker, 4));
        calculateSalaryDepartment(worker, 2);
        System.out.println("Средняя ЗП по отделу = " + calculateMiddleDepartment(worker, 3));
        raiseSalaryDepartment(worker, 5);
        getNameSalary(worker,2000000);
        findEmployeeMaxWorkerEmployee(worker);
        findEmployeeMinWorkerEmployee(worker);
    }

    public static void printWorker(Employee[] worker) {
        for (int i = 0; i < worker.length; i++) {
            Employee employee = worker[i];
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

    public static void calculateMiddle(Employee[] worker) {
        int middle = 0;
        for (Employee employee : worker) {
            middle += employee.getSalary() / worker.length;

        }
        System.out.println("Средняя ЗП = " + middle);
    }


    public static void findEmployeeMinWorker(Employee[] worker) {
        int salaryMin = Integer.MAX_VALUE;
        for (Employee employee : worker) {
            if (employee.getSalary() < salaryMin) {
                salaryMin = employee.getSalary();
            }
        }
        System.out.println("Сотрудник с min ЗП = " + salaryMin);
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

    public static void getName(Employee[] worker) {
        for (int i = 0; i < worker.length; i++) {
            System.out.println(worker[i].getNameSurname());
        }
    }

    public static void raiseSalary(Employee[] worker) {
        for (int i = 0; i < worker.length; i++) {
            Employee employee = worker[i];
            employee.setSalary(employee.getSalary() + ((employee.getSalary() * 2) / 100));
            System.out.println("С учетом увеличения ЗП на 2 %. ЗП по сотруднику = " + employee.getSalary());
        }
    }

    public static Employee findEmployeeMinWorkerDepartment(Employee[] worker, int department) {
        int salaryMinDepartment = Integer.MAX_VALUE;
        Employee endEmployee = null;
        for (Employee employee : worker) {
            if (department == employee.getDepartment() && employee.getSalary() < salaryMinDepartment) {
                salaryMinDepartment = employee.getSalary();
                endEmployee = employee;
            }
        }
        return endEmployee;
    }

    public static Employee findEmployeeMaxWorkerDepartment(Employee[] worker, int department) {
        int salaryMaxDepartment = Integer.MIN_VALUE;
        Employee theEndEmployee = null;
        for (Employee employee : worker) {
            if (department == employee.getDepartment() && employee.getSalary() > salaryMaxDepartment) {
                salaryMaxDepartment = employee.getSalary();
                theEndEmployee = employee;
            }
        }
        return theEndEmployee;
    }

    public static void calculateSalaryDepartment(Employee[] worker, int department) {
        int startSalary = 0;
        for (Employee employee : worker) {
            if (department == employee.getDepartment()) {
                startSalary += employee.getSalary();
            }
        }
        System.out.println("Сумму затрат на зарплату по отделу = " + startSalary);
    }

    public static int calculateMiddleDepartment(Employee[] worker, int department) {
        int middleDepartment = 0;
        int middleSalaryDepartment = 0;
        for (Employee employee : worker) {
            if (department == employee.getDepartment()) {
                middleSalaryDepartment += employee.getSalary();
                middleDepartment++;
            }
        }
        return middleSalaryDepartment / middleDepartment;
    }

    public static void raiseSalaryDepartment(Employee[] worker, int department) {
        int percent = 3;
        for(Employee employee : worker) {
            if (department == employee.getDepartment()) {
                employee.setSalary(employee.getSalary() + ((employee.getSalary() * percent) / 100));
                System.out.println("С учетом увеличения ЗП на 3 %. ЗП по сотруднику по отделу = " + employee.getSalary());

            }
        }
    }

    public static void getNameSalary(Employee[] worker, int salary) {
        for (int i = 0; i < worker.length; i++) {
            System.out.println(worker[i].getNameSurname() + " = " + worker[i].getSalary());
        }
    }

    public static void findEmployeeMaxWorkerEmployee(Employee[] worker) {
        int salary = 90000;
        for (Employee employee : worker) {
            if (salary <= employee.getSalary()) {
                System.out.println("Все сотрудники ЗП, у которых выше установленного параметра = " + employee.getSalary());
            }
        }
    }

    public static void findEmployeeMinWorkerEmployee(Employee[] worker) {
        int salary = 12000;
        for (Employee employee : worker) {
            if (salary >= employee.getSalary()) {
                System.out.println("Все сотрудники ЗП, у которых ниже установленного параметра = " + employee.getSalary());
            }
        }
    }


}
