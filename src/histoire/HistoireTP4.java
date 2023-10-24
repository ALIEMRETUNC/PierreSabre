package histoire;

import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 15);
        Yakuza yakuza = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");

        yakuza.direBonjour();
        yakuza.extorquer(marco);
	}
}
