class Pitaji{

	private void marriage(){

		System.out.println("In Pitaji marriage");		
	}
}

class Betaji extends Pitaji{

	void marriage(){
		
		System.out.println("In Betaji marriage");
	}
}

class Client{

	public static void main(String[] args){

		Pitaji obj = new Betaji();
		obj.marriage();

		
	}

}