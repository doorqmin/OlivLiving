package com.door.oliv.store;

import com.door.oliv.module.FurnType;

public class Oliv {

	public static void main(String[] args) {
		FurnType furn = FurnType.식탁;
		System.out.println("OlivLiving 당신의 삶에 편안함을 더합니다.");
		FurnType furnType[] = FurnType.values();
		
		String menu = String.join("/", 
				FurnType.식탁.toString(), 
				FurnType.옷장.toString(), 
				FurnType.책상.toString());
		
		System.out.println(menu);
		String[] menus = menu.split("/");
		return;
	}
}