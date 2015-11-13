package kz.kazntu.lessons.models;


import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    private int id ;
    private String lastName ;
    private String firstName ;
    private Group group ;

    public Student(){

    }
    public Student(String lastName, String firstName, Group group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group ;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "lname")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "fname")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @ManyToOne
    @JoinColumn(name = "group_id")
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
