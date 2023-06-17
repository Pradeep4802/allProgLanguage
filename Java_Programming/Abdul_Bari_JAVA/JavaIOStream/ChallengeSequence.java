import java.io.*;

public class ChallengeSequence {
    public static void main(String[] args) {
        try {
            // Create InputStreams for the files to be concatenated
            InputStream input1 = new FileInputStream("Source1.txt");
            InputStream input2 = new FileInputStream("Source2.txt");
            OutputStream input3 = new FileOutputStream("Destination.txt");

            // Create a SequenceInputStream with the input streams
            SequenceInputStream sequenceInput = new SequenceInputStream(input1, input2);

            // Read from the SequenceInputStream
            int byteRead;
            while ((byteRead = sequenceInput.read()) != -1) {
                input3.write(byteRead);
            }

            // Close the SequenceInputStream, fileInputStream and fileOutStream
            sequenceInput.close();
            input1.close();
            input2.close();
            input3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
