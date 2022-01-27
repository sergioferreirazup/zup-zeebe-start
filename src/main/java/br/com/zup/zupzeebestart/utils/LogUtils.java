package br.com.zup.zupzeebestart.utils;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import java.time.Instant;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogUtils {

    public static void logJob(final ActivatedJob job, Object parameterValue) {
        log.info(
                "complete job\n"
                        + ">>> [type: {}, key: {}, element: {}, workflow instance: {}]\n"
                        + "{deadline; {}]\n"
                        + "[headers: {}]\n"
                        + "[variable parameter: {}\n"
                        + "[variables: {}]",
                job.getType(),
                job.getKey(),
                job.getElementId(),
                job.getProcessInstanceKey(),
                Instant.ofEpochMilli(job.getDeadline()),
                job.getCustomHeaders(),
                parameterValue,
                job.getVariables());
    }
}
