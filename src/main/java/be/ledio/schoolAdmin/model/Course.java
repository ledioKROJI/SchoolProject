package be.ledio.schoolAdmin.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Course implements SchoolEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    private String name;
    @Column(length = 5000)
    private String description;
    private String imageURL;
    private boolean active;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "module_id")
    private Collection<Module> modules;
    @OneToMany(mappedBy = "course")
    private Collection<Person>  persons;

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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Collection<Module> getModules() {
        return modules;
    }

    public void setModules(Collection<Module> modules) {
        this.modules = modules;
    }

    public Collection<Person> getPersons() {
        return persons;
    }

    public void setPersons(Collection<Person> persons) {
        this.persons = persons;
    }

    @Override
    public Object getPK() {
        return getId();
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", active=" + active +
                ", modules=" + modules +
                ", persons=" + persons +
                '}';
    }
}
