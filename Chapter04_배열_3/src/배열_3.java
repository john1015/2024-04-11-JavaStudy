
public class 배열_3 {

	public static void main(String[] args) {
		
		String[] names= {"홍길동","심청이","이순신","강감찬","춘향이"};
		String[] sexs= {"남자","여자","남자","남자","여자"};
		
		//이름(성별)
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+"("+sexs[i]+")");
		}
		System.out.println("===== for-each사용 ======");
		//for-each
		int i=0;
		for (String name : names) {
			System.out.println(name+"("+sexs[i]+")");
			i++;
		}
	}

}
