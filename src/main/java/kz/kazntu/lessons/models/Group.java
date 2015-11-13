package kz.kazntu.lessons.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "groups")
public class Group {
    private int id ;
    private String name ;
    private Set<Student> students = new HashSet<Student>() ;

    public Group(){

    }
    public Group(String name) {
        this.name = name;
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

    @Column(name = "group_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

}
