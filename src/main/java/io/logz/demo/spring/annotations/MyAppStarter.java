package io.logz.demo.spring.annotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
@ImportResource("classpath:guice-demo-props.xml")
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
