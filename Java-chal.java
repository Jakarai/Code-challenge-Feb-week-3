public class Main {
  
   
    /* Java,C# & Python:
       Take the number 192 and multiply it by each of 1, 2, and 3:
       192 × 1 = 192
       192 × 2 = 384
       192 × 3 = 576
       By concatenating each product, we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)
       The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5,giving the pandigital, 918273645, which is the concatenated product of 9 and(1,2,3,4,5).
       What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n >1?
    }*/

    public static long pandigitalFind() {

       long result = 0;
       String nums;

       for (int x =0; x< 9999; x++ ) {
           nums = "";
           for (int y = 1; y < 9999; y++) {
                nums = nums + (x*y);
                if (nums.length() >= 9 ) break;
           }
           if (isPandigital(nums)) {
               result = Long.max(result, Long.parseLong(nums));
           }
       }
       return result;
    }

    public static boolean isPandigital(String pandigital) {
        if (pandigital.length() != 9)  {
            return false;
        }
        char[] charArray = pandigital.toCharArray();
        Arrays.sort(charArray);
        Boolean result = new String(charArray).equals("123456789");

       return result;
    }
}
