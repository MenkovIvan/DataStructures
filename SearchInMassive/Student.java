
public class Student {
    private int id;
    private String name;
    private int mark;

    Student(int id, String name, int mark ){
        this.id=id;
        this.name=name;
        this.mark=mark;
    }

    public int getMark() {
        return mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void studentToString(){
        System.out.println("id: "+id+"  "+"name: "+name+"  "+"mark: "+mark);
    }

}
