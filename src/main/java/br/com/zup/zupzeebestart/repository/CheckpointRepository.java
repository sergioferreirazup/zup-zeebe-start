package br.com.zup.zupzeebestart.repository;

import br.com.zup.zupzeebestart.domain.Checkpoint;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckpointRepository extends CrudRepository<Checkpoint, Long> {

    Optional<Checkpoint> findByWorker(String worker);

}
