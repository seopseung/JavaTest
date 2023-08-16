package com.test.question.q97;

public class Refrigerator {
	

	private Item[] list = new Item[100];
	private int index = 0;
	
	public void add(Item item) {
		
		this.list[index] = item;
		this.index++;
		
		System.out.printf("'%s를 냉장고에 넣었습니다.\n" , item.getName());
		
	}
	
	public Item get(String name) {
		
		Item item = null;
		int itemIndex = -1;
		
		for (int i = 0; i < index; i++) {
			
			if (this.list[i].getName().equals(name)) {
				
				item = this.list[i];
				itemIndex = i;
				this.index--;
				break;
				
			}
					
		}
		
		if (item != null) {
			
			for (int i = itemIndex; i < index; i++) {
				
				this.list[i] = this.list[i+1];
				
			}
		}
		
		return item;
	}
	
	public int count() {
		
		return this.index;
	}
	
	
	public void listItem() {
		
		System.out.println("[냉장고 아이템 목록]");
		
		for (int i = 0; i < index; i++) {
			
			Item item = this.list[i];
			
			System.out.printf("%s(%s)\n" , item.getName() , item.getExpiration());
		}
	}

}
