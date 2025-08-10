package javaconcept;
class primenumber {
    public static void main(String[] args) {
        int number =67;
        int count = 0;
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total number of factors: " + count);

        if (count == 2) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }
    }
}


