// 맛집 데이터형을 만들어서 => 값을 대입 후에 출력
class Food{
		String name="";
		String loc ="";
		String menu;
		double score;
	}
public class 클래스_7 {
	
	
	
	public static void main(String[] args) {
		Food f1 = new Food();
		f1.name="새벽집 청담동점";
		f1.score=4.0;
		f1.loc="청담동";
		f1.menu="꽃등심(150g), 양념갈비(260g), 생고기(150g), 불고기(200g), 샤브샤브(160g)";
		String[] menus = f1.menu.split(",");
		
		System.out.println("업체명 : "+f1.name);
		System.out.println("평점 : "+f1.score);
		System.out.println("지역 : "+f1.loc);
		for (String m : menus) {
			System.out.println("o "+m.trim());
		}
	}

}
