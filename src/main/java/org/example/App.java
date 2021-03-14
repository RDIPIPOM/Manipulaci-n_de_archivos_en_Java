public class App {
    public static void main(String[] args) {
        FileManagement file1 = new FileManagement("C:\\Users\\ASUS\\Desktop\\Edgar\\FileX.txt");
        file1.writeFile("Hello world!!!!!");
        file1.readFile();
    }
}
