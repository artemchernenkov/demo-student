package students;

public class Student {
        private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean equals(Student student) {
        if (this == null) return false;
        if (this == student) return true;
        if (this.name == student.name) return true;
        return false;


    }
}

