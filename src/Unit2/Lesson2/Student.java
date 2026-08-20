package Unit2.Lesson2;

class Student {
    private String name;
    private int age;
    private double gpa;
    private Integer studentID;
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.studentID = generateStudentID();
    }
    public Student(String name) {
        this.name = name;
        this.age = 18;
        this.gpa = 4.0;
        this.studentID = generateStudentID();
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGpa() {
        return gpa;
    }
    public Integer getStudentID() {
        return studentID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void displayStudentDetails() {
        System.out.println("\n Assigned Student ID: " + studentID);
        System.out.println(" Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
    private Integer generateStudentID() {
        return (int)(Math.random() * 9000) + 1000;
    }
}