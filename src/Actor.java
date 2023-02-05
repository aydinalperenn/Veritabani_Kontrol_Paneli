public class Actor {
    private int id;
    private String firstName;
    private String lastName;
    private Object date;

    public Actor(int id, String firstName, String lastName, Object date) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

}
