// Matrix multiplication in java
// Algorithm written and understood by hand

class matrices{
	public static void main(String[] args){
		int[][] a = {{1,1,1}, {2,2,2}, {3,3,3}};
		int[][] b = {{1,1,1}, {2,2,2}, {3,3,3}};
		int[][] c = new int[3][3];

		for( int i=0; i<3; i++ ){
			for( int k=0; k<3; k++ ){
				c[i][k] = 0;
				for( int j=0; j<3; j++ ){
					c[i][k] += a[i][j]*b[j][k];
				}
				System.out.print(c[i][k]+" ");
			}
			System.out.println();
		}
	}
}
