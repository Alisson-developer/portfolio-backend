package portfolio.portfoliobackend.domain.entity;

import com.sun.istack.NotNull;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "CONTACT_MESSAGE")
public class ContactMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
