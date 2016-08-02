package ArrayList_vs_LinkedList;

/*
 * http://oranwind.org/eclipse-chang-yong-kuai-su-jian-ji-zi-dong-wan-cheng-auto-complete/
 */

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class listRace {
	private List<String> ArrayList_String;
	private List<String> LinkedList_String;
	public listRace(int n, int m) {
		fillArrayList(n);
		fillLinkedList(m);
		System.out.println();
		
		System.out.println("ArrayList 測試數量 : " + n);
		listRace_ArrayList(n);
		
		System.out.println();
		
		System.out.println("LinkedList 測試數量 : " + m);
		listRace_LinkedList(m);
	}
	
	public void listRace_ArrayList(int n) {
		ArrayList_for_each(n);
		ArrayList_iterator(n);
		ArrayList_every_size(n);
		ArrayList_once_size(n);
		ArrayList_decrease(n);
	}
	
	public void listRace_LinkedList(int n) {
		LinkedList_for_each(n);
		LinkedList_iterator(n);
		LinkedList_every_size(n);
		LinkedList_once_size(n);
		LinkedList_decrease(n);		
	}
	
	public void fillArrayList(int n) {
		long preTime = System.currentTimeMillis();
		List<String> data1 = new ArrayList<String>(n);
		for (int i = 0; i < n; i++) {
			data1.add(i + "");
		}
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("ArrayList 填充時間 : " + currentTime + " millisec");
		
		ArrayList_String = data1;
	}
	
	public void fillLinkedList(int n) {
		long preTime = System.currentTimeMillis();
		List<String> data2 = new LinkedList<String>();
		for (int i = 0; i < n; i++) {
			data2.add(i + "");
		}
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("LinkedList 填充時間 : " + currentTime + " millisec");
		
		LinkedList_String = data2;
	}
	
	public void ArrayList_for_each(int n) {
		long preTime = System.currentTimeMillis();
		for (String element : ArrayList_String) {
			;
		}
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("ArrayList foreach Run time : " + currentTime + " millisec");
	}
	
	public void ArrayList_iterator(int n) {
		long preTime = System.currentTimeMillis();
		Iterator<String> iterator = ArrayList_String.iterator();
		while (iterator.hasNext()) {
			iterator.next();
		}
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("ArrayList iterator Run time : " + currentTime + " millisec");
	}
	
	public void ArrayList_every_size(int n) {
		long preTime = System.currentTimeMillis();
		for (int j = 0; j < ArrayList_String.size(); j++) {
			ArrayList_String.get(j);
		}
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("ArrayList every size Run time : " + currentTime + " millisec");
	}
	
	public void ArrayList_once_size(int n) {
		long preTime = System.currentTimeMillis();
		int size = ArrayList_String.size();
		for (int j = 0; j < size; j++) {
			ArrayList_String.get(j);
		}
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("ArrayList once size Run time : " + currentTime + " millisec");
	}
	
	public void ArrayList_decrease(int n) {
		long preTime = System.currentTimeMillis();
		for (int j = ArrayList_String.size() - 1; j >= 0; j--) {
			ArrayList_String.get(j);
		}
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("ArrayList decrease Run time : " + currentTime + " millisec");
	}
	
	public void LinkedList_for_each(int n) {
		long preTime = System.currentTimeMillis();
		for (String element : LinkedList_String) {
			;
		}
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("LinkedList foreach Run time : " + currentTime + " millisec");
	}
	
	public void LinkedList_iterator(int n) {
		long preTime = System.currentTimeMillis();
		Iterator<String> iterator = LinkedList_String.iterator();
		while (iterator.hasNext()) {
			iterator.next();
		}
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("LinkedList iterator Run time : " + currentTime + " millisec");
	}
	
	public void LinkedList_every_size(int n) {
		long preTime = System.currentTimeMillis();
		for (int j = 0; j < LinkedList_String.size(); j++) {
			LinkedList_String.get(j);
		}
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("LinkedList every size Run time : " + currentTime + " millisec");
	}
	
	public void LinkedList_once_size(int n) {
		long preTime = System.currentTimeMillis();
		int size = LinkedList_String.size();
		for (int j = 0; j < size; j++) {
			LinkedList_String.get(j);
		}
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("LinkedList once size Run time : " + currentTime + " millisec");
	}
	
	public void LinkedList_decrease(int n) {
		long preTime = System.currentTimeMillis();
		for (int j = LinkedList_String.size() - 1; j >= 0; j--) {
			LinkedList_String.get(j);
		}
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("LinkedList decrease Run time : " + currentTime + " millisec");
	}

}
