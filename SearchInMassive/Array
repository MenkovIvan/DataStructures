public class Array {
    private final int NUM =15;
    private Student arrayStudents[] = new Student[NUM];

    public void setStudent(int index, int id, String name, int mark){
        Student st = new Student(id,name,mark);
        arrayStudents[index]=st;
    }

    public Student getStudent(int index){
        return arrayStudents[index];
    }

    public void chooseVariant(int key, int id){
        switch (key){
            case 1:{
                BustSearch bs = new BustSearch();
                int indexSearch = bs.search(arrayStudents,id);
                if (indexSearch==-1){
                    Output out = new Output(id);
                }else{
                    Output out = new Output(id,indexSearch,arrayStudents);
                }
                break;
            }
            case 2:{
                BurrierSearch br = new BurrierSearch();
                int indexSearch = br.search(arrayStudents,id);
                if (indexSearch==-1){
                    Output out = new Output(id);
                }else{
                    Output out = new Output(id,indexSearch,arrayStudents);
                }
                break;
            }
            case 4:{
                BinarySearch bn = new BinarySearch();
                int indexSearch = bn.search(arrayStudents,id);
                if (indexSearch==-1){
                    Output out = new Output(id);
                }else{
                    Output out = new Output(id,indexSearch,arrayStudents);
                }
                break;
            }
            case 5:{
                BinarySearchGold bng = new BinarySearchGold();
                int indexSearch = bng.search(arrayStudents,id);
                if (indexSearch==-1){
                    Output out = new Output(id);
                }else{
                    Output out = new Output(id,indexSearch,arrayStudents);
                }
                break;
            }
        }
    }
}
