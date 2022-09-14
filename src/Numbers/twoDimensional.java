package Numbers;

public class twoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] twoDimensional = {{2,3,4},{5,6,7}};
		
		for(int r=0;r < twoDimensional.length;r++) {
			for(int c=0;c < twoDimensional[r].length;c++) {
				System.out.println(twoDimensional[r][c]+"");
			}
		}
		
	}

}
