package factory;

public class AgeFactory {
	public static  String getAge(int age) {
		if(age < 18) {
			return null;
		}
		else if(age >=18 && age <=35 )
			return "18-35";
		else if(age >=36 && age <= 50)
			return "36-50";
		else
			return "50+";
		
	}
	

}
