package ooss;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private List<Klass> klassesTecher = new ArrayList<>();

    public Teacher(int id, String name , int ago)
    {
        super (id,name,ago);
    }
    public void assignTo(Klass klass)
    {
        klassesTecher.add(klass);
    }

    public boolean belongsTo(Klass klass)
    {
        return klassesTecher != null && klassesTecher.stream().anyMatch(x -> x.getNumber() == klass.getNumber());
    }

    public boolean  isTeaching(Student student)
    {
        return belongsTo(student.getKlass());
    }



    public String introduce(){
        if (this.klassesTecher.isEmpty())
            return  super.introduce() + " I am a teacher.";

        else
            return  super.introduce() +  " I am a teacher. I teach Class "+ String.join(", ", klassesTecher.stream().map(klass -> String.valueOf(klass.getNumber())).collect(Collectors.toList())) + ".";

    }
}
