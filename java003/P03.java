package java003;

public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String typo = "안녕하세요";
		
		for(int i = 0; i < typo.length(); i++) {
			char comVal = (char) (typo.charAt(i) - 0xAC00);
			
			if(comVal >= 0 && comVal <= 11172) {
				char uniVal = (char)comVal;
				
				char choseong = (char) ((((uniVal - (uniVal % 28)) / 28) / 21) + 0x1100);
				char jungseong = (char) ((((uniVal - (uniVal % 28)) / 28) % 21) + 0x1161);
				char jongseong = (char) ((uniVal % 28) + 0x11a7);
				
				if(choseong != 4519) {
					System.out.print(choseong);
				}
				if(jungseong != 4519) {
					System.out.print(jungseong);
				}
				if(jongseong != 4519) {
					System.out.print(jongseong);
				}
			} 
		}
	}

}
