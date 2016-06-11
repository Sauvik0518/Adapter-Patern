package iit.du;

import iit.du.PrintableListAdapter;

import java.util.ArrayList;

public class AdapterDesignPatternMain {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		PrintableListAdapter pl = new PrintableListAdapter();
		pl.printList(list);

	}

}
