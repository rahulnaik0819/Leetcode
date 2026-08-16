class Solution {
    public int secondHighest(String s) {
        //write Code here//
        int max = -1;
        int secMax = -1;

        for(int i = 0; i < s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int digit = Character.getNumericValue(s.charAt(i));

                if(digit > max){
                    secMax = max;
                    max = digit;
                }

                else if (digit < max && digit > secMax){
                    secMax = digit;
                }
            }
        }
        return secMax;
    
        
    }
}