import java.util.Objects;

public class Person {
    private String IDNum;
    private String firstName;
    private  String lastName;
    private String title;
    private int YOB;

    //CONSTRUCTORS
    public Person(String IDNum, String firstName, String lastName, String title, int YOB)
    {
        this.IDNum = IDNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }


    //GETTERS AND SETTERS
    /**
     * Gets the id number
     *
     * @param none
     * @return theIDNum
     */
    public String getIDNum() {
        return IDNum;
    }

    /**
     *gets the firstname
     *
     * @param none
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * gets the last name
     *
     * @param none
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * gets the title
     *
     * @param none
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * gets the year of birth
     *
     * @param none
     * @return the Year of birth
     */
    public int getYOB() {
        return YOB;
    }

    /**
     * sets the id number
     *
     * @param IDNum the new String ID number
     * @return nothing
     */
    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    /**
     * sets the first name
     *
     * @param firstName the new String first name
     * @return nothing
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * sets the last name
     *
     * @param lastName the new String last name
     * @return nothing
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * sets the title
     *
     * @param title the new String title
     * @return nothing
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * sets the year of birth
     *
     * @param YOB the new integer year of birth
     * @return nothing
     */
    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    //Other :)
    /**
     * returns the first name a space then the last name
     *
     * @param none
     * @return the first name a space then the last name
     */
    public String fullName(){
        return this.firstName + " " + this.lastName;
    }

    /**
     * gives the formal name which is title firstname lastname
     *
     * @param none
     * @return title firstName lastName
     */
    public String formalName(){
        return this.title + " " + this.fullName();
    }

    /**
     * Calculates the age from the current year 2025
     *
     * @param none
     * @return the age from the current year 2025
     */
    public String getAge(){
        return Integer.toString(2025 - this.YOB);
    }

    /**
     * Calculates the age from a given year
     *
     * @param year an int
     * @return the age from the given year if it is greater than the YOB
     * @return "Invalid" if the given year is less than the YOB
     */
    public String getAge(int year){

        if(year - this.YOB < 0){
            return Integer.toString(year - this.YOB);
        }
        return "Invalid";
    }


    //Different formats
    public String toCSV(){
        return this.IDNum + " , " + this.firstName + " , " + this.lastName + " , " + this.title + " , " + this.YOB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return YOB == person.YOB && Objects.equals(IDNum, person.IDNum) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(title, person.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IDNum, firstName, lastName, title, YOB);
    }

    @Override
    public String toString() {
        return "Person{" +
                "IDNum='" + IDNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }
}
