public class Events {

	public static byte attack(byte str){
		return str;
	}

	public static byte counterAttack(byte str){
		return str;
	}

	public static void fight(Unit blue, Unit red){
		System.out.println(blue.name() + " is attacking " + red.name());
		int hp_red = red.hp() - attack(blue.str());
		int hp_blue = blue.hp();
		if (hp_red <= 0){
		red.setHP((byte)hp_red);
		System.out.println(red.name()+" has been defeated");
		}
		else{
		red.setHP((byte)hp_red);
		System.out.println(red.name() + " hp = " + red.hp());

		System.out.println(red.name() + " is counter attacking " + blue.name());
		hp_blue -= attack(red.str());
		blue.setHP((byte)hp_blue);
		System.out.println(blue.name() + " hp = " + blue.hp());
		}
	}
}
