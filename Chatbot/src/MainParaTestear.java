import java.util.Collection;
import java.util.TreeMap;

public class MainParaTestear {

	public static void main(String[] args) {
		
		TreeMap mapa = new TreeMap();
		mapa.put("1", "uno");
		mapa.put("2", "dos");
		mapa.put("3", "tres");
		
		Decision dec = new Decision(mapa);
		
		while(dec.hasNext())
			System.out.println(dec.next());
		
	}

}
