package search_List_Set_Map;

/*
 * http://blog.xuite.net/become/blog/5524115-%5BJava%5D討論各種+MAP+SET+LIST+
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
		System.out.println("測試數量 : " + n + "  ;  測試目標 : " + target);
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
		System.out.println("ArrayList 填充時間 : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean result = useList.contains(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("ArrayList 搜尋時間 : " + currentTime + " millisec");
		System.out.println("搜尋結果 : " + result);
	}
	
	public void searchLinkedList(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		LinkedList<String> useList = new LinkedList<String>();
		for (int i = 0; i < n; i++) {
			useList.add(initial.get(i));
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("LinkedList 填充時間 : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean result = useList.contains(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("LinkedList 搜尋時間 : " + currentTime + " millisec");
		System.out.println("搜尋結果 : " + result);
	}
	
	public void searchHashSet(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		HashSet<String> useSet = new HashSet<String>(n);
		for (int i = 0; i < n; i++) {
			useSet.add(initial.get(i));
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("HashSet 填充時間 : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean result = useSet.contains(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("HashSet 搜尋時間 : " + currentTime + " millisec");
		System.out.println("搜尋結果 : " + result);
	}
	
	public void searchTreeSet(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		TreeSet<String> useSet = new TreeSet<String>();
		for (int i = 0; i < n; i++) {
			useSet.add(initial.get(i));
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("TreeSet 填充時間 : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean result = useSet.contains(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("TreeSet 搜尋時間 : " + currentTime + " millisec");
		System.out.println("搜尋結果 : " + result);
	}
	
	public void searchLinkedHashSet(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		LinkedHashSet<String> useSet = new LinkedHashSet<String>();
		for (int i = 0; i < n; i++) {
			useSet.add(initial.get(i));
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("LinkedHashSet 填充時間 : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean result = useSet.contains(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("LinkedHashSet 搜尋時間 : " + currentTime + " millisec");
		System.out.println("搜尋結果 : " + result);
	}
	
	public void searchHashMap(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		HashMap<String, String> useMap = new HashMap<String, String>();
		for (String item : initial) {
			useMap.put(item, item);
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("HashMap 填充時間 : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean keyresult = useMap.containsKey(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("HashMap key 搜尋時間 : " + currentTime + " millisec");
		System.out.println("搜尋結果 : " + keyresult);
		
		long preTime2 = System.currentTimeMillis();
		boolean valueresult = useMap.containsValue(target);
		long aftTime2 = System.currentTimeMillis();
		long currentTime2 = aftTime2 - preTime2;
		System.out.println("HashMap value 搜尋時間 : " + currentTime2 + " millisec");
		System.out.println("搜尋結果 : " + valueresult);
	}
	
	public void searchTreeMap(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		TreeMap<String, String> useMap = new TreeMap<String, String>();
		for (String item : initial) {
			useMap.put(item, item);
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("TreeMap 填充時間 : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean keyresult = useMap.containsKey(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("TreeMap key 搜尋時間 : " + currentTime + " millisec");
		System.out.println("搜尋結果 : " + keyresult);
		
		long preTime2 = System.currentTimeMillis();
		boolean valueresult = useMap.containsValue(target);
		long aftTime2 = System.currentTimeMillis();
		long currentTime2 = aftTime2 - preTime2;
		System.out.println("TreeMap value 搜尋時間 : " + currentTime2 + " millisec");
		System.out.println("搜尋結果 : " + valueresult);
	}
	
	public void searchLinkedHashMap(int n, String target) {
		long preTime0 = System.currentTimeMillis();
		LinkedHashMap<String, String> useMap = new LinkedHashMap<String, String>();
		for (String item : initial) {
			useMap.put(item, item);
		}
		long aftTime0 = System.currentTimeMillis();
		long currentTime0 = aftTime0 - preTime0;
		System.out.println("LinkedHashMap 填充時間 : " + currentTime0 + " millisec");
		
		long preTime = System.currentTimeMillis();
		boolean keyresult = useMap.containsKey(target);
		long aftTime = System.currentTimeMillis();
		long currentTime = aftTime - preTime;
		System.out.println("LinkedHashMap key 搜尋時間 : " + currentTime + " millisec");
		System.out.println("搜尋結果 : " + keyresult);
		
		long preTime2 = System.currentTimeMillis();
		boolean valueresult = useMap.containsValue(target);
		long aftTime2 = System.currentTimeMillis();
		long currentTime2 = aftTime2 - preTime2;
		System.out.println("LinkedHashMap value 搜尋時間 : " + currentTime2 + " millisec");
		System.out.println("搜尋結果 : " + valueresult);
	}

}
