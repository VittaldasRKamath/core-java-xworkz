public class VegetableDescending {
    public static void main(String[] args) {
        String[] vegetables = {"LadiesFinger", "Cauliflower", "BitterGourd", "Onion", "Potato", "RedChilli"};

        // Bubble Sort algorithm
        int n = vegetables.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vegetables[j].compareTo(vegetables[j + 1]) < 0) { // Changed the comparison
                    // Swap vegetables[j] and vegetables[j+1]
                    String temp = vegetables[j];
                    vegetables[j] = vegetables[j + 1];
                    vegetables[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted Array in Descending Order:");
        for (String veg : vegetables) {
            System.out.print(veg + " \n");
        }
    }
}