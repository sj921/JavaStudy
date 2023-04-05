package myobj;

import java.util.Comparator;

public class PeachPriceComparator implements Comparator<Peach> {

	@Override
	public int compare(Peach o1, Peach o2) {
		return o1.price - o2.price;
	}
}

	

