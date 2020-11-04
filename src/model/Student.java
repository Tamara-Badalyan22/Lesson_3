package model;

public class Student {
    String firstName;
    String lastName;
    int age = 18;
    int course = 2;
    String Faculty = "IAM";
    double GPA;
    double fee;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 17 && age < 27) {
            this.age = age;
        } else {
            System.out.println("You can't be a student");
        }

    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 && course < 6)
            this.course = course;
        else
            System.out.println("Please enter correct number");
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        if (GPA > 0 && GPA <= 100)
            this.GPA = GPA;
        else
            System.out.println("Please enter correct number");
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        if (fee > 30000 && fee <= 1000000)
            this.fee = fee;
        else
            System.out.println("Please enter correct fee");
    }

    public void Discount() {
        if (getGPA() > 70) {
            System.out.println(getFirstName() + " DicountFee is : " + (getFee() - (getFee() * 0.6)));
        } else if (getGPA() > 70) {
            System.out.println(getFirstName() + " DicountFee is : " + (getFee() - (getFee() * 0.3)));
        } else
            System.out.println(getFirstName() + " DicountFee is : " + 0);
    }
}
