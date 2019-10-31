package talha;
import org.junit.*;

public class hesaplamaTest {

	@Test
	
	public void testtopla(){
		
		String sayi1 = "100.50";
		String sayi2 = "42.3";
		String sonuc = hesaplama.topla(sayi1, sayi2);
		
		Assert.assertEquals("142.90",sonuc);
	}
	@Test 
	
public void testtoplaBuyukSayilar(){
		
		String sayi1 = "90000000000";
		String sayi2 = "10000000042";
		String sonuc = hesaplama.topla(sayi1, sayi2);
		
		Assert.assertEquals("10000000000000042",sonuc);
	}

}
