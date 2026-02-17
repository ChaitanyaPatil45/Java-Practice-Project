import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("notes.txt");
            writer.write("Java File Handling Example\n");
            writer.write("This is a simple note.\n");
            writer.close();

            FileReader reader = new FileReader("notes.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
