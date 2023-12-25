// Important Notice:
// This code is used for testing the InOrder function.
// Please avoid making any changes to this code.

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InOrderTest {
    public static void main(String[] args) {
        testInOrder();
    }

    public static void testInOrder() {
        int prev = -1;
        int count = 0;

        while (count < 10) {

            // Create a ByteArrayOutputStream to capture the output
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);

            // Redirect the standard output to the ByteArrayOutputStream
            PrintStream originalOut = System.out;
            System.setOut(printStream);
            InOrder.main(null); // Run the InOrder program

            // Reset the standard output
            System.setOut(originalOut);

            // Get the captured output as a string
            String capturedOutput = outputStream.toString();
            // Check if the generated sequence is non-decreasing
            if (!isNonDecreasing(capturedOutput)) {
                System.out.println("Test failed: Sequence is not non-decreasing");
                return;
            }

            count++;
        }

        System.out.println("All tests passed!");
    }

    public static boolean isNonDecreasing(String output) {

        String[] integers = output.trim().split("\\s+");

        int prev = -1;
        for (String numStr : integers) {
            int num = Integer.parseInt(numStr);
            if (num < prev) {
                return false;
            }
            prev = num;
        }

        return true;
    }
}
