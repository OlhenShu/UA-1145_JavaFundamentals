package First;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Path file = Path.of("text1.txt");
        Path file2 = Path.of("text2.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file2.toFile())) {
            String[] lines = Files.lines(file)
                    .filter(w -> !w.isEmpty())
                    .toArray(String[]::new);

            // write into file2.txt the number of lines in file1.txt.
            fileOutputStream.write(String.valueOf(lines.length).getBytes());
            fileOutputStream.write("\n".getBytes());

            // write into file2.txt the longest line in file1.txt.
            String longestLine = Arrays.stream(lines)
                    .filter(w -> !w.isEmpty())
                    .max(Comparator.comparing(String::length))
                    .orElse("");
            fileOutputStream.write(longestLine.getBytes());
            fileOutputStream.write("\n".getBytes());

            // write into file2.txt your name and birthday date from file1.txt
            Pattern namePattern = Pattern.compile("Name: (.+)");
            Pattern birthdayPattern = Pattern.compile("Birthday: (.+)");

            for (String l : lines) {
                Matcher nameMatcher = namePattern.matcher(l);
                Matcher birthdayMatcher = birthdayPattern.matcher(l);

                if (nameMatcher.find()) {
                    String name = nameMatcher.group(1);
                    fileOutputStream.write(("Name: " + name).getBytes());
                    fileOutputStream.write("\n".getBytes());
                }

                if (birthdayMatcher.find()) {
                    String birthday = birthdayMatcher.group(1);
                    fileOutputStream.write(("Birthday: " + birthday).getBytes());
                    fileOutputStream.write("\n".getBytes());
                }
            }
        } catch (IOException e) {
            System.err.println("Something went wrong... " + e.getMessage());
        }
    }
}
