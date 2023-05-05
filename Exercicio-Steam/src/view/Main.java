package view;

import java.io.IOException;

import controller.ISteamController;
import controller.SteamController;

public class Main {

	public static void main(String[] args) {
		
		SteamController sC = new SteamController();
		
		String path = "C:\\Steam";
		String nome = "SteamCharts.csv";
		
		try {
			sC.infos(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}