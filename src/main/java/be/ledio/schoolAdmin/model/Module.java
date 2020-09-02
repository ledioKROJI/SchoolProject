package be.ledio.schoolAdmin.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Module implements SchoolEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    private String name;
    @Column(length = 5000)
    private String description;
    @ManyToOne()
    private Course course;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "exams_id")
    private Collection<Exam> exams;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Collection<Exam> getExams() {
        return exams;
    }

    public void setExams(Collection<Exam> exams) {
        this.exams = exams;
    }

    @Override
    public Object getPK() {
        return getId();
    }

    @Override
    public String toString() {
        return "Module{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", course=" + course +
                ", exams=" + exams +
                '}';
    }
}
