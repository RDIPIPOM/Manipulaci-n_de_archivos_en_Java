public class App {
    public static void main(String[] args) {
        //Create file
        FileManagement file1 = new FileManagement("C:\\Users\\ASUS\\Desktop\\Edgar\\FileX.txt");
        //Write file
        file1.writeFile("Hello world!!!!!");
        //Read file
        file1.readFile();
        //File's path
        System.out.println(file1.getAbsolutePath());
    }
}
