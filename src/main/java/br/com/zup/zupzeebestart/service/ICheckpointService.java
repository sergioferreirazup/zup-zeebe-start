package br.com.zup.zupzeebestart.service;

import br.com.zup.zupzeebestart.domain.Checkpoint;
import java.time.LocalDateTime;
import java.util.Optional;

public interface ICheckpointService {

    Optional<Checkpoint> findByWorker(String worker);
    void save(Checkpoint checkpoint);
    void updateEndAt(String worker, LocalDateTime endAt);

}
