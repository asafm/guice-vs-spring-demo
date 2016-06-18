package io.logz.demo.spring.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public class AccountsService {

    private static final Logger logger = LoggerFactory.getLogger(AccountsService.class);
    private AlertsService alertsService;
    private AuditService auditService;
    private AccountsDAO accountsDAO;
    private ConfigDeployer configDeployer;
    private OriginService originService;
    private DnsService dnsService;
    private int maxAccountsPerUser;

    public AccountsService() {
    }

    @PostConstruct
    public void init() {
        logger.info("Max accounts per user: {}", maxAccountsPerUser);
    }

    public void createAccount(String accountName) {
        logger.info("Creating account {}", accountName);
    }

    //
    // My code goes here
    ///

    public void setAlertsService(AlertsService alertsService) {
        this.alertsService = alertsService;
    }

    public void setAuditService(AuditService auditService) {
        this.auditService = auditService;
    }

    public void setAccountsDAO(AccountsDAO accountsDAO) {
        this.accountsDAO = accountsDAO;
    }

    public void setConfigDeployer(ConfigDeployer configDeployer) {
        this.configDeployer = configDeployer;
    }

    public void setOriginService(OriginService originService) {
        this.originService = originService;
    }

    public void setMaxAccountsPerUser(int maxAccountsPerUser) {
        this.maxAccountsPerUser = maxAccountsPerUser;
    }

    public void setDnsService(DnsService dnsService) {
        this.dnsService = dnsService;
    }
}
