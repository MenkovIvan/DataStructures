public class BinarySearch {
    private final int NUM=7;
    public int search(Student arrayStudents[], int id) {
        Student array[] = arrayStudents;
        Student x;

        for (int i = 0; i < NUM; i++) { //сортировка пузырьком
            for (int j = NUM - 1; j > i; j--) {
                if (array[j - 1].getId() > array[j].getId()) {
                    x = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = x;
                }
            }
        }
        for (int i = 0; i < NUM; i++) {
            System.out.println(array[i].getId()+".");
        }

        int nX = -1;
        int L = 0;
        int R = NUM - 1;
        while (L <= R) {
            int k = (L + R) / 2;
            if (array[k].getId() == id) {
                nX = k;
                break;
            }
            else if (array[k].getId() < id) {
                R = k - 1;
            }
            else if (array[k].getId() > id) {
                L = k + 1;
            }
        }

        if (nX == -1)
            return -1;
        System.out.println(("llll"));
        for (int i = 0; i < NUM; i++)
            if (arrayStudents[i]==array[nX])
                return i;
        return -1;

    }
}
