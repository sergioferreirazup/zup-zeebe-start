package br.com.zup.zupzeebestart.service;

import io.camunda.zeebe.spring.client.ZeebeClientLifecycle;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {

    @Autowired private ZeebeClientLifecycle client;

    public void startProcess(String bpmnId, Map<String, Object> variables) {
        client.newCreateInstanceCommand().bpmnProcessId(bpmnId).latestVersion().variables(variables).send().join();
    }

}
