package main.java.patterns.creational.builder.static_builder;

public class Employee {
    private int number;
    private String name;
    private String department;
    private int salary;
    private String projectName;

    public Employee(EmployeeBuilder employeeBuilder) {
        if (employeeBuilder == null) {
            throw new IllegalArgumentException("Please provide employee builder to build employee object.");
        }
        if (employeeBuilder.number <= 0) {
            throw new IllegalArgumentException("Please provide valid employee number.");
        }
        if (employeeBuilder.name == null || employeeBuilder.name.trim().isEmpty()) {
            throw new IllegalArgumentException("Please provide employee name.");
        }
        this.number = employeeBuilder.number;
        this.name = employeeBuilder.name;
        this.department = employeeBuilder.department;
        this.salary = employeeBuilder.salary;
        this.projectName = employeeBuilder.projectName;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getProjectName() {
        return projectName;
    }

    @Override
    public String toString() {
        // Класс StringBuilder также использует паттерн проектирования Builder с реализацией
        // интерфейса java.lang.Appendable
        StringBuilder builder = new StringBuilder();
        builder.append("Employee [empNo=").append(number).append(", name=").append(name).append(", department=")
                .append(department).append(", salary=").append(salary)
                .append(", projectName=").append(projectName).append("]");
        return builder.toString();
    }

    public static class EmployeeBuilder {
        private int number;
        protected String name;
        protected String department;
        protected int salary;
        protected String projectName;

        public EmployeeBuilder() {
        }

        public EmployeeBuilder number(int number) {
            this.number = number;
            return this;
        }

        public EmployeeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder department(String department) {
            this.department = department;
            return this;
        }

        public EmployeeBuilder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        public Employee build() {
            Employee emp = null;
            if (validateEmployee()) {
                emp = new Employee(this);
            } else {
                System.out.println("Sorry! Employee objects can't be build without required details");
            }
            return emp;
        }

        private boolean validateEmployee() {
            return (number > 0 && name != null && !name.trim().isEmpty());
        }
    }
}
