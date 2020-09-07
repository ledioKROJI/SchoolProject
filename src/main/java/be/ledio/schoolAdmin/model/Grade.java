package be.ledio.schoolAdmin.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Grade implements SchoolEntities{

    @Id
    @Column(name = "id")
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;
    private Person person;
    @ManyToOne()
    @JoinColumn(name = "exam_id")
    private Exam exam;
    private BigDecimal gradeValue;
    @Lob
    private String comment;
    @Lob
    private String internalComment;
    private boolean absent;
    private boolean postpone;
    private LocalDate date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public BigDecimal getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(BigDecimal gradeValue) {
        this.gradeValue = gradeValue;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getInternalComment() {
        return internalComment;
    }

    public void setInternalComment(String internalComment) {
        this.internalComment = internalComment;
    }

    public boolean isAbsent() {
        return absent;
    }

    public void setAbsent(boolean absent) {
        this.absent = absent;
    }

    public boolean isPostpone() {
        return postpone;
    }

    public void setPostpone(boolean postpone) {
        this.postpone = postpone;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public Object getPK() {
        return getId();
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", person=" + person +
                ", exam=" + exam +
                ", gradeValue=" + gradeValue +
                ", comment='" + comment + '\'' +
                ", internalComment='" + internalComment + '\'' +
                ", absent=" + absent +
                ", postpone=" + postpone +
                ", date=" + date +
                '}';
    }
}
