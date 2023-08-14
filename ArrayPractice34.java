class ArrayPractice34{
	
	public static void Rearrange(int a[], int n)
    {
        // Your code goes here
        int index = 0,i;
        for(i=0;i<=n;i++){
        	if(a[i]<0){
        		a[index] = a[i];
        		index++;
        	}
        	//System.out.println(index);
        	while(index<a.length){
        		a[index] = 0;
        		index++;
        	}
        	System.out.println(a[index]);

        }
        
    }
    public static void main(String[] args){
    	int a[] = {-3,3,-2,3};
    	int n = a.length;
 Rearrange(a,n);

    }
}