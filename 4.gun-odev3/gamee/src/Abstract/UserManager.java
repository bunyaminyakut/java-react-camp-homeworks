package Abstract;

import Entity.User;

public  class UserManager implements UserService{
	
	CheckRealPersonService checkRealPerson;
	
	
	public UserManager(CheckRealPersonService checkRealPerson) {
		this.checkRealPerson=checkRealPerson;
	}
	
	@Override
	public void add(User user) throws Exception {
		
		if(checkRealPerson.checkRealPerson(user)) {
			System.out.println(" kullan�c� ekleme ba�ar�l� " + user.getFirstName());
			} else {
				System.out.println("Kullan�c� sahte! "+ user.getFirstName());
			
		
	}}
	@Override
	public void update(User user) {
		System.out.println("kullan�c� g�ncelleme ba�ar�l� " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� silme ba�ar�l� " + user.getFirstName());
		
	}


}
