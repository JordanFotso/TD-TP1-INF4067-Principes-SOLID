package classes;
public class MongoBDDatabase implements Database{
	@Override
	public void save(String data){
		System.out.println("Saving to MongoBD: "+data);
	}
}