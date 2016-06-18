package io.logz.demo.guice;

import javax.inject.Inject;

public class AlertsService {
    private AuditService auditService;

    @Inject
    public AlertsService(AuditService auditService) {
        this.auditService = auditService;
    }
}
