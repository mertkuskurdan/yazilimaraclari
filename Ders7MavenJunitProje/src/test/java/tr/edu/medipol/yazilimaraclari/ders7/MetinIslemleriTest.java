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
	
	@Test
	public void testBuyukHarfeCevirNullKontrolu() {
			
			String ornek = null;
			
			String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
			
			assertEquals(null, sonuc);
		}
	
	@Test
	public void testBuyukHarfeCevirBosString() {
			
			String ornek = "";
			
			String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
			
			assertEquals("", sonuc);
		}

}
