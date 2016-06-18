package io.logz.demo.spring.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAppStarter {

    private static final Logger logger = LoggerFactory.getLogger(MyAppStarter.class);

    private AccountsService accountsService;

    public void start() {
        logger.info("Hello there! Powered by Spring");
        accountsService.createAccount("Jennie");
    }

    public void setAccountsService(AccountsService accountsService) {
        this.accountsService = accountsService;
    }
}
