package ooss;

public class Teacher extends Person{

    public Teacher(int id, String name , int ago)
    {
        super (id,name,ago);
    }

    public String introduce(){
        return  super.introduce() + " I am a teacher.";
    }
}
