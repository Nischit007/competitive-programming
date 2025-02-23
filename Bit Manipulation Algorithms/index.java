

// find the ith bit of a number 

public class index {
    public static void main(String[] args) {
        int a = 182; // Binary: 10110110
        int i = 5;   // Target bit position (1-based index)

        // Check i-th bit
        int mask = 1 << (i - 1);
        System.out.println(mask);
        boolean isSet = (a & mask) != 0;
        System.out.println("Is " + i + "th bit set? " + isSet);

        // Set the i-th bit
        int setBit = a | mask;
        System.out.println("After setting " + i + "th bit: " + setBit);

        // Reset the i-th bit
        int resetBit = a & ~mask;
        System.out.println("After resetting " + i + "th bit: " + resetBit);

        // Toggle the i-th bit
        int toggleBit = a ^ mask;
        System.out.println("After toggling " + i + "th bit: " + toggleBit);
    }
}
