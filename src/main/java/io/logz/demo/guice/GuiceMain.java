package io.logz.demo.guice;

import com.google.common.io.Resources;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GuiceMain {

    private static final Logger logger = LoggerFactory.getLogger(GuiceMain.class);

    public static void main(String[] args) {
        MyAppConfig myAppConfig = new MyAppConfig(loadProps());
        Injector injector = Guice.createInjector(new MyAppModule(myAppConfig));
        MyAppStarter myAppStarter = injector.getInstance(MyAppStarter.class);
        myAppStarter.start();
    }

    private static Properties loadProps() {
        try (InputStream is = Resources.getResource("guice-demo-config.properties").openStream()) {
            Properties properties = new Properties();
            properties.load(is);
            return properties;
        } catch (IOException e) {
            throw new RuntimeException("Failed reading configuration file", e);
        }
    }
}
