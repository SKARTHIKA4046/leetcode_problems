class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
	int left=0;
	int right=n-1;
	int top=0;
	int bottom=n-1;
	int ele=1;
	while(ele<=n*n) {
				for(int h=left;h<=right;h++){
            arr[top][h]=ele++;
			
		}
				top++;
				for(int h=top;h<=bottom;h++){
		            arr[h][right]=ele++;}
					right--;
				
				for(int h=right;h>=left;h--){
		            arr[bottom][h]=ele++;}
					bottom--;;
				
				for(int h=bottom;h>=top;h--){
		            arr[h][left]=ele++;}
					left++;
				
			 
}
return arr;
    }
}