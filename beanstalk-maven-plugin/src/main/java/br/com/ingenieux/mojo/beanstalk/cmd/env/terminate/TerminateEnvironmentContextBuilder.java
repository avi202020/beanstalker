// CHECKSTYLE:OFF
/**
 * Source code generated by Fluent Builders Generator
 * Do not modify this file
 * See generator home page at: http://code.google.com/p/fluent-builders-generator-eclipse-plugin/
 */

package br.com.ingenieux.mojo.beanstalk.cmd.env.terminate;

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

public class TerminateEnvironmentContextBuilder extends
    TerminateEnvironmentContextBuilderBase<TerminateEnvironmentContextBuilder> {
	public static TerminateEnvironmentContextBuilder terminateEnvironmentContext() {
		return new TerminateEnvironmentContextBuilder();
	}

	public TerminateEnvironmentContextBuilder() {
		super(new TerminateEnvironmentContext());
	}

	public TerminateEnvironmentContext build() {
		return getInstance();
	}
}

class TerminateEnvironmentContextBuilderBase<GeneratorT extends TerminateEnvironmentContextBuilderBase<GeneratorT>> {
	private TerminateEnvironmentContext instance;

	protected TerminateEnvironmentContextBuilderBase(
	    TerminateEnvironmentContext aInstance) {
		instance = aInstance;
	}

	protected TerminateEnvironmentContext getInstance() {
		return instance;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withEnvironmentId(String aValue) {
		instance.setEnvironmentId(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withEnvironmentName(String aValue) {
		instance.setEnvironmentName(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withTerminateResources(boolean aValue) {
		instance.setTerminateResources(aValue);

		return (GeneratorT) this;
	}
}