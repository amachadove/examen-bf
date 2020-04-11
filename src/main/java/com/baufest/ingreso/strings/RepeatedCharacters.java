package com.baufest.ingreso.strings;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {

	/**
	 * El metodo debe retornar un booleano indicando si el parametro `cadena` cumple
	 * con alguna de las siguientes propiedades: 1- Todos los caracteres aparecen la
	 * misma cantidad de veces. Ejemplos: "aabbcc", "abcdef", "aaaaaa" 2- Todos los
	 * caracteres aparecen la misma cantidad de veces, a excepcion de 1, que aparece
	 * un vez mas o una vez menos. Ejemplos: "aabbccc", "aabbc", "aaaaccccc"
	 * 
	 * @param cadena la cadena a evaluar
	 * @return booleano indicando si la cadena cumple con las propiedades
	 */
	public Boolean isValid(String cadena) {
		char[] chars = cadena.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : chars) {
			if (map.containsKey(c)) {
				int counter = map.get(c);
				map.put(c, ++counter);
			} else {
				map.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry1 : map.entrySet()) {
			Integer value1 = entry1.getValue();
			for (Map.Entry<Character, Integer> entry2 : map.entrySet()) {
				Integer value2 = entry2.getValue();
				if (value1 == value2 || value1 + 1 == value2 || value1 - 1 == value2) {
					continue;
				} else {
					return false;
				}
			}
		}
		return true;
	}

}
