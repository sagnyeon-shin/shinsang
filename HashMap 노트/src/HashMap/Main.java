package HashMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String,Pokemon> pokedex = new HashMap();
		pokedex.put("��ī��", new Pokemon("��ī��"));
		pokedex.put("���̸�", new Pokemon("���̸�"));
		pokedex.put("�̻��ؾ�", new Pokemon("�̻��ؾ�"));
		pokedex.put("�̻���Ǯ", new Pokemon("�̻���Ǯ"));
		pokedex.put("�̻��ز�", new Pokemon("�̻��ز�"));
		
		Pokemon pikachu = pokedex.get("��ī��");
		pokedex.put("��ī��", new Pokemon("������"));
		
		for(String key : pokedex.keySet()) {
			System.out.println(pokedex.get(key));
		}
	}

}
