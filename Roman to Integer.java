class Solution {
    public int romanToInt(String s) {
        //Create char array & put s into arr
        String[] arr = s.split("");
        
        //Create variable to add up the roman numeral
        int ans = 0;

        //Calculate roman numeral
        for(int j=0;j<arr.length;j++){
            //"M", 1000
            if("M".equals(arr[j])) {
                ans += 1000;
            }
            //"D", 500
            else if ("D".equals(arr[j])) {
                ans += 500;
            }
            //"C", 100
            else if ("C".equals(arr[j])){ 
                if (j == arr.length-1){
                    ans += 100;
                } else{
                    //If C is left side of M or D, Subtract C value (CM = 900 / CD = 400) 
                    if (("M".equals(arr[j+1])) || ("D".equals(arr[j+1])) ) {
                        ans -= 100;
                    }
                    //If not, add C
                    else    {
                        ans += 100;
                    }
                }
            } 

            //"L", 50
            else if ("L".equals(arr[j])) {
                ans += 50;
            }
            //"X", 10
            else if ("X".equals(arr[j])){ 
                if (j == arr.length-1){
                    ans += 10;
                } else{
                    //If X is left side of C or L, Subtract X value (XC = 90 / XL = 40) 
                    if (("C".equals(arr[j+1])) || ("L".equals(arr[j+1])) ) {
                        ans -= 10;    
                    }
                    //If not, add X
                    else    {
                        ans += 10;
                    }
                }
            }

            //"V", 5
            else if ("V".equals(arr[j])) {
                ans += 5;
            }
            //"I", 1
            else if ("I".equals(arr[j])){ 
                if (j == arr.length-1){
                    ans += 1;
                } else{
                    //If I is left side of X or V, Subtract I value (IX = 9 / IV = 4) 
                    if (("X".equals(arr[j+1])) || ("V".equals(arr[j+1])) ) {
                        ans -= 1;    
                    }
                    //If not, add I
                    else    {
                        System.out.println("Got I");
                        ans += 1;
                    }
                }
            }
        } // for loop end

        return ans;
    }
}
