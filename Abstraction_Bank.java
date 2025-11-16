package projects_java;

public class Abstraction_Bank {

	public static void main(String[] args) {
		Sbi sbi = new Sbi();
		sbi.setlicense(true);
		sbi.KYC();
		sbi.Audit();
		sbi.license(true);
		System.out.println(sbi.getlicense());
		System.out.println("Repo Rate: " + sbi.repoRate());

	}

}

interface RBI {

	String license(boolean a);	  // getting permission from rbi
	float repoRate();			  // rbi gives loan to bank
	String KYC();   				  // bank must verify customer aadhaar and pan
	boolean Audit(); 			  // rbi checks follow rules or not
	
}
abstract class Rule implements RBI{
	private boolean license;
	public void setlicense(boolean a) {
		if(true == a) {
			this.license = a;
		}
		else
			System.out.println("get a Permission from RBI");
	}
	public String getlicense() {
		System.out.println("Get permission...." + license);
		if(license == true) {
			return "I have a License";	
		}
		else {
			return "Get license";
		}
	}
	
	abstract public float repoRate();	
}




class Sbi extends Rule{
	
	@Override
	public String license(boolean a) {
		System.out.println("SBI have a valid license from RBI ");
		if(true == a) {
			return "Yes";
		}
		else
			return "No";
		
	}

	@Override
	public String KYC() {
		
		System.out.println("Client done KYC");
		return "KYC Done";
	}

	@Override
	public boolean Audit() {
		System.out.println("Audit Done?");
		return false;
	}

	@Override
	public float repoRate() {
		return 9.15f;
	}
	
}