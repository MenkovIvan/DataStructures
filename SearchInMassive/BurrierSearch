public class BurrierSearch {
    private final int NUM =7;

    public int search(Student arrayStudents[], int id) {
        Student st = new Student(id, "Ilya", 2);
        arrayStudents[NUM] = st;
        int i = 0;
        while (arrayStudents[i].getId() != id) {
            i++;
        }
        if (i == NUM) {
            return -1;
        }
        else return i;
    }
}
