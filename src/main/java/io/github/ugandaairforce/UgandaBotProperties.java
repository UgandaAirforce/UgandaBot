package io.github.ugandaairforce;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UgandaBotProperties {
    private static final Properties CONFIG_PROPERTIES  = new Properties();

    static {
        InputStream inputStream = UgandaBotProperties.class.getClassLoader().getResourceAsStream("config.properties");
        try {
            CONFIG_PROPERTIES.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getProperty(String key) {
        return CONFIG_PROPERTIES.getProperty(key);
    }
}
