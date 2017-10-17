package tele;

import java.util.ArrayList;
import java.util.HashMap;

public class Packet {
	private ArrayList<Item> items = new ArrayList<Item>();
	// 명칭으로 항목을 호출하기 위한 HashMap 정의
	private HashMap<String, Item> nameAccess = new HashMap<String, Item>();
	
	public void addItem(Item item) {
		this.items.add(item);
		// 동일명칭의 아이템 중복 예외처리
		if(nameAccess.containsKey(item.getName())) {
			throw new RuntimeException(
					"Duplicate item name:[" + item.getName() + "]");
		}
		nameAccess.put(item.getName(), item);
	}
	
	public Item getItem(String name) {
		return nameAccess.get(name);
	}
	
	public void parse(String data) {
		byte[] bdata = data.getBytes();
		int pos = 0;
		// 파싱된 문자열을 항목의 수만큼 각 항목의 길이로 잘라서 저장
		for(Item item: items) {
			byte[] temp = new byte[item.getLength()];
			// System.arraycopy(소스, 소스시작위치, 대상, 대상시작위치, 복사할길이)
			System.arraycopy(bdata, pos, temp, 0, item.getLength());
			pos += item.getLength();
			item.setValue(new String(temp));
		}
	}
	
	public String raw() {
		StringBuffer result = new StringBuffer();
		for(Item item: items) {
			result.append(item.raw());
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		/*
		Packet packet = new Packet();
		
		Item item1 = Item.create("이름", 10, "홍길동");
		Item item2 = Item.create("전화번호", 11, "01099998888"); 
		
		packet.addItem(item1);
		packet.addItem(item2);
		*/
		
		Packet recvPacket = new Packet();
		
		recvPacket.addItem(Item.create("생일", 8, null));
		recvPacket.addItem(Item.create("주소", 30, null));
		
		recvPacket.parse("19801215서울시 송파구 잠실동 123-3    ");
		
		System.out.println("[" +  recvPacket.getItem("주소").raw() + "]");
	}
}

