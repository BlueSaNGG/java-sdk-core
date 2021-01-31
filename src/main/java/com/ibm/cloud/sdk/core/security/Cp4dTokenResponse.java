/**
 * (C) Copyright IBM Corp. 2019, 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.sdk.core.security;

/**
 * This class models a response received from the CP4D "POST /v1/authorize" operation.
 */
public class Cp4dTokenResponse implements TokenServerResponse {

  private String token;
  private String _messageCode_;
  private String message;

  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }
  public String get_messageCode_() {
    return _messageCode_;
  }
  public void set_messageCode_(String messageCode) {
    this._messageCode_ = messageCode;
  }
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

}
