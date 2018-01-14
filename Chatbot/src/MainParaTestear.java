import java.util.ArrayList;

public class MainParaTestear {

	public static void main(String[] args) {
		RespuestasAprendidas ra = new RespuestasAprendidas();
		ArrayList al = new ArrayList<String>();
		al.add("hola");
		al.add("chau");
		ra.setNuevasRespuestas(al);
		while(ra.hasNext())
			System.out.println(ra.next());		
	}
}