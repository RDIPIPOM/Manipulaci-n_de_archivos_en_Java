import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManagement {
    private String pathname;
    private FileWriter fileWriter;
    private BufferedWriter bufferWriter;
    private File file;

    public FileManagement(String pathname){
        this.pathname = pathname;
        try{
            this.fileWriter = new FileWriter(pathname);
            System.out.println("Document created successfully!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void writeFile(String content){
        try{
            this.bufferWriter = new BufferedWriter(this.fileWriter);
            bufferWriter.write(content);
            bufferWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void readFile(){
        try {
            file = new File(this.pathname);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
                System.out.println(scanner.nextLine());
            scanner.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public String getAbsolutePath(){
        try {
            file = new File(this.pathname);
            return file.getAbsolutePath();
        }catch (SecurityException e){
            e.printStackTrace();
            return "";
        }
    }
}