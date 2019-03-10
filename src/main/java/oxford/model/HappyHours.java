package oxford.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class HappyHours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Number start;
    @NotNull
    private Number finish;

    // GETTERS, SETTERS AND CONSTRUCTORS


    public HappyHours() {
    }

    public HappyHours(Number start, Number finish) {
        this.start = start;
        this.finish = finish;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Number getStart() {
        return start;
    }

    public void setStart(Number start) {
        this.start = start;
    }

    public Number getFinish() {
        return finish;
    }

    public void setFinish(Number finish) {
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "HappyHours{" +
                "id=" + id +
                ", start=" + start +
                ", finish=" + finish +
                '}';
    }
}
