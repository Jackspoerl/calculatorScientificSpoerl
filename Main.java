import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Volume Conversion:");
        System.out.println("1. Cubic Meters");
        System.out.println("2. Liters");
        System.out.println("3. Gallons");
        System.out.println("4. Cubic Feet");
        System.out.println("5. Milliliters");
        System.out.println("6. Cubic Centimeters");
        System.out.println("7. Teaspoons");
        System.out.println("8. Tablespoons");
        System.out.println("9. Fluid Ounces");
        System.out.println("10. Cups");
        System.out.println("11. Pints");
        System.out.println("12. Quarts");
        System.out.println("13. Cubic Inches");
        System.out.print("Enter the source volume unit (1/2/3/4/5/6/7/8/9/10/11/12/13): ");
        int sourceUnit = scanner.nextInt();
        System.out.print("Enter the volume value: ");
        double volume = scanner.nextDouble();
        System.out.print("Enter the target volume unit (1/2/3/4/5/6/7/8/9/10/11/12/13): ");
        int targetUnit = scanner.nextInt();
        System.out.println("Converted volume: " + Calculator.convertVolume(volume, sourceUnit, targetUnit));



        scanner.close();

    }


}