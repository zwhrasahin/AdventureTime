package AdventureTime;

public class SafeHouse extends NormalLoc {

	SafeHouse(Player player) {
		super(player,"Güvenli Ev");
		
	}
    public boolean getLocation() {
    	player.setHealty(player.getrHealty());
    	System.out.println("İyileştiniz...");
    	System.out.println("Şuan Güvenli Ev Adlı Yerdesiniz.");
    	return true;
    }
	

	}


