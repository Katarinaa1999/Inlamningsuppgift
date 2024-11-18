public class Program {
        private int lineCount = 0;
        private int charCount = 0;
        private int wordCount = 0;
        private String longestWord = "";
        private boolean stopEntered = false;   //flag to check if "Stop" is entered.

        public void addLine(String line) {
            // If the user entered "stop", we set stopEntered to true to exit.
            if (line.equalsIgnoreCase("stop")) {
                stopEntered = true;
                return;   // Exit the method cause "stop" was entered.
            }

            lineCount++;
            charCount+= line.length();

            String[] words = line.split(" ");  // Splitting the line by spaces to get individual words
            wordCount += words.length;       //Add number of words in the line to wordCount

            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;   // Here we update the longestWord if this word is the longer one
                }
            }
        }

        // It returnes true if "stop" was entered, otherwise it is false.
        public boolean isStopEntered() {
            return stopEntered;
        }

        public int getLineCount() {
            return lineCount;
        }

        public int getCharCount() {
            return charCount;
        }

        public int getWordCount() {
            return wordCount;
        }

        public String getLongestWord() {
            return longestWord;
        }
}
