package interfaceAbstractDemo;

public class NeroRegistration implements CustomerRegistration{
	final MernisVerification mernisVerification;
	
	public NeroRegistration(MernisVerification mernisVerification) {
		this.mernisVerification = mernisVerification;
	}

	@Override
	public void Register(String massage) {
		if(mernisVerification.Verify()) {
			System.out.println("Nero kaydedildi : " + massage);
		}
		else {
			System.out.println("Do�rulama yap�lamad�.");
		}
		
		
	}

	public void BuyCoffee() {
		BuyCoffeeN buyCoffeeN = new BuyCoffeeN();
		buyCoffeeN.buyCoffee();
	}
}
