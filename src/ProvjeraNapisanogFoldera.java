import tastniPackage.tastniPackage.TestnaPodKlasa;
import testniPackage.TestnaKlasa;


public class ProvjeraNapisanogFoldera {

	public static void main(String[] args) {
		testniPackage.TestnaKlasa.nekiIspisUTestnojKlasi();
		TestnaPodKlasa.josNekiIspisOD("Radi li import");
        TestnaKlasa.nekiIspisUTestnojKlasi();
        
        TestnaKlasa promjenjivaTipatestnaKlasa = new TestnaKlasa();
        promjenjivaTipatestnaKlasa.nekiIspisKojiNijeStatic();
        
	}

}
