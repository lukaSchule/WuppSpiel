// Java-Programm zur Demonstration der Methode createNewFile() method
import java.io.File;
//import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileCreator {
    public static void main2(String args[])
    {
        try 
        {
            // Get the file
            File f = new File("test.txt");
            // Create new file
            // Check if it does not exist
            if (f.createNewFile())
            {
                System.out.println("File created");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch (Exception e) 
        {
            System.err.println(e);
        }
    }

    public void fileReader()
    {
        /*String fileData = "Some Test";
        FileOutputStream fos = new FileOutputStream("test2.txt");
        fos.write(fileData.getBytes)
        fos.flush();
        fos.close();*/ 
    }

    //ertsellt und schreibt in die text datei
    public static void main (String[] args) 
    {
        Path path = Paths.get("Highscore.txt");
        try 
        {
            String str = "";
            byte[] bs = str.getBytes();
            Path writtenFilePath = Files.write(path, bs);
            System.out.println(str);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}