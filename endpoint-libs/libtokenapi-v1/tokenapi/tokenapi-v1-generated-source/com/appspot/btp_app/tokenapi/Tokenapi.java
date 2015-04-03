/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-04-01 at 16:52:18 UTC 
 * Modify at your own risk.
 */

package com.appspot.btp_app.tokenapi;

/**
 * Service definition for Tokenapi (v1).
 *
 * <p>
 * tokenapi
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link TokenapiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Tokenapi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the tokenapi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://btp-app.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "tokenapi/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Tokenapi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Tokenapi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getToken".
   *
   * This request holds the parameters needed by the tokenapi server.  After setting any optional
   * parameters, call the {@link GetToken#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetToken getToken(java.lang.String id) throws java.io.IOException {
    GetToken result = new GetToken(id);
    initialize(result);
    return result;
  }

  public class GetToken extends TokenapiRequest<com.appspot.btp_app.tokenapi.model.Token> {

    private static final String REST_PATH = "token/{id}";

    /**
     * Create a request for the method "getToken".
     *
     * This request holds the parameters needed by the the tokenapi server.  After setting any
     * optional parameters, call the {@link GetToken#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetToken#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetToken(java.lang.String id) {
      super(Tokenapi.this, "GET", REST_PATH, null, com.appspot.btp_app.tokenapi.model.Token.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetToken setAlt(java.lang.String alt) {
      return (GetToken) super.setAlt(alt);
    }

    @Override
    public GetToken setFields(java.lang.String fields) {
      return (GetToken) super.setFields(fields);
    }

    @Override
    public GetToken setKey(java.lang.String key) {
      return (GetToken) super.setKey(key);
    }

    @Override
    public GetToken setOauthToken(java.lang.String oauthToken) {
      return (GetToken) super.setOauthToken(oauthToken);
    }

    @Override
    public GetToken setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetToken) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetToken setQuotaUser(java.lang.String quotaUser) {
      return (GetToken) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetToken setUserIp(java.lang.String userIp) {
      return (GetToken) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public GetToken setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public GetToken set(String parameterName, Object value) {
      return (GetToken) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertToken".
   *
   * This request holds the parameters needed by the tokenapi server.  After setting any optional
   * parameters, call the {@link InsertToken#execute()} method to invoke the remote operation.
   *
   * @param userId
   * @return the request
   */
  public InsertToken insertToken(java.lang.String userId) throws java.io.IOException {
    InsertToken result = new InsertToken(userId);
    initialize(result);
    return result;
  }

  public class InsertToken extends TokenapiRequest<com.appspot.btp_app.tokenapi.model.Token> {

    private static final String REST_PATH = "token/{userId}";

    /**
     * Create a request for the method "insertToken".
     *
     * This request holds the parameters needed by the the tokenapi server.  After setting any
     * optional parameters, call the {@link InsertToken#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertToken#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param userId
     * @since 1.13
     */
    protected InsertToken(java.lang.String userId) {
      super(Tokenapi.this, "POST", REST_PATH, null, com.appspot.btp_app.tokenapi.model.Token.class);
      this.userId = com.google.api.client.util.Preconditions.checkNotNull(userId, "Required parameter userId must be specified.");
    }

    @Override
    public InsertToken setAlt(java.lang.String alt) {
      return (InsertToken) super.setAlt(alt);
    }

    @Override
    public InsertToken setFields(java.lang.String fields) {
      return (InsertToken) super.setFields(fields);
    }

    @Override
    public InsertToken setKey(java.lang.String key) {
      return (InsertToken) super.setKey(key);
    }

    @Override
    public InsertToken setOauthToken(java.lang.String oauthToken) {
      return (InsertToken) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertToken setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertToken) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertToken setQuotaUser(java.lang.String quotaUser) {
      return (InsertToken) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertToken setUserIp(java.lang.String userIp) {
      return (InsertToken) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String userId;

    /**

     */
    public java.lang.String getUserId() {
      return userId;
    }

    public InsertToken setUserId(java.lang.String userId) {
      this.userId = userId;
      return this;
    }

    @Override
    public InsertToken set(String parameterName, Object value) {
      return (InsertToken) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeToken".
   *
   * This request holds the parameters needed by the tokenapi server.  After setting any optional
   * parameters, call the {@link RemoveToken#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveToken removeToken(java.lang.String id) throws java.io.IOException {
    RemoveToken result = new RemoveToken(id);
    initialize(result);
    return result;
  }

  public class RemoveToken extends TokenapiRequest<Void> {

    private static final String REST_PATH = "token/{id}";

    /**
     * Create a request for the method "removeToken".
     *
     * This request holds the parameters needed by the the tokenapi server.  After setting any
     * optional parameters, call the {@link RemoveToken#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveToken#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveToken(java.lang.String id) {
      super(Tokenapi.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveToken setAlt(java.lang.String alt) {
      return (RemoveToken) super.setAlt(alt);
    }

    @Override
    public RemoveToken setFields(java.lang.String fields) {
      return (RemoveToken) super.setFields(fields);
    }

    @Override
    public RemoveToken setKey(java.lang.String key) {
      return (RemoveToken) super.setKey(key);
    }

    @Override
    public RemoveToken setOauthToken(java.lang.String oauthToken) {
      return (RemoveToken) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveToken setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveToken) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveToken setQuotaUser(java.lang.String quotaUser) {
      return (RemoveToken) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveToken setUserIp(java.lang.String userIp) {
      return (RemoveToken) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public RemoveToken setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveToken set(String parameterName, Object value) {
      return (RemoveToken) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "sendEmail".
   *
   * This request holds the parameters needed by the tokenapi server.  After setting any optional
   * parameters, call the {@link SendEmail#execute()} method to invoke the remote operation.
   *
   * @param email
   * @param token
   * @return the request
   */
  public SendEmail sendEmail(java.lang.String email, java.lang.String token) throws java.io.IOException {
    SendEmail result = new SendEmail(email, token);
    initialize(result);
    return result;
  }

  public class SendEmail extends TokenapiRequest<Void> {

    private static final String REST_PATH = "sendEmail/{email}/{token}";

    /**
     * Create a request for the method "sendEmail".
     *
     * This request holds the parameters needed by the the tokenapi server.  After setting any
     * optional parameters, call the {@link SendEmail#execute()} method to invoke the remote
     * operation. <p> {@link
     * SendEmail#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param email
     * @param token
     * @since 1.13
     */
    protected SendEmail(java.lang.String email, java.lang.String token) {
      super(Tokenapi.this, "POST", REST_PATH, null, Void.class);
      this.email = com.google.api.client.util.Preconditions.checkNotNull(email, "Required parameter email must be specified.");
      this.token = com.google.api.client.util.Preconditions.checkNotNull(token, "Required parameter token must be specified.");
    }

    @Override
    public SendEmail setAlt(java.lang.String alt) {
      return (SendEmail) super.setAlt(alt);
    }

    @Override
    public SendEmail setFields(java.lang.String fields) {
      return (SendEmail) super.setFields(fields);
    }

    @Override
    public SendEmail setKey(java.lang.String key) {
      return (SendEmail) super.setKey(key);
    }

    @Override
    public SendEmail setOauthToken(java.lang.String oauthToken) {
      return (SendEmail) super.setOauthToken(oauthToken);
    }

    @Override
    public SendEmail setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (SendEmail) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public SendEmail setQuotaUser(java.lang.String quotaUser) {
      return (SendEmail) super.setQuotaUser(quotaUser);
    }

    @Override
    public SendEmail setUserIp(java.lang.String userIp) {
      return (SendEmail) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String email;

    /**

     */
    public java.lang.String getEmail() {
      return email;
    }

    public SendEmail setEmail(java.lang.String email) {
      this.email = email;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String token;

    /**

     */
    public java.lang.String getToken() {
      return token;
    }

    public SendEmail setToken(java.lang.String token) {
      this.token = token;
      return this;
    }

    @Override
    public SendEmail set(String parameterName, Object value) {
      return (SendEmail) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Tokenapi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Tokenapi}. */
    @Override
    public Tokenapi build() {
      return new Tokenapi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link TokenapiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setTokenapiRequestInitializer(
        TokenapiRequestInitializer tokenapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(tokenapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
