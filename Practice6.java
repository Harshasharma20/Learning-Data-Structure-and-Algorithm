class Practice6{
	
	public static void main(String[] args){

	 	int i=1,n=4;
	 	while(i<=n){

	 		int j=1;
	 		while(j<=i){

	 			if (i == 1){                                                                                        
            	System.out.print("1");
        		}
        		else if(j == 1 || j == i){
            	System.out.print("1");
            	}
        		else{
            	System.out.print("2");
            	}
        		j=j+1;
	 		}
	 		System.out.println();
	 		i++;
	 	}
	}
}