package tr.edu.medipol.yazilimaraclari.ders7;

public class MetinIslemleri {

	public static void main(String[] args) {
		
		String ornek1 = "Merhaba Arkadaslar";
		String sonuc1 = MetinIslemleri.buyukHarfeCevir(ornek1);
		System.out.println(ornek1 + "->" + sonuc1);
	}
	
	static String buyukHarfeCevir(String orjinalMetin) {
		if(orjinalMetin == null) {
			return orjinalMetin;
		}
		return orjinalMetin.toUpperCase();
	}

}
