package ooss;

public class Student extends Person {

    public Student(int id, String name , int ago)
    {
        super (id,name,ago);
    }
    public String introduce(){
        return  super.introduce() + " I am a student.";
    }

}
