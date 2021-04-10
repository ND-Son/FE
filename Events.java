public class Events {

	public static byte attack(byte str){
		return str;
	}

	public static void fight(Unit blue, Unit red){
		int hp = red.hp() - attack(blue.str());
		if (hp <= 0){
		red.setHP((byte)hp);
		System.out.println(red.name()+" has been defeated");
		}
		else
		System.out.println("red hp = " + red.hp());
	}
}
