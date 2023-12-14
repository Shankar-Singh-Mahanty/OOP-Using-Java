class Swap_without_third_variable {
    public static void main(String[] args) {
        int x = 28;
        int y = 56;

        System.out.println("Before Swapping numbers: " + x + " " + y);
        // Swapping
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping numbers: " + x + " " + y);
    }
}
