package site.paranoia.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import java.time.Instant;

public class BaseEntity {

    @Column(name = "created_by", nullable = false, length = 10, updatable = false)
    private Integer createdBy;

    @Column(name = "created_time", nullable = false, updatable = false)
    private Instant createdTime = Instant.now();

    @Column(name = "last_modified_by")
    private Integer lastModifiedBy;

    @LastModifiedDate
    @Column(name = "last_modified_date")
    @JsonIgnore
    private Instant lastModifiedDate = Instant.now();
}
