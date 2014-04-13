
public class ClassesOnClasses {
static String JoinStrings (String... napisy){
		String result="";
		for (int i = 0; i<napisy.length; i++){
			result += napisy[i];
		}
		return result;
	}
static public String dateFromMili (long miliseconds) {
	// constants that will hold the number of miliseconds in a given time unit (year, month etc.)
	final int YEAR_IN_MILISECONDS = 12*30*24*60*60*1000;
	final int MONTH_IN_MILISECONDS = 30*24*60*60*1000;
	final int DAY_IN_MILISECONDS = 24*60*60*1000;
	final int HOUR_IN_MILISECONDS = 60*60*1000;
	final int MINUTE_IN_MILISECONDS = 60*1000;
	final int SECONDS_IN_MILISECONDS = 1000;
	// now use those constants to return an appropriate string.
	return  miliseconds +" miliseconds, "
			+miliseconds/SECONDS_IN_MILISECONDS+" seconds, "
			+miliseconds/MINUTE_IN_MILISECONDS+" minutes, "
			+miliseconds/HOUR_IN_MILISECONDS+" hours, "
			+miliseconds/DAY_IN_MILISECONDS+" days, "
			+miliseconds/MONTH_IN_MILISECONDS+" months, "
			+miliseconds/YEAR_IN_MILISECONDS+" years have passed";
}
	public static void main(String[] args) {

		class Dog {
			String name;
			int age, weight, height;
			public Dog (int parAge, int parWeight, int parHeight){
				age = parAge;
				weight = parWeight;
				height = parHeight;
			}
			public Dog (){};
		}
		Dog Kajtek = new Dog ();
		Kajtek.name = "Kajtek";
		System.out.println(Kajtek.name);
		System.out.println(JoinStrings("£ukasz", "czeœæ"," jestes super"));
		System.out.println(dateFromMili(2000));
		System.out.println("Now you can acces it in the repository!");
	}
}
/**	class dateFromMili {
		long mili;
		int years, months,days, hours, minutes, seconds, miliseconds;
		final static int YEAR_IN_MILISECONDS = 12*30*24*60*60*1000;
		final static int MONTH_IN_MILISECONDS = 30*24*60*60*1000;
		final static int DAY_IN_MILISECONDS = 24*60*60*1000;
		final static int HOUR_IN_MILISECONDS = 60*60*1000;
		final static int MINUTE_IN_MILISECONDS = 60*1000;
		final static int SECONDS_IN_MILISECONDS = 1000;
		public dateFromMili (long miliseconds) {
			mili =  miliseconds;
			years = (int)Math.floor(mili/YEAR_IN_MILISECONDS);
			months = (int)Math.floor(mili/MONTH_IN_MILISECONDS);
			days = (int)Math.floor(mili/DAY_IN_MILISECONDS);
			hours  = (int)Math.floor(mili/HOUR_IN_MILISECONDS);
			minutes  = (int)Math.floor(mili/MINUTE_IN_MILISECONDS);
			seconds  = (int)Math.floor(mili/SECONDS_IN_MILISECONDS);
			miliseconds = mili;
		}
		public String printDate () {
			return "
		}*
}
**/
