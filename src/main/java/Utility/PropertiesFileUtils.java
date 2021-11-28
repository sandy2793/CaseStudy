package Utility;

import static Utility.CommonUtils.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * This class contains methods related to get & set data in properties file.
 * @author Sandesh Lahoti
 * @since 11-Nov-2021
 */

public class PropertiesFileUtils {
	File file;
    InputStream fis;
    OutputStream fos;
    Properties pf;
	String keywordValue = null;
	
	public PropertiesFileUtils(String proertiesFilePath) {
		file = new File(proertiesFilePath);
	}
	
	/**
     * To get the config key from properties files
     * @author Sandesh Lahoti
     * @since 11-Nov-2021
     * @param {@link String} keywordName
     * @return {@link String} keywordValue
     */
    public String getConfigKey(String keywordName) {
		try {
			fis = new FileInputStream(file);
			pf = new Properties();
			pf.load(fis);
			keywordValue = pf.getProperty(keywordName);
		} catch (Exception e) {
			keywordValue = null;
			printException(e, "get congif key fail");
		}
        return keywordValue;
	}
	
    /**
     * @author Sandesh Lahoti
     * @since 11-Nov-2021
     * @param {@link String} keywordName
     * @param {@link String} setValue
     */
	public void setConfigKey(String keywordName, String setValue) {
		try {
			fos = new FileOutputStream(file);
			pf = new Properties();
			pf.setProperty(keywordName, setValue);
			pf.store(fos, "");
		} catch (Exception e) {
			printException(e, "set congif key fail");
		}
	}
	
}
