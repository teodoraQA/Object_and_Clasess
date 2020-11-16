package Students2_ver2;

public class Students {
    private String firstName;
    private String lastName;
    private String age;
    private String homeTown;

    public Students(){

    }

    public Students(String firstName , String lastName , String age , String homeTown){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getHomeTown(){
        return this.homeTown;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName= firstName;
    }

    public void setLastName(String lastName){
        this.lastName= lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    //    @Override
//    public String toString(){
//        String print = String.format("%s %s is %s years old.", this.firstName, this.lastName,
//                this.age);
//      return print;
//    }
}
