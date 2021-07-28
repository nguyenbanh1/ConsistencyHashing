package nguyenbanh.com.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RedisProperties {

    private static Properties properties;

    static {
        properties = new Properties();
        String fileName = "ch-cache.properties";
        InputStream in = RedisProperties.class.getClassLoader().getResourceAsStream(fileName);
        try {
            properties.load(in);
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /**
     * 根据key，获取到相对应的Propertie。
     *
     * @param key
     * @return
     */
    public static Object getPropertie(String key) {
        return properties.get(key);
    }
}
