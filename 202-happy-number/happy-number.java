class Solution {
    public int sumOfSquareOfDigits(int n){
        int sum=0;
        int a=n;
        while(a>0){
            int digit=a%10;
            sum=sum+(digit*digit);
            a=a/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=sumOfSquareOfDigits(slow);
            fast=sumOfSquareOfDigits(sumOfSquareOfDigits(fast));
            if(fast==1)
            return true;
            if(fast==slow){
                return false;
            }
        }
        return true;  
    }
}