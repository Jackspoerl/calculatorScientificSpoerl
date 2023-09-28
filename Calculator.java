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
                        return volume * 28320;
                    case 6: // Cubic Centimeters
                        return volume * 28320;
                    case 7: // Teaspoons
                        return volume * 5745.04;
                    case 8: // Tablespoons
                        return volume * 1915.01;
                    case 9: // Fluid Ounces
                        return volume * 957.506;
                    case 10: // Cups
                        return volume * 117.987;
                    case 11: // Pints
                        return volume * 59.844;
                    case 12: // Quarts
                        return volume * 29.922;
                    case 13: // Cubic Inches
                        return volume * 1728;
                }
            case 5: // Milliliters
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume * 1e+6;
                    case 2: // Liters
                        return volume * 1000;
                    case 3: // Gallons
                        return volume / 3785;
                    case 4: // Cubic Feet
                        return volume / 16.387;
                    case 5: // Milliliters
                        return volume;
                    case 6: // Cubic Centimeters
                        return volume;
                    case 7: // Teaspoons
                        return volume / 4.929;
                    case 8: // Tablespoons
                        return volume / 14.787;
                    case 9: // Fluid Ounces
                        return volume / 29.574;
                    case 10: // Cups
                        return volume / 240;
                    case 11: // Pints
                        return volume / 473.2;
                    case 12: // Quarts
                        return volume / 946.4;
                    case 13: // Cubic Inches
                        return volume / 16.387;
                }
            case 6: // Cubic Centimeters
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume / 1e+6;
                    case 2: // Liters
                        return volume / 1000;
                    case 3: // Gallons
                        return volume / 3785;
                    case 4: // Cubic Feet
                        return volume / 28320;
                    case 5: // Milliliters
                        return volume;
                    case 6: // Cubic Centimeters
                        return volume;
                    case 7: // Teaspoons
                        return volume / 4.929;
                    case 8: // Tablespoons
                        return volume / 14.787;
                    case 9: // Fluid Ounces
                        return volume / 29.574;
                    case 10: // Cups
                        return volume / 240;
                    case 11: // Pints
                        return volume / 473.2;
                    case 12: // Quarts
                        return volume / 946.4;
                    case 13: // Cubic Inches
                        return volume / 16.387;
                }
            case 7: // Teaspoons
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume / 202900;
                    case 2: // Liters
                        return volume / 202.9;
                    case 3: // Gallons
                        return volume / 768;
                    case 4: // Cubic Feet
                        return volume / 5745;
                    case 5: // Milliliters
                        return volume * 4.929;
                    case 6: // Cubic Centimeters
                        return volume * 4.929;
                    case 7: // Teaspoons
                        return volume;
                    case 8: // Tablespoons
                        return volume / 3;
                    case 9: // Fluid Ounces
                        return volume / 6;
                    case 10: // Cups
                        return volume / 48.692;
                    case 11: // Pints
                        return volume / 96;
                    case 12: // Quarts
                        return volume / 192;
                    case 13: // Cubic Inches
                        return volume / 3.325;
                }
            case 8: // Tablespoons
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume / 67630;
                    case 2: // Liters
                        return volume / 67.628;
                    case 3: // Gallons
                        return volume / 256;
                    case 4: // Cubic Feet
                        return volume / 1915;
                    case 5: // Milliliters
                        return volume * 14.787;
                    case 6: // Cubic Centimeters
                        return volume * 14.787;
                    case 7: // Teaspoons
                        return volume * 3;
                    case 8: // Tablespoons
                        return volume;
                    case 9: // Fluid Ounces
                        return volume / 2;
                    case 10: // Cups
                        return volume / 16.231;
                    case 11: // Pints
                        return volume / 32;
                    case 12: // Quarts
                        return volume / 64;
                    case 13: // Cubic Inches
                        return volume / 1.108;
                }
            case 9: // Fluid Ounces
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume / 33810;
                    case 2: // Liters
                        return volume / 33.814;
                    case 3: // Gallons
                        return volume / 128;
                    case 4: // Cubic Feet
                        return volume / 957.5;
                    case 5: // Milliliters
                        return volume * 29.574;
                    case 6: // Cubic Centimeters
                        return volume * 29.574;
                    case 7: // Teaspoons
                        return volume * 6;
                    case 8: // Tablespoons
                        return volume *2;
                    case 9: // Fluid Ounces
                        return volume;
                    case 10: // Cups
                        return volume / 8.115;
                    case 11: // Pints
                        return volume / 16;
                    case 12: // Quarts
                        return volume /32;
                    case 13: // Cubic Inches
                        return volume * 1.805;
                }
            case 10: // Cups
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume / 4167;
                    case 2: // Liters
                        return volume / 4.167;
                    case 3: // Gallons
                        return volume / 15.772;
                    case 4: // Cubic Feet
                        return volume / 118;
                    case 5: // Milliliters
                        return volume * 240;
                    case 6: // Cubic Centimeters
                        return volume * 240;
                    case 7: // Teaspoons
                        return volume * 48.692;
                    case 8: // Tablespoons
                        return volume * 16.231;
                    case 9: // Fluid Ounces
                        return volume * 8.115;
                    case 10: // Cups
                        return volume;
                    case 11: // Pints
                        return volume / 1.972;
                    case 12: // Quarts
                        return volume / 3.943;
                    case 13: // Cubic Inches
                        return volume * 14.646;
                }
            case 11: // Pints
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume / 2113;
                    case 2: // Liters
                        return volume / 2.113;
                    case 3: // Gallons
                        return volume / 8;
                    case 4: // Cubic Feet
                        return volume / 59.844;
                    case 5: // Milliliters
                        return volume * 473.2;
                    case 6: // Cubic Centimeters
                        return volume * 473.2;
                    case 7: // Teaspoons
                        return volume * 96;
                    case 8: // Tablespoons
                        return volume * 32;
                    case 9: // Fluid Ounces
                        return volume * 16;
                    case 10: // Cups
                        return volume * 1.972;
                    case 11: // Pints
                        return volume;
                    case 12: // Quarts
                        return volume / 2;
                    case 13: // Cubic Inches
                        return volume * 28.875;
                }
            case 12: // Quarts
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume / 1057;
                    case 2: // Liters
                        return volume / 1.057;
                    case 3: // Gallons
                        return volume / 4;
                    case 4: // Cubic Feet
                        return volume / 29.922;
                    case 5: // Milliliters
                        return volume * 946.4;
                    case 6: // Cubic Centimeters
                        return volume * 946.4;
                    case 7: // Teaspoons
                        return volume * 192;
                    case 8: // Tablespoons
                        return volume * 64;
                    case 9: // Fluid Ounces
                        return volume * 32;
                    case 10: // Cups
                        return volume * 3.943;
                    case 11: // Pints
                        return volume * 2;
                    case 12: // Quarts
                        return volume;
                    case 13: // Cubic Inches
                        return volume * 57.75;
                }
            case 13: // Cubic Inches
                switch (targetUnit) {
                    case 1: // Cubic Meters
                        return volume / 61020;
                    case 2: // Liters
                        return volume / 61.024;
                    case 3: // Gallons
                        return volume / 231;
                    case 4: // Cubic Feet
                        return volume / 1728;
                    case 5: // Milliliters
                        return volume * 16.387;
                    case 6: // Cubic Centimeters
                        return volume * 16.387;
                    case 7: // Teaspoons
                        return volume * 3.325;
                    case 8: // Tablespoons
                        return volume * 1.108;
                    case 9: // Fluid Ounces
                        return volume / 1.805;
                    case 10: // Cups
                        return volume / 14.646;
                    case 11: // Pints
                        return volume / 28.875;
                    case 12: // Quarts
                        return volume / 57.75;
                    case 13: // Cubic Inches
                        return volume;
                }
                break;
        }
        return 0.0;
    }

}
