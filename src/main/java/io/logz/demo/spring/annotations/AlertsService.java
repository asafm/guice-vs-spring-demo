package io.logz.demo.spring.annotations;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class AlertsService {
    private AuditService auditService;

    @Inject
    public AlertsService(AuditService auditService) {
        this.auditService = auditService;
    }
}
