import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{

    public void read(Array a) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Ivan\\IdeaProjects\\Practica_siaod\\src\\Practice1\\Students"));
        String line;
        while ((line=reader.readLine()) != null){
            String[] parts = line.split(" ",4);
            a.setStudent(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), parts[2], Integer.parseInt(parts[3]));
        }
    }
}
