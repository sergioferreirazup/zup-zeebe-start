package br.com.zup.zupzeebestart.controller.impl;

import br.com.zup.zupzeebestart.controller.Api;
import br.com.zup.zupzeebestart.service.DemoWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApiImpl implements Api {

    @Autowired private DemoWorkerService workerService;

    @Override
    public void initDemoWorkflow() {
        workerService.startProcess();
    }
}
