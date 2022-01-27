package br.com.zup.zupzeebestart.domain;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "checkpoint")
public class Checkpoint {

    @Id @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "worker")
    private String worker;

    @Column(name = "started_at")
    private LocalDateTime startedAt;

    @Column(name = "end_at")
    private LocalDateTime endAt;

}
