package Utils;

import java.util.Properties;

public class ConfigUtils {

    private Properties properties;
    private static ConfigUtils configUtils;
    public ConfigUtils(){
        properties = PropertyUtils.loadproperties("src/main/java/Config/playit.properties");
    }

    public static ConfigUtils getInstance(){
        if(configUtils == null){
            configUtils= new ConfigUtils();

        }
        return configUtils;
    }
    public String getPhoneNumber() {
        String prop = properties.getProperty("PhoneNumber");
        if(prop != null ) return prop;
        throw new RuntimeException("couldn't find Phone Number");

    }

    public String getBaseUrl() {
        String prop = properties.getProperty("baseUrl");
        if(prop != null ) return prop;
        throw new RuntimeException("couldn't find base uel");

    }
    public String getEmail() {
        String prop = properties.getProperty("email");
        if(prop != null ) return prop;
        throw new RuntimeException("couldn't find email");


    }

    public String getPassword() {
        String prop = properties.getProperty("password");
        if(prop != null ) return prop;
        throw new RuntimeException("couldn't find password");

    }
    public String getVerificationCode() {
        String prop = properties.getProperty("VerificationCode");
        if(prop != null ) return prop;
        throw new RuntimeException("couldn't find verification code");

    }










}
