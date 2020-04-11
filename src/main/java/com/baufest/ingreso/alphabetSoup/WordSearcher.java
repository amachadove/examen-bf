package com.baufest.ingreso.alphabetSoup;

public class WordSearcher {

	private char soup[][];

	public WordSearcher(char soup[][]) {
		this.soup = soup;
	}

	/**
	 * El objetivo de este ejercicio es implementar una función que determine si una
	 * palabra está en una sopa de letras.
	 *
	 * ### Reglas - Las palabras pueden estar dispuestas direcciones horizontal o
	 * vertical, _no_ en diagonal. - Las palabras pueden estar orientadas en
	 * cualquier sentido, esto es, de derecha a izquierda o viceversa, y de arriba
	 * para abajo o viceversa. - El cambio de dirección puede estar a media palabra,
	 * de modo que, por ejemplo, parte de la palabra esté horizontal y de izquierda
	 * a derecha, parte esté vertical y de arriba hacia abajo, y otra parte
	 * horizontal de derecha a la izquierda.
	 *
	 * @param word Palabra a buscar en la sopa de letras.
	 *
	 * @return {@link Boolean} true si la palabra se encuentra en la sopa de letras.
	 */

	static int[] x = { -1, 0, 0, 1};  
    static int[] y = {  0,-1, 1, 0};

	public boolean isPresent(String word) {
		boolean foundWord = false;

		for (int row = 0; row < soup.length; row++) {
			for (int column = 0; column < soup[row].length; column++) {

				int len = word.length();

				for (int dir = 0; dir < 4; dir++) {
					int k;
					int rd = row + x[dir];
					int cd = column + y[dir];

					for (k = 1; k < len; k++) {
						if (rd >= soup.length || rd < 0 || cd >= soup[row].length || cd < 0)
							break;

						if (soup[rd][cd] != word.charAt(k)) {
							break;
						} 
						
						rd += x[dir];
						cd += y[dir];
					}

					if (k == len) {
						return true;
					}	
				}

			}
		}

		return foundWord;

	}
}
