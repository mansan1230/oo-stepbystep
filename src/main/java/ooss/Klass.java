package ooss;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Teacher teacher;
    private Student leader;
    private final List<Student> members= new ArrayList<>();

 

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber()
    {
        return number;
    }
    public Student getLeader()
    {
        return leader;
    }
    public boolean isLeader(Student leader){
        return leader.equals(this.leader);
    }

    public void assignLeader(Student leader){
        if(this.equals(leader.getKlass())){
            this.leader = leader;
            if(this.teacher != null)
                System.out.println(String.format(
                        "I am %s, teacher of Class %d. I know %s become Leader.",
                        teacher.getName(),
                        this.number,
                        leader.getName()));
            else
                members.forEach(
                        student -> System.out.println(String.format(
                                "I am %s, student of Class %d. I know %s become Leader.",
                                student.getName(),
                                this.number,
                                leader.getName())));
        }
        System.out.println("It is not one of us.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Klass)) return false;

        Klass klass = (Klass) o;

        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    public void attach(Student student) {
        if (!members.contains(student))
            members.add(student);
    }

    public void attach(Teacher teacher) {
        this.teacher = teacher;
    }
}
