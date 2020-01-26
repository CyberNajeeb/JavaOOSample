public abstract class Person implements ICanTalk, ICanWalk {

    public String FirstName;
    public String LastName;
    public boolean IsMale;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.FirstName = firstName;
        this.LastName = lastName;

    }

    protected String FullName() {

        return FirstName + " " + LastName;
    }

    protected String FullName(String salutation) {

        return salutation + " " + FirstName + " " + LastName;
    }

    protected String FullNameWithGenderSalutation() {

        if (this.IsMale) {
            return FullName("Mr.");
        } else {
            return FullName("Mrs.");
        }
    }

    public String Talk() {
        return FirstName + " is talking";
    }

    public String Walk() {
        return FirstName + " is walking";
    }
}