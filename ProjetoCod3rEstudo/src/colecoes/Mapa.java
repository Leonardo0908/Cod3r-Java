package colecoes;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Leo");
		usuarios.put(1, "Ricardo");
		usuarios.put(3, "Fran");
		usuarios.put(4, "Davi");
		usuarios.put(5, "Kaio");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Ricardo"));
		
		System.out.println(usuarios.get(2));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		System.out.println();
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		System.out.println();
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() +" ");
			System.out.println(registro.getValue());
		}
	}
}
