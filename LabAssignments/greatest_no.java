public class greatest_no {
	public static void main( String args[] ){
		int a = 66, 
				b = 12,
				c = 10;
		
		if( a > b ){
			if( a > c ){
				System.out.println("The largest no is:" + a) ;
			} else {
				System.out.println("The largest no is:" + c) ;
			}
		} else {
			if( b > c ){
				System.out.println("The greatest no is:" + b) ;
			} else {
				System.out.println("The greatest no is:" + c) ;
			}
		}
	}
}
