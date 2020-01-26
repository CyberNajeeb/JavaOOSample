public class Teacher extends Person {

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String FullName() {

        return "Teacher - " + super.FullName();
    }

}