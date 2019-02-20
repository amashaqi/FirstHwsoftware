package hwsoftware;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestAlaa {
	
	cart y = new cart ();
	@Test
public 	void test() {
		assertEquals(0,y.a.size());
	}


	@Test
public	void test1() {
		y.addf(1);
		y.addf(1);
		y.addf(1);
		y.addf(1);
int z = 0;

for( int i =0 ; i< y.a.size();i++) {
	
	z=z+y.a.get(i);
}
assertEquals(4, z);
	}

	@Test
public	void test2() {
		y.addf2(1);
		y.addf2(1);
		y.addf2(1);
	
int z = 0;

for( int i =0 ; i< y.b.size();i++) {
	
	z=z+y.b.get(i);
}
assertEquals(3, z);
	}
public	void test3() {
		y.clear();
		y.addf(1);
		y.addf(2);
		y.addf2(127);
		y.addf2(100);
		int z = 0;

		for( int i =0 ; i< y.b.size();i++) {
			
			z=z+y.b.get(i);
		}
		
		assertEquals(2, y.a.size());
		assertEquals(227, z);
	

}
}
