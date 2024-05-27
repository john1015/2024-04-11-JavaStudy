package com.sist.map;

import java.util.*;

public class SiteMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 로그인 2. 회원가입 3. 공지사항 4. 게시판 5. 맛집 : ");
		int menu = scan.nextInt();
		if(menu==1) {
			LoginModel model = new LoginModel();
			System.out.println(model);
			model.execute();
		}
		else if(menu==2) {
			JoinModel model = new JoinModel();
			System.out.println(model);
			model.execute();
		}
		else if(menu==3) {
			NoticeModel model = new NoticeModel();
			System.out.println(model);
			model.execute();
		}
		else if(menu==4) {
			BoardModel model = new BoardModel();
			System.out.println(model);
			model.execute();
		}
		else if(menu==5) {
			FoodModel model = new FoodModel();
			System.out.println(model);
			model.execute();
		}
		else {
			System.out.println("메뉴가 존재하지 않는다");
		}
	}
}
