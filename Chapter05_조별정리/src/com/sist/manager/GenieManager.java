package com.sist.manager;

import java.io.*;
import java.util.*;
import com.sist.vo.Genie;

public class GenieManager {
	private static Genie[] musics = new Genie[200];

	public GenieManager() {
		try {
			FileReader fr = new FileReader("c:\\javaDev\\genie.txt");
			int i = 0;
			StringBuffer sb = new StringBuffer();
			while ((i = fr.read()) != -1) {
				sb.append((char) i);
			}
			fr.close();

			String data = sb.toString();
			String[] temp = data.split("\n");

			i = 0;
			for (String s : temp) {
				String[] music = s.split("\\|");
				musics[i] = new Genie();
				musics[i].setRank(music[0]);
				musics[i].setTitle(music[1]);
				musics[i].setAlbum(music[2]);
				musics[i].setPoster(music[3]);
				musics[i].setYoutube(music[4]);
				i++;
			}
		} catch (Exception ex) {
		}
	}

	public Genie[] genieListData(int page) {
		int total = genieTotalPage();
		int leng = 20;
		Genie[] genie = new Genie[leng];
		int j = 0;
		int pagecnt = (20 * page) - 20;
		for (int i = 0; i < musics.length; i++) {
			if (j < 20 && i <= pagecnt) {
				genie[i] = new Genie();
				genie[i] = musics[i];
				j++;
			}
		}
		return genie;
	}

	public Genie genieDetailData(int mno) {
		return musics[mno-1];
	}
	public Genie[] genieFindData(String title) {
		int count=0;
		for (Genie g : musics) {
			if(g.getTitle().contains(title)) {
				count++;
			}
		}
		Genie[] genie = new Genie[count];
		int i=0;
		for (Genie g : musics) {
			if(g.getTitle().contains(title)) {
				genie[i]=g;
				i++;
			}
		}
		
		return genie;
	}
	public int genieTotalPage() {
		return (int) (Math.ceil(musics.length / 20.0));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GenieManager g = new GenieManager();
		System.out.println("검색어 입력: ");
		String title = scan.next();
		Genie[] genie = g.genieFindData(title);
		for (Genie gg : genie) {
			System.out.println(gg.getRank()+"."+gg.getTitle());
			System.out.println("==================");
			System.out.println("상세별 음악번호: ");
			int mno = scan.nextInt();
			
			Genie ggg = g.genieDetailData(mno);
			System.out.println("순위 : "+ggg.getRank());
			System.out.println("곡명 : "+ggg.getTitle());
			System.out.println("앨범 : "+ggg.getAlbum());
			System.out.println("포스터 : "+ggg.getPoster());
			System.out.println("유튜브 : "+ggg.getYoutube());
		}

	}
}


