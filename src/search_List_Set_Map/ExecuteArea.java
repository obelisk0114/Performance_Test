package search_List_Set_Map;

public class ExecuteArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000000;
		String target1 = "500A";
		String target2 = "500Y";
		new SearchRace(n, target1);
		System.out.println("=============================================");
		new SearchRace(n, target2);

	}

}
