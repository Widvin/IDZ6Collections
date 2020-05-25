package by.gsu.pms;

public class Student {
    String firstname;
    String secondname;
    String lastname;
    String faculty;
    int birthyear;
    String address;
    int phoneNumber;
    int trainingCourse;
    String group;

    public Student(String firstname, String secondname,
                   String lastname, String faculty, int birthyear, String address,
                   int phoneNumber, int trainingCourse, String group){
        this.firstname      = firstname;
        this.secondname     = secondname;
        this.lastname       = lastname;
        this.faculty        = faculty;
        this.birthyear      = birthyear;
        this.address         = address;
        this.phoneNumber    = phoneNumber;
        this.trainingCourse = trainingCourse;
        this.group          = group;
    }

    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }

    public String getSecondname() {

        return secondname;
    }

    public void setSecondname(String secondname) {

        this.secondname = secondname;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {

        this.lastname = lastname;
    }

    public String getFaculty() {

        return faculty;
    }

    public void setFaculty(String faculty) {

        this.faculty = faculty;
    }


    public static int getBirthyear() {

        return birthyear;
    }

    public void setBirthyear(int birthyear) {

        this.birthyear = birthyear;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public int getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public int getTrainingCourse() {

        return trainingCourse;
    }

    public void setTrainingCourse(int trainingCourse) {

        this.trainingCourse = trainingCourse;
    }

    public String getGroup() {

        return group;
    }

    public void setGroup(String group) {

        this.group = group;
    }

    public String toString() {
        return "Firstname: " + this.firstname + "; Secondname: " + this.secondname + "; Lastname" + this.lastname + "; Faculty: " + this.faculty + "; Birth year: " +  this.birthyear +
                "; Address: " + this.address + "; PhoneNumber: " + this.phoneNumber + "; Training course: " + this.trainingCourse;
    }

}
