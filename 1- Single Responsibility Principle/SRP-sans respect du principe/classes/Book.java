package classes;
public class Book{
	private String title;
	private String author;
	private String content;

	public Book(String title, String author,String content){
		this.title = title;
		this.author = author;
		this.content = content; 
	}

	// Responsabilité 1: Gérer les données du livre
	public String getTitle(){ return this.title;}
	public String getAuthor(){ return this.author;}
	public String getContent(){ return this.content;}

	// Responsabilité 2: Afficher le livre (présentation)
	public void printToScreen(){
		System.out.println("Titre: "+this.title+"\n"+"Auteur: "+this.author+"\n"+"Titre: "+this.title);
	}

	//Responsabilité 3: Sauvegarde le livre(persistance)
	public void saveToDatabase(){
		System.out.println("Sauvegarde du livre " + this.title+" en base de donnée...");
	}
	
	//Responsabilité 4: (logique metier)
	public void emprunter(String lecteur){
		System.out.println("Emprunt du livre '"+ this.title+"' par "+lecteur);
	}
}