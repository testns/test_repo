package files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;//commentsfdfd
import java.nio.file.Path;//comment2
import java.nio.file.Paths;//comm345dfddfgdfgdfgdfgdfgd

public class FileTest {//comment56

    public static void main(String[] args) {
    
        String content = "select * from student;";
        final Path tempDirectory = Files.createDirectories(Paths.get("nikita715/plagiarism_test/testns"));
        final Path tempFile = Files.createFile(Paths.get(tempDirectory.toString(), "script.sql"));
        try (final FileOutputStream fileOutputStream = new FileOutputStream(tempFile.toFile())) {
            fileOutputStream.write(content.getBytes());
        }
        Files.deleteIfExists(tempDirectory);
        
        final int NUM_FACTS = 100;
		for(int i = 0; i < NUM_FACTS; i++)
			System.out.println( i + "! is " + factorial(i));
    }

}
