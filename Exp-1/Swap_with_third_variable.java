class Swap_with_third_variable {
    public static void main(String[] args) {
        int a = 28;
        int b = 56;

        System.out.println("Before swapping numbers: " + a + " " + b);
        // Swapping
        int temp = b;
        b = a;
        a = temp;
        System.out.println("After swapping numbers: " + a + " " + b);
    }
}
