package com.sist.util;

import java.text.DecimalFormat;
import java.util.*;
// DecimalFormat
// sysout => ctrl+space
public class 라이브러리_8 {
	public static void main(String[] args) {
		int[] won = {1000,10000,100000,100000000};
		DecimalFormat df = new DecimalFormat("###,###,###");
		for (int i = 0; i < won.length; i++) {
			System.out.println(df.format(won[i])+"원");
		}
		
	}
}
