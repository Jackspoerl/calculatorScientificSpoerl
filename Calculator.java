public class Calculator {

    //milliliters, cubic centimeters, teaspoons, tablespoons, fluid ounces, cups, pints, quarts, cubic inches
    public static double convertVolume(double volume, int sourceUnit, int targetUnit) {
        switch (sourceUnit) {
            case 1: // Cubic Meters
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume;
                    case 2: // Liters
                        return volume * 1000;
                    case 3: // Gallons
                        return volume * 264.172;
                    case 4: // Cubic Feet
                        return volume * 35.3147;
                    case 5: // Milliliters
                        return volume * 1e+6;
                    case 6: // Cubic Centimeters
                        return volume * 1e+6;
                    case 7: // Teaspoons
                        return volume * 202884;
                    case 8: // Tablespoons
                        return volume * 67628;
                    case 9: // Fluid Ounces
                        return volume * 33814;
                    case 10: // Cups
                        return volume * 4166.67;
                    case 11: // Pints
                        return volume * 2113.38;
                    case 12: // Quarts
                        return volume * 1056.69;
                    case 13: // Cubic Inches
                        return volume * 61023.7;
                }
            case 2: // Liters
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume / 1000;
                    case 2: // Liters
                        return volume;
                    case 3: // Gallons
                        return volume * 0.264172;
                    case 4: // Cubic Feet
                        return volume * 0.0353147;
                    case 5: // Milliliters
                        return volume * 1000;
                    case 6: // Cubic Centimeters
                        return volume * 1000;
                    case 7: // Teaspoons
                        return volume * 168.936;
                    case 8: // Tablespoons
                        return volume * 56.31;
                    case 9: // Fluid Ounces
                        return volume * 33.814;
                    case 10: // Cups
                        return volume * 4.167;
                    case 11: // Pints
                        return volume * 2.113;
                    case 12: // Quarts
                        return volume * 1.0567;
                    case 13: // Cubic Inches
                        return volume * 61.0237;
                }
            case 3: // Gallons
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume / 264.172;
                    case 2: // Liters
                        return volume * 3.78541;
                    case 3: // Gallons
                        return volume;
                    case 4: // Cubic Feet
                        return volume * 0.133681;
                    case 5: // Milliliters
                        return volume * 3785.41;
                    case 6: // Cubic Centimeters
                        return volume * 3785.41;
                    case 7: // Teaspoons
                        return volume * 768;
                    case 8: // Tablespoons
                        return volume * 266;
                    case 9: // Fluid Ounces
                        return volume * 133.228;
                    case 10: // Cups
                        return volume * 13.3228;
                    case 11: // Pints
                        return volume * 8;
                    case 12: // Quarts
                        return volume * 4;
                    case 13: // Cubic Inches
                        return volume * 231;
                }
            case 4: // Cubic Feet
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume / 35.3147;
                    case 2: // Liters
                        return volume * 28.3168;
                    case 3: // Gallons
                        return volume * 7.48052;
                    case 4: // Cubic Feet
                        return volume;
                    case 5: // Milliliters
                        return volume;
                    case 6: // Cubic Centimeters
                        return volume;
                    case 7: // Teaspoons
                        return volume;
                    case 8: // Tablespoons
                        return volume;
                    case 9: // Fluid Ounces
                        return volume;
                    case 10: // Cups
                        return volume;
                    case 11: // Pints
                        return volume;
                    case 12: // Quarts
                        return volume;
                    case 13: // Cubic Inches
                        return volume;
                }
            case 5: // Milliliters
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume;
                    case 2: // Liters
                        return volume;
                    case 3: // Gallons
                        return volume;
                    case 4: // Cubic Feet
                        return volume;
                    case 5: // Milliliters
                        return volume;
                    case 6: // Cubic Centimeters
                        return volume;
                    case 7: // Teaspoons
                        return volume;
                    case 8: // Tablespoons
                        return volume;
                    case 9: // Fluid Ounces
                        return volume;
                    case 10: // Cups
                        return volume;
                    case 11: // Pints
                        return volume;
                    case 12: // Quarts
                        return volume;
                    case 13: // Cubic Inches
                        return volume;
                }
            case 6: // Cubic Centimeters
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume;
                    case 2: // Liters
                        return volume;
                    case 3: // Gallons
                        return volume;
                    case 4: // Cubic Feet
                        return volume;
                    case 5: // Milliliters
                        return volume;
                    case 6: // Cubic Centimeters
                        return volume;
                    case 7: // Teaspoons
                        return volume;
                    case 8: // Tablespoons
                        return volume;
                    case 9: // Fluid Ounces
                        return volume;
                    case 10: // Cups
                        return volume;
                    case 11: // Pints
                        return volume;
                    case 12: // Quarts
                        return volume;
                    case 13: // Cubic Inches
                        return volume;
                }
            case 7: // Teaspoons
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume;
                    case 2: // Liters
                        return volume;
                    case 3: // Gallons
                        return volume;
                    case 4: // Cubic Feet
                        return volume;
                    case 5: // Milliliters
                        return volume;
                    case 6: // Cubic Centimeters
                        return volume;
                    case 7: // Teaspoons
                        return volume;
                    case 8: // Tablespoons
                        return volume;
                    case 9: // Fluid Ounces
                        return volume;
                    case 10: // Cups
                        return volume;
                    case 11: // Pints
                        return volume;
                    case 12: // Quarts
                        return volume;
                    case 13: // Cubic Inches
                        return volume;
                }
            case 8: // Tablespoons
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume;
                    case 2: // Liters
                        return volume;
                    case 3: // Gallons
                        return volume;
                    case 4: // Cubic Feet
                        return volume;
                    case 5: // Milliliters
                        return volume;
                    case 6: // Cubic Centimeters
                        return volume;
                    case 7: // Teaspoons
                        return volume;
                    case 8: // Tablespoons
                        return volume;
                    case 9: // Fluid Ounces
                        return volume;
                    case 10: // Cups
                        return volume;
                    case 11: // Pints
                        return volume;
                    case 12: // Quarts
                        return volume;
                    case 13: // Cubic Inches
                        return volume;
                }
            case 9: // Fluid Ounces
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume;
                    case 2: // Liters
                        return volume;
                    case 3: // Gallons
                        return volume;
                    case 4: // Cubic Feet
                        return volume;
                    case 5: // Milliliters
                        return volume;
                    case 6: // Cubic Centimeters
                        return volume;
                    case 7: // Teaspoons
                        return volume;
                    case 8: // Tablespoons
                        return volume;
                    case 9: // Fluid Ounces
                        return volume;
                    case 10: // Cups
                        return volume;
                    case 11: // Pints
                        return volume;
                    case 12: // Quarts
                        return volume;
                    case 13: // Cubic Inches
                        return volume;
                }
            case 10: // Cups
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume;
                    case 2: // Liters
                        return volume;
                    case 3: // Gallons
                        return volume;
                    case 4: // Cubic Feet
                        return volume;
                    case 5: // Milliliters
                        return volume;
                    case 6: // Cubic Centimeters
                        return volume;
                    case 7: // Teaspoons
                        return volume;
                    case 8: // Tablespoons
                        return volume;
                    case 9: // Fluid Ounces
                        return volume;
                    case 10: // Cups
                        return volume;
                    case 11: // Pints
                        return volume;
                    case 12: // Quarts
                        return volume;
                    case 13: // Cubic Inches
                        return volume;
                }
            case 11: // Pints
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume;
                    case 2: // Liters
                        return volume;
                    case 3: // Gallons
                        return volume;
                    case 4: // Cubic Feet
                        return volume;
                    case 5: // Milliliters
                        return volume;
                    case 6: // Cubic Centimeters
                        return volume;
                    case 7: // Teaspoons
                        return volume;
                    case 8: // Tablespoons
                        return volume;
                    case 9: // Fluid Ounces
                        return volume;
                    case 10: // Cups
                        return volume;
                    case 11: // Pints
                        return volume;
                    case 12: // Quarts
                        return volume;
                    case 13: // Cubic Inches
                        return volume;
                }
            case 12: // Quarts
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume;
                    case 2: // Liters
                        return volume;
                    case 3: // Gallons
                        return volume;
                    case 4: // Cubic Feet
                        return volume;
                    case 5: // Milliliters
                        return volume;
                    case 6: // Cubic Centimeters
                        return volume;
                    case 7: // Teaspoons
                        return volume;
                    case 8: // Tablespoons
                        return volume;
                    case 9: // Fluid Ounces
                        return volume;
                    case 10: // Cups
                        return volume;
                    case 11: // Pints
                        return volume;
                    case 12: // Quarts
                        return volume;
                    case 13: // Cubic Inches
                        return volume;
                }
            case 13: // Cubic Inches
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume;
                    case 2: // Liters
                        return volume;
                    case 3: // Gallons
                        return volume;
                    case 4: // Cubic Feet
                        return volume;
                    case 5: // Milliliters
                        return volume;
                    case 6: // Cubic Centimeters
                        return volume;
                    case 7: // Teaspoons
                        return volume;
                    case 8: // Tablespoons
                        return volume;
                    case 9: // Fluid Ounces
                        return volume;
                    case 10: // Cups
                        return volume;
                    case 11: // Pints
                        return volume;
                    case 12: // Quarts
                        return volume;
                    case 13: // Cubic Inches
                        return volume;
                }
                break;
        }
        return 0.0;
    }

}
