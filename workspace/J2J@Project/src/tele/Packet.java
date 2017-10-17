package tele;

import java.util.ArrayList;
import java.util.HashMap;

public class Packet {
	private ArrayList<Item> items = new ArrayList<Item>();
	// ��Ī���� �׸��� ȣ���ϱ� ���� HashMap ����
	private HashMap<String, Item> nameAccess = new HashMap<String, Item>();
	
	public void addItem(Item item) {
		this.items.add(item);
		// ���ϸ�Ī�� ������ �ߺ� ����ó��
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
		// �Ľ̵� ���ڿ��� �׸��� ����ŭ �� �׸��� ���̷� �߶� ����
		for(Item item: items) {
			byte[] temp = new byte[item.getLength()];
			// System.arraycopy(�ҽ�, �ҽ�������ġ, ���, ��������ġ, �����ұ���)
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
		
		Item item1 = Item.create("�̸�", 10, "ȫ�浿");
		Item item2 = Item.create("��ȭ��ȣ", 11, "01099998888"); 
		
		packet.addItem(item1);
		packet.addItem(item2);
		*/
		
		Packet recvPacket = new Packet();
		
		recvPacket.addItem(Item.create("����", 8, null));
		recvPacket.addItem(Item.create("�ּ�", 30, null));
		
		recvPacket.parse("19801215����� ���ı� ��ǵ� 123-3    ");
		
		System.out.println("[" +  recvPacket.getItem("�ּ�").raw() + "]");
	}
}

