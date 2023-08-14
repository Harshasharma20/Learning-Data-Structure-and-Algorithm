class ArrayPractice33{
	
	 void modifyAndRearrangeArr (int arr[], int n) {
        // Complete the function
	 	int doubleNumber = 1;
        for(int i=0;i<n;i++){
        	if(arr[i+1]==arr[i]){
        		doubleNumber  = (doubleNumber * arr[i]) * 2; 
        		arr[i+1]=0;
        	}
        }

        
    }
}