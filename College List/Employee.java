class Employee extends Person {
    private double salary;
    private String department;

    public void setSalary(double s) {
        this.salary = s;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setDepartment(String d) {
        this.department = d;
    }

    public String getDepartment() {
        return this.department;
    }
}
