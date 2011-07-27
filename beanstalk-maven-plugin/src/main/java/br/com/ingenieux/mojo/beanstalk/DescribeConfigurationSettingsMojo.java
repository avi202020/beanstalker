package br.com.ingenieux.mojo.beanstalk;

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

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest;

/**
 * Returns the Configuration Settings
 * 
 * See the <a href=
 * "http://docs.amazonwebservices.com/elasticbeanstalk/latest/api/API_DescribeConfigurationSettings.html"
 * >DescribeConfigurationSettings API</a> call.
 * 
 * @goal describe-configuration-settings
 */
public class DescribeConfigurationSettingsMojo extends AbstractBeanstalkMojo {
	/**
	 * Beanstalk Application Name
	 * 
	 * @parameter expression="${beanstalk.applicationName}"
	 *            default-value="${project.artifactId}"
	 * @required
	 */
	String applicationName;

	/**
	 * Environment Name
	 * 
	 * @parameter expression="${beanstalk.environmentName}"
	 *            default-value="default"
	 */
	String environmentName;

	/**
	 * Template Name
	 * 
	 * @parameter expression="${beanstalk.templateName}"
	 */
	String templateName;

	protected Object executeInternal() throws MojoExecutionException,
	    MojoFailureException {
		DescribeConfigurationSettingsRequest req = new DescribeConfigurationSettingsRequest()//
		    .withApplicationName(this.applicationName)//
		    .withEnvironmentName(environmentName)//
		    .withTemplateName(templateName)//
		;

		return service.describeConfigurationSettings(req);
	}
}
