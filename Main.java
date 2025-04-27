/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
// Main.java
public class Main {
    public static void main(String[] args) {
        // Test default constructor
        DACArecipient defaultRecipient = new DACArecipient();
        System.out.println("Default Constructor:");
        System.out.println(defaultRecipient);

        System.out.println();

        // Test full constructor
        DACArecipient fullRecipient = new DACArecipient(
            "Smith",
            "John",
            "A123456789",
            "Mexico",
            2420000,
            2425000,
            2430000,
            'M'
        );
        System.out.println("Full Constructor:");
        System.out.println(fullRecipient);
    }
}
