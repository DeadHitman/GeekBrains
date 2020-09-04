package homeWork.java1_1.lesson4;

public class Application {


    public static void main(String[] args) {

        Employee employee = new Employee(
                "Иванов",
                "Иван",
                "Иванович",
                1000,
                27);

        /**
         * Вариант 4.1
         * Вывести при помощи методов из пункта 3 ФИО и возраст
         */
        System.out.println("ФИО сотрудника: " + employee.getLastName() + " "
                + employee.getFirstName() + " " + employee.getPatranomic() + "\nВозраст = " + employee.getAge());

        /**
         * Вариант 4.2
         *
         */

//        System.out.println(employee.toString());

        /**
         *5 задание Создать массив из 5 сотрудников.
         * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
         */
        Employee employees[] = Employee.addEmployees();
        for (int i = 0; i < employees.length; i++) {

            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].toString());
            }
        }


        System.out.println("6 задание");
        for (int i = 0; i < employees.length; i++) {
            Employee.upSalary(employees[i]);

            System.out.println(employees[i].toString());
        }


        /**
         * 7 задание Подсчитать средние арифметические зарплаты и возраста
         */
        float sumSalary = 0;
        float sumAge = 0;

        for (int i = 0; i < employees.length ; i++) {
            sumSalary =sumSalary + employees[i].getSalary();
            sumAge = sumAge + employees[i].getAge();
        }

        float avgSalary = sumSalary/employees.length;
        float avgAge = sumAge/employees.length;
        System.out.println("Средняя зарплата: " + avgSalary +"\nСредний возраст: "+ avgAge);

    }




}
