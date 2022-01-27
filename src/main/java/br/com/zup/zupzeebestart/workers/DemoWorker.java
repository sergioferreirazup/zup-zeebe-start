package br.com.zup.zupzeebestart.workers;

import br.com.zup.zupzeebestart.domain.Checkpoint;
import br.com.zup.zupzeebestart.service.ICheckpointService;
import br.com.zup.zupzeebestart.service.impl.CheckpointService;
import br.com.zup.zupzeebestart.utils.LogUtils;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.ZeebeWorker;
import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoWorker {

    @Autowired private ICheckpointService checkpointService;

    @ZeebeWorker(type = "demo-worker", autoComplete = true)
    public void handleDemoWorker(final JobClient client, final ActivatedJob job) {
        LogUtils.logJob(job, null);

        String worker = job.getType() + "__" + job.getKey();
        checkpointService.save(Checkpoint.builder().worker(worker).startedAt(LocalDateTime.now()).build());
    }

}
