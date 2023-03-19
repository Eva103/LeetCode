class Solution {
    public boolean isPalindrome(int x) {
        int y=x; 
        int z=x; 
        int[] arr; 
        int digit; 
        boolean b=true;
        int i=0;

        if(x<0) b=false;
        else{
            while(y>0){//get array size i 
                digit=y%10;
                y/=10;
                i++;
            }
            arr = new int[i];
            while(z>0){//put digit into array
                //get reminder
                digit=z%10;
                //put digit into arr
                arr[i-1]=digit;
                i--;
                z/=10;
            }
            if(arr.length>1){
                for(int j=0;j<=arr.length/2;j++){
                    //compare arr[j] & arr[arr.length-1] = same
                    //put boolean b whether true or false
                    if(arr[j]!=arr[arr.length-j-1]) {
                       b=false; 
                       return b;
                    }
                    else {
                        b=true;
                    }
                }
            } else b=true;
        }
        return b;
    }
}
