package hu.odin;

import java.time.OffsetDateTime;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Laundry extends PanacheEntity {
    public String apartmentId;
    public OffsetDateTime startTime;
    public OffsetDateTime endTime;
    @Column(nullable = true)
    public String note;
}