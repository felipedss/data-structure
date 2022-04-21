package cci.bitmanipulation;

public class BitwiseOperations {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        //bitwise AND
        //5=0101, 7=0111 = 0101 (5)

        //0 1 0 1
        //0 1 1 1
        //=======
        //0 1 0 1 (5)
        System.out.println("a&b " + (a & b)); // 5

        //bitwise OR
        //0 1 0 1
        //0 1 1 1
        //=======
        //0 1 1 1 (7)
        System.out.println("a|b " + (a | b)); // 7

        //bitwise XOR
        //0 1 0 1
        //0 1 1 1
        //=======
        //0 0 1 0 (2)
        System.out.println("aˆb " + (a ^ b)); // 2

        //bitwise NOT
        //0 1 0 1
        //=======
        //1 0 1 0
        // will give 2's complement of 1010 = -8 + 2 = -6
        System.out.println("~a = " + ~a);

    }

}
