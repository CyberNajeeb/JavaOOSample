import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();

        Person student = new Student("Emre", "Cengel");
        student.IsMale = true;
        list.add(student);

        Person teacher = new Teacher("Asena", "Cengel");
        teacher.IsMale = false;
        list.add(teacher);

        for (Person person : list) {

            System.out.println(person.FullNameWithGenderSalutation());
            System.out.println(person.Talk());
            System.out.println(person.Walk());
        }

    }
}