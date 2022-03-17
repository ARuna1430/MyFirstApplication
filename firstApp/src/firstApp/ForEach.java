package firstApp;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,3,45,6};
		int max = a[0];
		for(int x:a) {
			System.out.println(x);
			if(x>max) {
				max = x;
				
			}
		}
		System.out.println("Maximum no is:"+max);
		

	}

}
