/**
 * Copyright (c) 2016 Source Auditor Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
*/
package org.openchain.certification;

/**
 * Errors related to updating a survey
 * @author Gary O'Neall
 *
 */
public class UpdateSurveyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * @param arg0
	 */
	public UpdateSurveyException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public UpdateSurveyException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public UpdateSurveyException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public UpdateSurveyException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
