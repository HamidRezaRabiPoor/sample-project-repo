import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    File file = new File("assets/entry.txt");
    Scanner scanner = new Scanner(file);

    public String resultReader(){
        String eachLine = "";
        StringBuilder builder = new StringBuilder();
        while(scanner.hasNext()){
            builder.append(scanner.nextLine()).append('\n');
        }
        eachLine = builder.toString();

        return  (!eachLine.isEmpty()) ? eachLine : "there is a problem in parsing the file";
    }

    public FileReader() throws FileNotFoundException {
    }
}
