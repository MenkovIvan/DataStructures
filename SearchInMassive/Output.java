public class Output {
    Output(int searchId, int indexSearch, Student arrayStudents[]){
        System.out.print("search: "+searchId+"  ");
        arrayStudents[indexSearch].studentToString();
    }

    Output(int searchId){
        System.out.println("search: "+searchId+"  Not found.");
    }
}
