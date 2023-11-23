class Solution {
    public int reverse(int x) {
        int s=0;
        
           while (x!=0){
              
        int digit=x%10;
               
               x/=10;
               
               if(s > Integer.MAX_VALUE/10 || s == Integer.MAX_VALUE/10 && digit > 7){
        return 0 ;
      }
 
      if(s < Integer.MIN_VALUE/10 || s == Integer.MIN_VALUE/10 && digit < -8){
        return 0 ;
      }
          s=s*10+digit;
      
           
        }
    
    return s;
}
}