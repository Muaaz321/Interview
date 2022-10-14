package Numbers;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "wrestlingg";
		int length = str.length();
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<length;i++) {
			
			for(int j=i+1;j<length;j++) {
				
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate characters are   : "+ch[j]);
					break;
				}
				
			}
			
		}
		
		
	}

}
