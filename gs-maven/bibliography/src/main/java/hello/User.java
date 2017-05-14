package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    /*private Integer id;

    private String name;

    private String email;*/
    
    //newly added
    private Integer id;
    private String author;
    private String title;
    private String journal;
    private Integer year;
    //end
    
	/*public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}*/
	
	//newly added
	public User(String author, String title, Integer year, String journal ){
		this.author=author;
		this.title=title;
		this.year=year;
		this.journal=journal;
	}
	
	public User(){
		this.author="empty";
		this.title="empty";
		this.year=0;
		this.journal="empty";
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getJournal(){
		return journal;
	}
	
	public void setJournal(String journal) {
		this.journal = journal;
	}

	public Integer getYear(){
		return year;
	}
	
	public void setYear(Integer year) {
		this.year = year;
	}

}