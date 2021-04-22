package tr.edu.medipol.yazilimaraclari.ders7;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBuyukHarfeCevir() {
		
		String ornek = "Merhaba Arkadaslar";
		
		String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
		
		assertEquals("MERHABA ARKADASLAR", sonuc);
	}

}
