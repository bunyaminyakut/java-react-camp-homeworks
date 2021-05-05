package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.User;

public  class SaleManager implements SaleService{

	@Override
	public void sales(Game game, User user, Campaign campaign) {
		if (game.getId() > 0) {
			System.out.println(user.getFirstName() +" " + game.getPrice() + "TL fiyat�ndaki "+ game.getName() +" oyununu " + campaign.getCampaignName() + " kampanyas�yla "+campaign.getCampaignPrice()+ " TL indirimli sat�n ald� ");
		}

		else {
			System.out.println("B�yle bir oyunumuz bulunmamaktad�r!");
		}
	}
}
