package com.baufest.ingreso.sorting;

import java.util.List;

public class Sorting {

    /**
     * Se debe ordenar primero por puntuación de manera descendente, luego por nombre de manera ascendente.
     * @param jugadores la lista de jugadores a ordenar
     * @return la lista ordenada de jugadores
     */
	public static List<Jugador> ordenarPorPuntuacionYNombre(List<Jugador> jugadores){

		if (jugadores.isEmpty() || jugadores.size() == 1) {
			return jugadores;
		} else {
			for (int i = 0; i < jugadores.size(); i++) {
				for (int j = i + 1; j < jugadores.size(); j++) {
					if (jugadores.get(i).getPuntuacion() < jugadores.get(j).getPuntuacion()) {
						Jugador jugador = new Jugador(jugadores.get(i).getNombre(), jugadores.get(i).getPuntuacion());
						jugadores.get(i).setNombre(jugadores.get(j).getNombre());
						jugadores.get(i).setPuntuacion(jugadores.get(j).getPuntuacion());
						
						jugadores.get(j).setNombre(jugador.getNombre());
						jugadores.get(j).setPuntuacion(jugador.getPuntuacion());
					} else if (jugadores.get(i).getPuntuacion() == jugadores.get(j).getPuntuacion()) {
						if (jugadores.get(i).getNombre().charAt(0) > jugadores.get(j).getNombre().charAt(0)) {
							Jugador jugador = new Jugador(jugadores.get(i).getNombre(), jugadores.get(i).getPuntuacion());
							jugadores.get(i).setNombre(jugadores.get(j).getNombre());
							jugadores.get(i).setPuntuacion(jugadores.get(j).getPuntuacion());
							
							jugadores.get(j).setNombre(jugador.getNombre());
							jugadores.get(j).setPuntuacion(jugador.getPuntuacion());
						}
					}
				}
			}
			return jugadores;
		}
		
	}

    /**
     * Se debe ordenar primero por puntuación de manera descendente. Cuando 2 jugadores tienen igual cantidad de puntos,
     * el que tiene menos perdidas se lo considerara el mayor. Luego a igual puntos y perdidas se seguirá usando el
     * nombre de manera ascendente.
     * @param jugadores la lista de jugadores a ordenar
     * @return la lista ordenada de jugadores
     */
	public static List<Jugador> ordenarPorPuntuacionPerdidasYNombre(List<Jugador> jugadores){
		if (jugadores.isEmpty() || jugadores.size() == 1) {
			return jugadores;
		} else {
			for (int i = 0; i < jugadores.size(); i++) {
				for (int j = i + 1; j < jugadores.size(); j++) {
					if (jugadores.get(i).getPuntuacion() < jugadores.get(j).getPuntuacion()) {
						Jugador jugador = new Jugador(jugadores.get(i).getNombre(), jugadores.get(i).getPuntuacion());
						jugadores.get(i).setNombre(jugadores.get(j).getNombre());
						jugadores.get(i).setPuntuacion(jugadores.get(j).getPuntuacion());
						
						jugadores.get(j).setNombre(jugador.getNombre());
						jugadores.get(j).setPuntuacion(jugador.getPuntuacion());
					} else if (jugadores.get(i).getPuntuacion() == jugadores.get(j).getPuntuacion()) {
						if (jugadores.get(i).getPerdidas() > jugadores.get(j).getPerdidas()) {
							Jugador jugador = new Jugador(jugadores.get(i).getNombre(), jugadores.get(i).getPuntuacion());
							jugadores.get(i).setNombre(jugadores.get(j).getNombre());
							jugadores.get(i).setPuntuacion(jugadores.get(j).getPuntuacion());
							
							jugadores.get(j).setNombre(jugador.getNombre());
							jugadores.get(j).setPuntuacion(jugador.getPuntuacion());
						}
					}
				}
			}
			return jugadores;
		}
		
	}
}
