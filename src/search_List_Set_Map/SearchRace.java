package search_List_Set_Map;

/*
 * http://blog.xuite.net/become/blog/5524115-%5BJava%5D�Q�צU��+MAP+SET+LIST+
 */

import java.util.Collections;
//import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
//import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class SearchRace {
	private ArrayList<String> initial = new ArrayList<String>();
	
	public SearchRace(int n, String target) {
		filledInitialList(n);
		System.out.println("���ռƶq : " + n + "  ;  ���եؼ� : " + target);
		System.out.println("---------------------------------------------");
		
		searchArrayList(n, target);
		searchLinkedList(n, target);
		System.out.println();
		
		searchHashSet(n, target);
		searchTreeSet(n, target);
		searchLinkedHashSet(n, target);
		System.out.println();
		
		searchHashMap(n, target);
		System.out.println();
		searchTreeMap(n, target);
		System.out.println();
		searchLinkedHashMap(n, target);
	}
	
	public void filledInitialList(int n) {
		for (int i = 0; i < n; i++) {
			initial.add(i + "A");
		}
		
		Collections.shuffle(initial);
	}
	
	public void searchArrayList(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		ArrayList<String> useList = new ArrayList<String>(n);
		for (int i = 0; i < n; i++) {
			useList.add(initial.get(i));
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("ArrayList ��R�ɶ� : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean result = useList.contains(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("ArrayList �j�M�ɶ� : " + currentTime + " millisec");
		System.out.println("�j�M���G : " + result);
	}
	
	public void searchLinkedList(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		LinkedList<String> useList = new LinkedList<String>();
		for (int i = 0; i < n; i++) {
			useList.add(initial.get(i));
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("LinkedList ��R�ɶ� : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean result = useList.contains(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("LinkedList �j�M�ɶ� : " + currentTime + " millisec");
		System.out.println("�j�M���G : " + result);
	}
	
	public void searchHashSet(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		HashSet<String> useSet = new HashSet<String>(n);
		for (int i = 0; i < n; i++) {
			useSet.add(initial.get(i));
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("HashSet ��R�ɶ� : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean result = useSet.contains(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("HashSet �j�M�ɶ� : " + currentTime + " millisec");
		System.out.println("�j�M���G : " + result);
	}
	
	public void searchTreeSet(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		TreeSet<String> useSet = new TreeSet<String>();
		for (int i = 0; i < n; i++) {
			useSet.add(initial.get(i));
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("TreeSet ��R�ɶ� : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean result = useSet.contains(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("TreeSet �j�M�ɶ� : " + currentTime + " millisec");
		System.out.println("�j�M���G : " + result);
	}
	
	public void searchLinkedHashSet(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		LinkedHashSet<String> useSet = new LinkedHashSet<String>();
		for (int i = 0; i < n; i++) {
			useSet.add(initial.get(i));
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("LinkedHashSet ��R�ɶ� : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean result = useSet.contains(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("LinkedHashSet �j�M�ɶ� : " + currentTime + " millisec");
		System.out.println("�j�M���G : " + result);
	}
	
	public void searchHashMap(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		HashMap<String, String> useMap = new HashMap<String, String>();
		for (String item : initial) {
			useMap.put(item, item);
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("HashMap ��R�ɶ� : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean keyresult = useMap.containsKey(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("HashMap key �j�M�ɶ� : " + currentTime + " millisec");
		System.out.println("�j�M���G : " + keyresult);
		
		long preTime2 = System.currentTimeMillis();
		boolean valueresult = useMap.containsValue(target);
		long aftTime2 = System.currentTimeMillis();
		long currentTime2 = aftTime2 - preTime2;
		System.out.println("HashMap value �j�M�ɶ� : " + currentTime2 + " millisec");
		System.out.println("�j�M���G : " + valueresult);
	}
	
	public void searchTreeMap(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		TreeMap<String, String> useMap = new TreeMap<String, String>();
		for (String item : initial) {
			useMap.put(item, item);
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("TreeMap ��R�ɶ� : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean keyresult = useMap.containsKey(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("TreeMap key �j�M�ɶ� : " + currentTime + " millisec");
		System.out.println("�j�M���G : " + keyresult);
		
		long preTime2 = System.currentTimeMillis();
		boolean valueresult = useMap.containsValue(target);
		long aftTime2 = System.currentTimeMillis();
		long currentTime2 = aftTime2 - preTime2;
		System.out.println("TreeMap value �j�M�ɶ� : " + currentTime2 + " millisec");
		System.out.println("�j�M���G : " + valueresult);
	}
	
	public void searchLinkedHashMap(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		LinkedHashMap<String, String> useMap = new LinkedHashMap<String, String>();
		for (String item : initial) {
			useMap.put(item, item);
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("LinkedHashMap ��R�ɶ� : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean keyresult = useMap.containsKey(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("LinkedHashMap key �j�M�ɶ� : " + currentTime + " millisec");
		System.out.println("�j�M���G : " + keyresult);
		
		long preTime2 = System.currentTimeMillis();
		boolean valueresult = useMap.containsValue(target);
		long aftTime2 = System.currentTimeMillis();
		long currentTime2 = aftTime2 - preTime2;
		System.out.println("LinkedHashMap value �j�M�ɶ� : " + currentTime2 + " millisec");
		System.out.println("�j�M���G : " + valueresult);
	}

}
