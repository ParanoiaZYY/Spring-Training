package site.paranoia;

public class Student extends People{

    public Student(String className) {
        this.className = className;
    }

    public Student(String name, Integer age, String className) {
        super(name, age);
        this.className = className;
    }

    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
