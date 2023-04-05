package rock_paper_scissors;

public class GameConfig {

	int players;
	int symbols;
	
	public GameConfig(int player, int symbol) {
		this.players = player;
		this.symbols = symbol;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[플레이어: " + players + "], " + ">> 낸 것: " + symbols;
	}
	
	
}
