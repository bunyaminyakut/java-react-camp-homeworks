package Abstract;

import Entity.Game;

public  class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun ba�ar�yla eklendi "+ game.getName());
}
}
