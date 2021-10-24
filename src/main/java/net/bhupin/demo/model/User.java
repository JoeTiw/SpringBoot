package net.bhupin.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "users")
public class User {

       //User entities ---->  id, firstName, lastName, email

    //primary key for table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //primary generation key strategy

    private long id;

    @Column(name = "first_name")                                       //mapping the column
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

//default constructor
    public User(){

    }
    //create a constructor for firstName, lastName and email

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    //Getter and setter for each entity

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(long id) {
        this.id = id;
    }
}
