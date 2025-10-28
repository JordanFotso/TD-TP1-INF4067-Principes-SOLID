package classes;
public class OrderProcessor {
	private Database database;
	public OrderProcessor(Database database){
		this.database = database;
	}
	public void processOrder(String order){
		this.database.save(order);
	}
}