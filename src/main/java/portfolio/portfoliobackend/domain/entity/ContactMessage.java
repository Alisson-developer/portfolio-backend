package portfolio.portfoliobackend.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Date;

@Entity(name = "CONTACT_MESSAGE")
public class ContactMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Contact_Me_Seq")
    @SequenceGenerator(name = "Contact_Me_Seq", sequenceName = "CONTACT_SEQ", allocationSize = 1)
    @Column(name = "ID_MESSAGE")
    private Long id;

    @Column(name = "NAME_REMENTENT", nullable = false )
    private String name;

    @Column(name = "SUBJECT_MESSAGE", nullable = false )
    private String subject;

    @Column(name = "MESSAGE", nullable = false )
    private String message;

    @Column(name = "CRIATION_DATE", nullable = false )
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
