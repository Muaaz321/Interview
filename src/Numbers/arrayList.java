package Numbers;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> tvSeries = new ArrayList<>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Netflix");
		tvSeries.add("Mandolorian");
		
		Iterator<String> it = tvSeries.iterator();
		while (it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}

	}

}
