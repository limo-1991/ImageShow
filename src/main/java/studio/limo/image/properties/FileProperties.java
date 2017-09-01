package studio.limo.image.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class FileProperties {

    public static Properties prop = new Properties();
    /**
     * load Properties Files
     * <p>
     * @param propertiesFileName
     */
    public static void loadProperties(String propertiesFileName) throws FileNotFoundException, IOException {
        FileInputStream fr = new FileInputStream(propertiesFileName);
        prop.load(fr);
        fr.close() ;
    }

    /**
     * to find key value
     * <p>
     * @param key
     * @return  value of Key
     */
    public static String getProperty(String key) {
        try {
            return new String(prop.getProperty(key).getBytes("latin1"), "gb2312");
        } catch (NullPointerException e) {
            return "";
        }
        catch (UnsupportedEncodingException e) {
            return "";
        }
    }
}
