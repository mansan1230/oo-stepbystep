package ooss;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name , int ago)
    {
        super (id,name,ago);

    }

    public Klass getKlass() {
        return klass;
    }

    public void join(Klass newKlass) {
        this.klass = newKlass;
        klass.attach(this);
    }

    public Boolean isIn(Klass klass) {
        return this.klass == klass;
    }


    @Override
    public String introduce(){
        if (klass == null)
            return super.introduce() + " I am a student.";
        else if (this.klass.isLeader(this))
            return super.introduce() + String.format(" I am a student. I am the leader of class %d.", klass.getNumber());
        else
            return super.introduce() + String.format(" I am a student. I am in class %d.", klass.getNumber());
    }

}
