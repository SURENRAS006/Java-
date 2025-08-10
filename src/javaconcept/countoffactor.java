package javaconcept;

class countoffactor {
    public static void main(String[] args) {
        int number = 50;
        int count = 0; 
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total number of factors: " + count);
    }
}
