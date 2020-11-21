package OpinionPoll;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(){}

    public String getName(){ return this.name;}
    public int getAge(){ return this.age;}

    @Override
    public String toString(){
        String output = String.format("%s - %d", this.name, this.age);
        return  output;
    }
}
