import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Tests {

	@Test
	public void test() {
		Work w1 = new Work("j1",0,1);
		Work w2 = new Work("j2",1,5);
		Work w3 = new Work("j3",0,6);
		Work w4 = new Work("j4",0,4);
		ArrayList<Work> w = new ArrayList<Work>();
		ArrayList<Double> e = new ArrayList<Double>();
		w.add(w1);
		w.add(w2);
		w.add(w3);
		w.add(w4);
		Schedule s  = new Schedule();
		e.add((double)8.5);
		e.add((double)2.0);
		assertEquals(e,s.FCFS(w));
	}

	@Test
	public void test2() {
		Work w1 = new Work("j1",0,1);
		Work w2 = new Work("j2",1,5);
		Work w3 = new Work("j3",0,6);
		Work w4 = new Work("j4",0,4);
		ArrayList<Work> w = new ArrayList<Work>();
		ArrayList<Double> e = new ArrayList<Double>();
		w.add(w1);
		w.add(w2);
		w.add(w3);
		w.add(w4);
		Schedule s  = new Schedule();
		e.add((double)8.5);
		e.add((double)2.0);
		assertEquals(e,s.SJF(w));
	}
}
