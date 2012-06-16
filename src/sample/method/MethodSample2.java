package sample.method;

import java.util.ArrayList;

public class MethodSample2 {
	
	// 定数の宣言の仕方（static final）
	private static final String LIGHT_ITEM_1 = "1. 聖なる剣";
	private static final String LIGHT_ITEM_2 = "2. 光の玉";
	private static final String DARK_ITEM_1 = "1. 邪悪な剣";
	private static final String DARK_ITEM_2 = "2. 闇の衣";
	
	// メイン処理
	public static void main(String[] args) {
		
		ArrayList<String> itemList;
		
		// 全てのアイテムの一覧を得る
		System.out.println("-- 全アイテム --");
		itemList = getItemList();
		for (String str : itemList) {
			System.out.println(str);
		}
		System.out.println("-------------");
		
		// 聖なるアイテムの一覧を得る
		System.out.println("-- 光アイテム --");
		itemList = getItemList(true);
		for (String str : itemList) {
			System.out.println(str);
		}
		System.out.println("-------------");
		
	}
	
	// Over load の例
	// （同じメソッド名でも、引数が異なる場合は、別メソッドとして扱われる）
	private static ArrayList<String> getItemList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add(LIGHT_ITEM_1);
		list.add(LIGHT_ITEM_2);
		list.add(DARK_ITEM_1);
		list.add(DARK_ITEM_2);
		return list;
	}
	private static ArrayList<String> getItemList(boolean isHikari){
		ArrayList<String> list = new ArrayList<String>();
		if(isHikari){
			list.add(LIGHT_ITEM_1);
			list.add(LIGHT_ITEM_2);			
		}else{
			list.add(DARK_ITEM_1);
			list.add(DARK_ITEM_2);			
		}
		return list;
	}
}
