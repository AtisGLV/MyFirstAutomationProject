public class Employee {
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getYear() {
        return year;
    }

    public String getRole() {
        return role;
    }

    public String name;
    public String surname;
    public double year;
    public String role;

    public Employee(String name, String surname, double year, String role) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.role = role;
    }
        public Employee(){

        }
    }


