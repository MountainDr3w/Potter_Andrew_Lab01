import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonGenerator {
    public static void main(String[] args)
    {
        //Declare Scanner
        Scanner in = new Scanner(System.in);

        //Declare Vars
        boolean doneInput = false;
        boolean done = false;
        String ID = "";
        String firstName = "";
        String lastName = "";
        String title = "";

        int yearOfBirth;

        ArrayList<Person> personList = new ArrayList<>();

        //Main


        //Loop for input person
        do {
            ID = SafeInput.getNonZeroLenString(in, "Please enter your ID");
            firstName = SafeInput.getNonZeroLenString(in, "Please enter your first name");
            lastName = SafeInput.getNonZeroLenString(in, "Please enter your last name");
            title = SafeInput.getNonZeroLenString(in, "Please enter your title");
            yearOfBirth = SafeInput.getRangedInt(in, "Please enter your year of birth", 1900, 2025);


            Person rec = new Person(ID,firstName,lastName,title,yearOfBirth);

            personList.add(rec);


            done = SafeInput.getYNConfirm(in, "Are you done?");
        } while(!done);


        //COPIED FROM NIOWriteTextFile
        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\PersonTestData.txt");

        try
        {
            // Typical java pattern of inherited classes
            // we wrap a BufferedWriter around a lower level BufferedOutputStream
            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));

            // Finally can write the file LOL!

            for(Person person : personList)
            {
                writer.write(person.toCSV());  // stupid syntax for write rec
                // 0 is where to start (1st char) the write
                // rec. length() is how many chars to write (all)
                writer.newLine();  // adds the new line

            }
            writer.close(); // must close the file to seal it and flush buffer
            System.out.println("Data file written!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}