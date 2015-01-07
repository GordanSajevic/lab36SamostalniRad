package lab36SamostalniRad;

public class Train {
	
	public static void printTrain(Engine engine)
	{
		Truck current = engine.getFirst();
		
		while(current != null){
			System.out.println(current.getLetter());
			current = current.getNext();
		}
	}
	
	public static void main(String[] args) {
		Truck[] alphabet = new Truck[26];
		Engine train = new Engine();
		int firstLetter = 65;
		for (int i=0; i<26; i++)
		{
			alphabet[i] = new Truck((char) firstLetter);
			firstLetter++;
		}
		train.attach(alphabet[0]);
		for(int i=0; i<alphabet.length-1; i++){
			alphabet[i].attach(alphabet[i+1]);
		}
		printTrain(train);
	}

}
