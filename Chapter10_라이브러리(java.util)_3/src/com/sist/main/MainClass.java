package com.sist.main;

import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		
		Set_5 music = new Set_5();
		
		Set<String> genie = music.genieData();
		System.out.println("================= 지니뮤직 =====================");
		for (String title : genie) {
			System.out.println(title);
		}
		
		System.out.println("================= 멜론 =====================");
		Set<String> melon = music.melonData();
		for (String title : melon) {
			System.out.println(title);
		}
		
		System.out.println("================= 지니뮤직에만 있는 곡 =======================");
		Set<String> gTemp = new HashSet<String>();
		gTemp.addAll(genie);
		gTemp.removeAll(melon);
		for (String title : gTemp) {
			System.out.println(title);
		}
		System.out.println("================= 멜론에만 있는 곡 =======================");
		Set<String> mTemp = new HashSet<String>();
		mTemp.addAll(melon);
		mTemp.removeAll(genie);
		for (String title : mTemp) {
			System.out.println(title);
		}
		
		System.out.println("================ 지니뮤직 + 멜론 ==========================");
		// UNION / UNIONALL
		//		   =>중복
		// =>중복X
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(genie);
		list.addAll(melon);
		
		for (String title : list) {
			System.out.println(title);
		}
		
		System.out.println("=============  중복없는 데이터(지니+멜론)  =========================");
		Set<String> list2 = new HashSet<String>();
		list2.addAll(genie);
		list2.addAll(melon);
		for (String title : list2) {
			System.out.println(title);
		}
	}
}
