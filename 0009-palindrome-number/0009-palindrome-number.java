class Solution {
    public boolean isPalindrome(int x) {
        int temp, sum=0, r;
        temp=x;
        while(x>0){
            r=x%10;
            sum=(sum*10)+r;
            x=x/10;
        }
       if(temp==sum)
            {
                    return true;
                }
            
        
        return false;
        
    }
}