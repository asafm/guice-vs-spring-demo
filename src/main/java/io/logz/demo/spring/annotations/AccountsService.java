package io.logz.demo.spring.annotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class AccountsService {

    private static final Logger logger = LoggerFactory.getLogger(AccountsService.class);
    private final AlertsService alertsService;
    private final AuditService auditService;
    private final AccountsDAO accountsDAO;
    private final ConfigDeployer configDeployer;
    private final OriginService originService;
    private final int maxAccountsPerUser;

    @Inject
    public AccountsService(AlertsService alertsService, AuditService auditService, AccountsDAO accountsDAO,
                           ConfigDeployer configDeployer, OriginService originService,
                           @Value("${accounts.maxPerUser}") int maxAccountsPerUser) {
        this.alertsService = alertsService;
        this.auditService = auditService;
        this.accountsDAO = accountsDAO;
        this.configDeployer = configDeployer;
        this.originService = originService;
        this.maxAccountsPerUser = maxAccountsPerUser;
        logger.info("Max accounts per user: {}", maxAccountsPerUser);
    }

    public void createAccount(String accountName) {
        logger.info("Creating account {}", accountName);
    }

    //
    // My code goes here
    ///

}
