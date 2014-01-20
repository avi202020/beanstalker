package br.com.ingenieux.mojo.beanstalk.cmd.env.update;

import com.amazonaws.services.elasticbeanstalk.model.ConfigurationOptionSetting;

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class UpdateEnvironmentContext {
	String environmentName;

	String environmentId;

	String versionLabel;

	String environmentDescription;

	ConfigurationOptionSetting[] optionSettings = new ConfigurationOptionSetting[0];

	String templateName;

	boolean useLatestVersionLabel = true;

	public boolean isUseLatestVersionLabel() {
		return useLatestVersionLabel;
	}

	public void setUseLatestVersionLabel(boolean useLatestVersionLabel) {
		this.useLatestVersionLabel = useLatestVersionLabel;
	}

	String latestVersionLabel;

	public String getLatestVersionLabel() {
		return latestVersionLabel;
	}

	public void setLatestVersionLabel(String latestVersionLabel) {
		this.latestVersionLabel = latestVersionLabel;
	}

	/**
	 * @return the environmentName
	 */
	public String getEnvironmentName() {
		return environmentName;
	}

	/**
	 * @return the environmentId
	 */
	public String getEnvironmentId() {
		return environmentId;
	}

	/**
	 * @return the versionLabel
	 */
	public String getVersionLabel() {
		return versionLabel;
	}

	/**
	 * @return the environmentDescription
	 */
	public String getEnvironmentDescription() {
		return environmentDescription;
	}

	/**
	 * @return the optionSettings
	 */
	public ConfigurationOptionSetting[] getOptionSettings() {
		return optionSettings;
	}

	/**
	 * @return the templateName
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * @param environmentName
	 *            the environmentName to set
	 */
	public void setEnvironmentName(String environmentName) {
		this.environmentName = environmentName;
	}

	/**
	 * @param environmentId
	 *            the environmentId to set
	 */
	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	/**
	 * @param versionLabel
	 *            the versionLabel to set
	 */
	public void setVersionLabel(String versionLabel) {
		this.versionLabel = versionLabel;
	}

	/**
	 * @param environmentDescription
	 *            the environmentDescription to set
	 */
	public void setEnvironmentDescription(String environmentDescription) {
		this.environmentDescription = environmentDescription;
	}

	/**
	 * @param optionSettings
	 *            the optionSettings to set
	 */
	public void setOptionSettings(ConfigurationOptionSetting[] optionSettings) {
		if (null != optionSettings)
			this.optionSettings = optionSettings;
	}

	/**
	 * @param templateName
	 *            the templateName to set
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

    String environmentTierName;

    public String getEnvironmentTierName() {
        return environmentTierName;
    }

    public void setEnvironmentTierName(String environmentTierName) {
        this.environmentTierName = environmentTierName;
    }
}
