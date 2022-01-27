package br.com.zup.zupzeebestart.service.impl;

import br.com.zup.zupzeebestart.domain.Checkpoint;
import br.com.zup.zupzeebestart.repository.CheckpointRepository;
import br.com.zup.zupzeebestart.service.ICheckpointService;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckpointService implements ICheckpointService {

    @Autowired private CheckpointRepository checkpointRepository;

    @Override
    public Optional<Checkpoint> findByWorker(String worker) {
        return checkpointRepository.findByWorker(worker);
    }

    @Override
    public void save(Checkpoint checkpoint) {
        checkpointRepository.save(checkpoint);
    }

    @Override
    public void updateEndAt(String worker, LocalDateTime endAt) {
        Optional<Checkpoint> byWorker = findByWorker(worker);
        byWorker.ifPresent(checkpoint -> {
            checkpoint.setEndAt(endAt);
            save(checkpoint);
        });
    }

}
