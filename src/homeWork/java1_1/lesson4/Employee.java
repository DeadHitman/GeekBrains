package homeWork.java1_1.lesson4;

import java.util.Random;
import java.util.UUID;

/**
 * 1 задание Создать класс "Сотрудник" с полями : ФИО, зарплата,возраст
 */
public class Employee {
    final private String lastName;
    final private String firstName;
    final String patranomic;
    private float salary;
    final private int age;


    final private String randomUID;

    /**
     * 2 задание Конструктор класса должен заполнять эти поля при создании объекта
     *
     * @param lastName
     * @param firstName
     * @param patranomic
     * @param salary
     * @param age
     */
    public Employee(String lastName, String firstName, String patranomic, float salary, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patranomic = patranomic;
        this.salary = salary;
        this.age = age;

        /**
         * 8 задание Продумать конструктор таким образом,
         * чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
         */
        this.randomUID = UUID.randomUUID().toString();


    }

    /**
     * 3 задание внутри класса Сотрудник,написать методы,которые возвращают значения каждого поля
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatranomic() {
        return patranomic;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getRandomUID() {
        return randomUID;
    }

    private void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * 4 задание Вывести при помощи методов из пункта 3 ФИО и возраст
     * Я немного считерил,т.к работал уже с Java и idea,есть возможность нажать alt+ insert и указать ,
     * что требуется сделать (setter + getter,переопределить toString)
     *
     * @return
     */
    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patranomic='" + patranomic + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", randomUID='" + randomUID + '\'' +
                '}';
    }


    public static Employee[] addEmployees() {
        Employee employees[] = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            Employee employee = new Employee("Иванов" + i,
                    "Иван" + i,
                    "Иванович" + i,
                    new Random().nextInt(2000),
                    new Random().nextInt(80));
            employees[i] = employee;
        }

        return employees;

    }

    /**
     * 6 задание Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
     *
     * @param employee
     * @return
     */
    public static Employee upSalary(Employee employee) {

        float employeeSalary = employee.getSalary();
        if (employee.getAge() > 45) {
            employee.setSalary(employeeSalary + 5000);

        }
        return employee;

    }


}

