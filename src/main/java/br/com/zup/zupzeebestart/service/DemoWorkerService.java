package br.com.zup.zupzeebestart.service;

import io.camunda.zeebe.spring.client.ZeebeClientLifecycle;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoWorkerService {

    @Autowired private WorkerService workerService;

    public void startProcess() {
        workerService.startProcess("Demo", new HashMap<>());
    }
}
