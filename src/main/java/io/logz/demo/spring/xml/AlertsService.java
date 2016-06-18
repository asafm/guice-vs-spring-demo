package io.logz.demo.spring.xml;

public class AlertsService {
    private AuditService auditService;

    public AlertsService() {
    }

    public void setAuditService(AuditService auditService) {
        this.auditService = auditService;
    }
}
