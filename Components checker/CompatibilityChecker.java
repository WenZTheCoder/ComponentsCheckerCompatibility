import java.util.Scanner;

public class CompatibilityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input the components
        System.out.println("Enter your CPU model: ");
        String cpu = scanner.nextLine();
        
        System.out.println("Enter your GPU model: ");
        String gpu = scanner.nextLine();
        
        System.out.println("Enter your RAM capacity (in GB): ");
        int ram = scanner.nextInt();
        scanner.nextLine(); // to consume the remaining new line character
        
        // Check the compatibility of the components
        boolean isCompatible = checkCompatibility(cpu, gpu, ram);
        
        // Display the result
        if(isCompatible) {
            System.out.println("Congratulations! Your components are compatible.");
            
        } else {
            System.out.println("Sorry, your components are not compatible.");
        }
    }
    
    public static boolean checkCompatibility(String cpu, String gpu, int ram) {
        // Add your own compatibility checking logic here
        // For example, you can use a database or API to check if the CPU and GPU are compatible
        // You can also check if the RAM capacity meets the minimum requirements of the games
        // For the purpose of this sample code, we will assume that all components are compatible if the RAM capacity is 8 GB or higher
        return (ram >= 8);
    }
}