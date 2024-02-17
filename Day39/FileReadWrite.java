import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FileReadWrite {

    public static void main(String[] args) {
        // Define the file name
        String fileName = "example.txt";

        // Write to file
        try {
            // Create a FileWriter object to write to the file
            FileWriter writer = new FileWriter(fileName);
            // Write some text to the file
            writer.write("Hello, this is an example text.\n");
            writer.write("We're writing to a file using Java.");
            // Close the FileWriter object to save changes and release resources
            writer.close();
            // Display a success message
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            // If an error occurs during writing, display an error message and the stack
            // trace
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from file
        try {
            // Create a File object representing the file to be read
            File file = new File(fileName);
            // Create a FileReader object to read from the file
            FileReader reader = new FileReader(file);
            // Create a BufferedReader object to efficiently read characters from the file
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            // Display the contents of the file
            System.out.println("Contents of " + fileName + ":");
            // Read lines from the file until reaching the end
            while ((line = bufferedReader.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);
            }
            // Close the BufferedReader and FileReader objects to release resources
            reader.close();
        } catch (IOException e) {
            // If an error occurs during reading, display an error message and the stack
            // trace
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }

        // Write data to the CSV file
        try {
            // Define the file name
            String fileName1 = "data1.csv";

            // Define the data to be written to the CSV file
            String[][] data = {
                    { "Name", "Age", "City" },
                    { "John", "25", "London" },
                    { "Alice", "30", "New York" },
                    { "Bob", "35", "Paris" }
            };
            FileWriter writer = new FileWriter(fileName1);

            // Write each row of data to the CSV file
            for (String[] row : data) {
                // Write each element in the row followed by a comma
                for (int i = 0; i < row.length; i++) {
                    writer.append(row[i]);
                    // Add a comma if the element is not the last one in the row
                    if (i < row.length - 1) {
                        writer.append(",");
                    }
                }
                // Move to the next line after writing each row
                writer.append("\n");
            }

            // Close the FileWriter object to save changes and release resources
            writer.close();
            // Display a success message
            System.out.println("Successfully wrote to the CSV file.");
        } catch (IOException e) {
            // If an error occurs during writing, display an error message and the stack
            // trace
            System.out.println("An error occurred while writing to the CSV file.");
            e.printStackTrace();
        }

        try {
            // Define the CSV file name
            String file = "data.csv";
            // Create a BufferedReader object to read from the CSV file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";

            // Read lines from the CSV file until reaching the end
            while ((line = reader.readLine()) != null) {
                // Split each line into an array of strings using comma as the delimiter
                String[] row = line.split(",");

                // Iterate through each element in the row array
                for (String index : row) {
                    // Print each element with a formatted width of 10 characters
                    System.out.printf("%-10s", index);
                }
                // Move to the next line after printing each row
                System.out.println();
            }
        } catch (Exception e) {
            // If an error occurs during reading, display an error message and the stack
            // trace
            e.printStackTrace();
        }

    }
}
