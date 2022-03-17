package collectionsPrograms;

public class sumOfArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int numbers[] = {5,8,3,9,6,6};
        int target = 11;
        int sum ;
        boolean found = false;
        for(int i =0;i<numbers.length;i++) {
        	//System.out.println("The first addend is:"+numbers[i]);
        	if(found!=true) {
        	for(int j=i+1;j<numbers.length;j++) {
            	//System.out.println("The second addend is:"+numbers[j]);
            	sum =0 ;
            	sum = numbers[i] + numbers[j];
            	//System.out.println("The sum value is:"+sum);
            	if(target == sum) {
            		System.out.println("i is"+i);
            		System.out.println("j is"+j);

            		System.out.println("The numbers are:"+numbers[i]+";"+numbers[j]);
            		found = true;
            		//break;
            	}
        		
        	}
        	}
        }
       // break;
	}

}
