package Filefastsaveproject;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Failfastsava {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer>in=new CopyOnWriteArrayList<>();
		in.add(12);
		in.add(13);
		in.add(14);
		in.add(15);
		in.add(16);
		in.add(17);
		in.add(18);
		in.add(19);
		for(Integer i:in) {
			System.out.println(i);
			in.add(20);
		}

	}
}