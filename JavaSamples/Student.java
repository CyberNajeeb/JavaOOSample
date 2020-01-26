public class Student extends Person {

    public Student() {
        super();
    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String FullName() {

        return "Student - " + super.FullName();
    }
}