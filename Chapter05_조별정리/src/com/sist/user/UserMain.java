package com.sist.user;
import java.util.*;
import com.sist.manager.*;
import com.sist.vo.*;

public class UserMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		GenieManager gmr = new GenieManager();
		
		while(true) {
			System.out.println("================= 메뉴 ================");
			System.out.println("1. 목록");
			System.out.println("2. 검색");
			System.out.println("3. 상세보기");
			System.out.println("4. 종료");
			System.out.println("=====================================");
			System.out.println("메뉴 선택 : ");
			int menu = scan.nextInt();
			if(menu==1) {
				int total = gmr.genieTotalPage();
				System.out.println("1"+total+"사이의페이지 입력");
				int page = scan.nextInt();
				Genie[] genie = gmr.genieListData(page);
				for (Genie g : genie) {
					System.out.println(g.getRank()+"."+g.getTitle());
				}
			}
			else if(menu==2) {
				System.out.println("검색어 입력 : ");
				String title=scan.next();
				Genie[] genie=gmr.genieFindData(title);
				for (Genie g : genie) {
					System.out.println(g.getRank()+"."+g.getTitle());
				}
			}
			else if(menu==3) {
				System.out.println("번호입력 : ");
				int mno=scan.nextInt();
				
				Genie ggg = gmr.genieDetailData(mno);
				System.out.println("순위 : "+ggg.getRank());
				System.out.println("곡명 : "+ggg.getTitle());
				System.out.println("앨범 : "+ggg.getAlbum());
				System.out.println("포스터 : "+ggg.getPoster());
				System.out.println("유튜브 : "+ggg.getYoutube());
				
			}
			else if(menu==4) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("없는 메뉴");
			}
		
		}
	}

}
