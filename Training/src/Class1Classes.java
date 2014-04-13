
public class Class1Classes {
	

	public static void main(String[] args) {
		class Dog {
			protected int weight;
			protected int height;
			protected int age;
			protected String type;
			int getWeight() {
				return weight;
			}
			void setWeight(int newWeight) {
				weight = newWeight;
			}
			int getHeight() {
				return height;
			}
			void setHeight(int newHeight) {
				height = newHeight;
			}
			int getAge() {
				return age;
			}
			void setAge(int newAge) {
				age = newAge;
			}
			String getType() {
				return type;
			}
			void setType(String newType) {
				type = newType;
			}
			void Bark (int barkTimes){
				for (int i = 1; i <= barkTimes; i++) {
					System.out.println ("Whoof!!!");
				}
			}
			// constructor with parameters
			public Dog(int newAge, int newHeight, int newWeight, String newType){
				this.age = newAge;
				this.height = newHeight;
				this.weight = newWeight;
				this.type = newType;
				
			}
			// constructor without parameters
			public Dog(){
				this.age = 0;
				this.height = 0;
				this.weight = 0;
				this.type = "";
			}
			void DogSpeak(String... dogSpeach){
				System.out.println ("I am now speaking in dog:");
				for (String Sentence:dogSpeach){
					System.out.println (Sentence);
				}
			}
	}
			Dog Kajtek = new Dog ();
			Dog Fifka = new Dog ();
			Dog Abi = new Dog ();
			Kajtek.Bark (3);
			Kajtek.DogSpeak("I am an advance living being","I love other dogs and humans");
		}

}
