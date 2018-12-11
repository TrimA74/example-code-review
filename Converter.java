public class Converter {
    public static int bitsToDecimal(String bits){

        // to store the final value
        int total = 0;
        // the highest binary place value
        int power = 128;

        // loop for each bit in the byte left to right
        for (int index = 0; index < 8; index++) {

            // check if it is a 1 ..
            if(bits.charAt(index) == '1')
            {
                // .. add the place value to the total
                total = total + power;
            }

            // calculate the next place value
            power = power / 2;
        }
        return total;
    }
}
