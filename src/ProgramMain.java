import java.util.Scanner;

public class ProgramMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Program data = new Program();

        System.out.println("Please enter text line by line. Write 'stop' to finish.");

        // Loop to keep accepting lines from the user untill "stop" is entered.
        while(!data.isStopEntered()) {
            String line = scan.nextLine();
            data.addLine(line);

            if (data.isStopEntered()) {
                break;          // we will exit the loop if "stop" is entered.
            }
        }

        System.out.println("Total lines (excluding 'stop'): " + data.getLineCount());
        System.out.println("Total characters: " + data.getCharCount());
        System.out.println("Total words: " + data.getWordCount());
        System.out.println("The longest word: " + data.getLongestWord());


    }
}