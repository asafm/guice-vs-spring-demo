package io.logz.demo.guice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public class MyAppStarter {

    private static final Logger logger = LoggerFactory.getLogger(MyAppStarter.class);

    private final AccountsService accountsService;

    @Inject
    public MyAppStarter(AccountsService accountsService) {
        this.accountsService = accountsService;
    }

    public void start() {
        logger.info("Hello there! Powered by Spring");
        accountsService.createAccount("Jennie");
    }
}
