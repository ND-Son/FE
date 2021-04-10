public class Unit{

	// Start of Attributes
	private String name = "generic";
	// Stats                    0       1      2      3      4      5      6      7        8
	private String label[]= { "hp", "str", "mag", "skl", "spd", "lck", "def", "res", "class"};
	private byte[] stat =   {    0,     0,     0,     0,     0,     0,      0,    0,       0};
	// end of Attributes

	// Constructor
	public Unit(String name, byte bases[]){
		this.name = name;
		this.stat = bases;
	}

	// Start of methods

	public void statline(){
		// Show stats
		System.out.println(this.name);
		for (int i = 0; i < this.stat.length; i++){
			System.out.println(this.label[i] + " " + this.stat[i]);
		}
	}

	// Getters
	public String name(){
		return this.name;
	}
	public byte str(){
		return this.stat[1];
	}

	public byte hp(){
		return this.stat[0];
	}

	// Setters

	public void setHP(byte hp){
		this.stat[0] = hp;
	}
	// End of methods
}
