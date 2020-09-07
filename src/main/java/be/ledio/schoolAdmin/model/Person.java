package be.ledio.schoolAdmin.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Person implements SchoolEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    @ManyToOne()
    @JoinColumn(name = "course_id")
    private Course course;
    @Transient
    @OneToOne(mappedBy = "person")
    private User user;
    private Collection<Course> courseHistory;
    @OneToMany(mappedBy = "person")
    private Grade grade;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection<Course> getCourseHistory() {
        return courseHistory;
    }

    public void setCourseHistory(Collection<Course> courseHistory) {
        this.courseHistory = courseHistory;
    }

    @Override
    public Object getPK() {
        return getId();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", course=" + course +
                ", user=" + user +
                '}';
    }
}
