package io.logz.demo.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

@SuppressWarnings("PointlessBinding")
public class MyAppModule extends AbstractModule {

    private final MyAppConfig myAppConfig;

    public MyAppModule(MyAppConfig myAppConfig) {
        this.myAppConfig = myAppConfig;
    }

    @Override
    protected void configure() {
        bind(MyAppStarter.class);
//        bind(AccountsService.class);
        bind(AlertsService.class);
        bind(AuditService.class);
        bind(ConfigDeployer.class);
        bind(DnsService.class);
        bind(OriginService.class);
        bind(AccountsDAO.class);
    }

    @Provides
    public AccountsService provideAccountsServices(AlertsService alertsService, AuditService auditService,
                                                   AccountsDAO accountsDAO, ConfigDeployer configDeployer,
                                                   OriginService originService) {
        return new AccountsService(alertsService, auditService, accountsDAO, configDeployer, originService,
                myAppConfig.getMaxUsersPerAccount());
    }
}
