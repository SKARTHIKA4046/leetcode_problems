class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=x;
	int c=0;
	if(n>0) {
	while(n!=0) {
		int k=n%10;
		c=c+k;
		n=n/10;
	}
	if(x%c==0) {
		return c;
	}
	else {
		return -1;
	}}
	else {
		return -1;
	}
    }
}