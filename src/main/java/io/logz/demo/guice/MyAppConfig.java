package io.logz.demo.guice;

import java.util.Properties;

public class MyAppConfig {
    private final int maxUsersPerAccount;

    public MyAppConfig(Properties props) {
        maxUsersPerAccount = Integer.parseInt(props.getProperty("accounts.maxPerUser"));
    }

    public int getMaxUsersPerAccount() {
        return maxUsersPerAccount;
    }
}
