package main.java.patterns.creational.builder.static_builder;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder()
                .number(100)
                .name("John")
                .projectName("Builder Pattern")
                .build();
        System.out.println(employee);
    }
}
