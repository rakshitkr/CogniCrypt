/**
 * Copyright 2015 Technische Universität Darmstadt
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Ram
 *
 */

package crossing.e1.configurator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import crossing.e1.configurator.utilities.Utilities;

/**
 * An utility class which reads the configuration file .
 * 
 * @author Ram
 *
 */
public class ReadConfig {

	private String path = "src/main/resources/config.properties";
	private Properties prop;

	public ReadConfig() {
		try {
			prop = new Properties();
			String configFile = Utilities.getAbsolutePath(path);
			prop.load(new FileInputStream(configFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getValueFromConfig(String value) {
		return Utilities.getAbsolutePath(prop.getProperty(value));
	}
}