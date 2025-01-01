package Basic.Operator;

public class AssignmentOperators {
	
    public static void main(String[] args) {
        int value;

        // Simple assignment
        value = 10;
        System.out.println("Simple assignment (=): " + value);

        // Add assignment
        value += 5;
        System.out.println("Add assignment (+=): " + value);

        // Subtract assignment
        value -= 3;
        System.out.println("Subtract assignment (-=): " + value);

        // Multiply assignment
        value *= 2;
        System.out.println("Multiply assignment (*=): " + value);

        // Divide assignment
        value /= 4;
        System.out.println("Divide assignment (/=): " + value);

        // Modulus assignment
        value %= 3;
        System.out.println("Modulus assignment (%=): " + value);

        // Power assignment
        value = 2; // Reset value
        value = (int) Math.pow(value, 8);
        System.out.println("Power assignment (**=): " + value);

        // Floor divide assignment
        value = 10; // Reset value
        value /= 2;
        System.out.println("Floor divide assignment (//=): " + value);

        // Bitwise AND assignment
        value &= 2;
        System.out.println("Bitwise AND assignment (&=): " + value);

        // Bitwise OR assignment
        value |= 5;
        System.out.println("Bitwise OR assignment (|=): " + value);

        // Bitwise XOR assignment
        value ^= 4;
        System.out.println("Bitwise XOR assignment (^=): " + value);

        value=20;
        // Left shift assignment
        value <<= 1;
        System.out.println("Left shift assignment (<<=): " + value);

        // Right shift assignment
        value >>= 1;
        System.out.println("Right shift assignment (>>=): " + value);
    }
}

