/**
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.math.BigDecimal;
import io.swagger.client.model.Error;
import io.swagger.client.model.Withdraw;
import io.swagger.client.model.WithdrawChance;
import io.swagger.client.model.WithdrawCoin;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class WithdrawApi {
  String basePath = "https://api.upbit.com/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * 출금 가능 정보
  * ## 해당 통화의 가능한 출금 정보를 확인한다. 
   * @param currency Currency Symbol 
   * @return WithdrawChance
  */
  public WithdrawChance withdrawChance (String currency) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'currency' is set
    if (currency == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'currency' when calling withdrawChance",
        new ApiException(400, "Missing the required parameter 'currency' when calling withdrawChance"));
    }

    // create path and map variables
    String path = "/withdraws/chance";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "currency", currency));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Bearer" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (WithdrawChance) ApiInvoker.deserialize(localVarResponse, "", WithdrawChance.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 출금 가능 정보
   * ## 해당 통화의 가능한 출금 정보를 확인한다. 
   * @param currency Currency Symbol 
  */
  public void withdrawChance (String currency, final Response.Listener<WithdrawChance> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'currency' is set
    if (currency == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'currency' when calling withdrawChance",
        new ApiException(400, "Missing the required parameter 'currency' when calling withdrawChance"));
    }

    // create path and map variables
    String path = "/withdraws/chance".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "currency", currency));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Bearer" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((WithdrawChance) ApiInvoker.deserialize(localVarResponse,  "", WithdrawChance.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 코인 출금하기
  * ## 코인 출금을 요청한다.  **NOTE**: 바로출금 이용 시 유의사항  업비트 회원의 주소가 아닌 주소로 바로출금을 요청하는 경우, 출금이 정상적으로 수행되지 않습니다. 반드시 주소를 확인 후 출금을 진행하시기 바랍니다. 
   * @param currency Currency 코드 
   * @param amount 출금 수량 
   * @param address 출금 가능 주소에 등록된 출금 주소 
   * @param secondaryAddress 2차 출금 주소 (필요한 코인에 한해서) 
   * @param transactionType 출금 유형 - default : 일반출금 - internal : 바로출금 
   * @return WithdrawCoin
  */
  public WithdrawCoin withdrawCoin (String currency, String amount, String address, String secondaryAddress, String transactionType) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'currency' is set
    if (currency == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'currency' when calling withdrawCoin",
        new ApiException(400, "Missing the required parameter 'currency' when calling withdrawCoin"));
    }
    // verify the required parameter 'amount' is set
    if (amount == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'amount' when calling withdrawCoin",
        new ApiException(400, "Missing the required parameter 'amount' when calling withdrawCoin"));
    }
    // verify the required parameter 'address' is set
    if (address == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'address' when calling withdrawCoin",
        new ApiException(400, "Missing the required parameter 'address' when calling withdrawCoin"));
    }

    // create path and map variables
    String path = "/withdraws/coin";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (currency != null) {
        localVarBuilder.addTextBody("currency", ApiInvoker.parameterToString(currency), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (amount != null) {
        localVarBuilder.addTextBody("amount", ApiInvoker.parameterToString(amount), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (address != null) {
        localVarBuilder.addTextBody("address", ApiInvoker.parameterToString(address), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (secondaryAddress != null) {
        localVarBuilder.addTextBody("secondary_address", ApiInvoker.parameterToString(secondaryAddress), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (transactionType != null) {
        localVarBuilder.addTextBody("transaction_type", ApiInvoker.parameterToString(transactionType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("currency", ApiInvoker.parameterToString(currency));
      formParams.put("amount", ApiInvoker.parameterToString(amount));
      formParams.put("address", ApiInvoker.parameterToString(address));
      formParams.put("secondary_address", ApiInvoker.parameterToString(secondaryAddress));
      formParams.put("transaction_type", ApiInvoker.parameterToString(transactionType));
    }

    String[] authNames = new String[] { "Bearer" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (WithdrawCoin) ApiInvoker.deserialize(localVarResponse, "", WithdrawCoin.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 코인 출금하기
   * ## 코인 출금을 요청한다.  **NOTE**: 바로출금 이용 시 유의사항  업비트 회원의 주소가 아닌 주소로 바로출금을 요청하는 경우, 출금이 정상적으로 수행되지 않습니다. 반드시 주소를 확인 후 출금을 진행하시기 바랍니다. 
   * @param currency Currency 코드    * @param amount 출금 수량    * @param address 출금 가능 주소에 등록된 출금 주소    * @param secondaryAddress 2차 출금 주소 (필요한 코인에 한해서)    * @param transactionType 출금 유형 - default : 일반출금 - internal : 바로출금 
  */
  public void withdrawCoin (String currency, String amount, String address, String secondaryAddress, String transactionType, final Response.Listener<WithdrawCoin> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'currency' is set
    if (currency == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'currency' when calling withdrawCoin",
        new ApiException(400, "Missing the required parameter 'currency' when calling withdrawCoin"));
    }
    // verify the required parameter 'amount' is set
    if (amount == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'amount' when calling withdrawCoin",
        new ApiException(400, "Missing the required parameter 'amount' when calling withdrawCoin"));
    }
    // verify the required parameter 'address' is set
    if (address == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'address' when calling withdrawCoin",
        new ApiException(400, "Missing the required parameter 'address' when calling withdrawCoin"));
    }

    // create path and map variables
    String path = "/withdraws/coin".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (currency != null) {
        localVarBuilder.addTextBody("currency", ApiInvoker.parameterToString(currency), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (amount != null) {
        localVarBuilder.addTextBody("amount", ApiInvoker.parameterToString(amount), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (address != null) {
        localVarBuilder.addTextBody("address", ApiInvoker.parameterToString(address), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (secondaryAddress != null) {
        localVarBuilder.addTextBody("secondary_address", ApiInvoker.parameterToString(secondaryAddress), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (transactionType != null) {
        localVarBuilder.addTextBody("transaction_type", ApiInvoker.parameterToString(transactionType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("currency", ApiInvoker.parameterToString(currency));
formParams.put("amount", ApiInvoker.parameterToString(amount));
formParams.put("address", ApiInvoker.parameterToString(address));
formParams.put("secondary_address", ApiInvoker.parameterToString(secondaryAddress));
formParams.put("transaction_type", ApiInvoker.parameterToString(transactionType));
    }

    String[] authNames = new String[] { "Bearer" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((WithdrawCoin) ApiInvoker.deserialize(localVarResponse,  "", WithdrawCoin.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 개별 출금 조회
  * ## 출금 UUID를 통해 개별 출금 정보를 조회한다. 
   * @param uuid 출금 UUID 
   * @param txid 출금 TXID 
   * @param currency Currency 코드 
   * @return Withdraw
  */
  public Withdraw withdrawInfo (String uuid, String txid, String currency) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/withdraw";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "uuid", uuid));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "txid", txid));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "currency", currency));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Bearer" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Withdraw) ApiInvoker.deserialize(localVarResponse, "", Withdraw.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 개별 출금 조회
   * ## 출금 UUID를 통해 개별 출금 정보를 조회한다. 
   * @param uuid 출금 UUID    * @param txid 출금 TXID    * @param currency Currency 코드 
  */
  public void withdrawInfo (String uuid, String txid, String currency, final Response.Listener<Withdraw> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/withdraw".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "uuid", uuid));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "txid", txid));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "currency", currency));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Bearer" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Withdraw) ApiInvoker.deserialize(localVarResponse,  "", Withdraw.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 출금 리스트 조회
  * ## 출금 리스트를 조회한다. 
   * @param currency Currency 코드 
   * @param state 출금 상태 - submitting : 처리 중 - submitted : 처리 완료 - almost_accepted : 출금대기중 - rejected : 거부 - accepted : 승인됨 - processing : 처리 중 - done : 완료 - canceled : 취소됨 
   * @param uuids 출금 UUID의 목록 
   * @param txids 출금 TXID의 목록 
   * @param limit 개수 제한 (default: 100, max: 100) 
   * @param page 페이지 수, default: 1 
   * @param orderBy 정렬 방식 - asc : 오름차순 - desc : 내림차순 (default) 
   * @return List<Withdraw>
  */
  public List<Withdraw> withdrawInfoAll (String currency, String state, List<String> uuids, List<String> txids, BigDecimal limit, BigDecimal page, String orderBy) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/withdraws";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "currency", currency));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "state", state));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "uuids", uuids));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "txids", txids));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_by", orderBy));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Bearer" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<Withdraw>) ApiInvoker.deserialize(localVarResponse, "array", Withdraw.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 출금 리스트 조회
   * ## 출금 리스트를 조회한다. 
   * @param currency Currency 코드    * @param state 출금 상태 - submitting : 처리 중 - submitted : 처리 완료 - almost_accepted : 출금대기중 - rejected : 거부 - accepted : 승인됨 - processing : 처리 중 - done : 완료 - canceled : 취소됨    * @param uuids 출금 UUID의 목록    * @param txids 출금 TXID의 목록    * @param limit 개수 제한 (default: 100, max: 100)    * @param page 페이지 수, default: 1    * @param orderBy 정렬 방식 - asc : 오름차순 - desc : 내림차순 (default) 
  */
  public void withdrawInfoAll (String currency, String state, List<String> uuids, List<String> txids, BigDecimal limit, BigDecimal page, String orderBy, final Response.Listener<List<Withdraw>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/withdraws".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "currency", currency));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "state", state));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "uuids", uuids));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "txids", txids));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_by", orderBy));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Bearer" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Withdraw>) ApiInvoker.deserialize(localVarResponse,  "array", Withdraw.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 원화 출금하기
  * ## 원화 출금을 요청한다. 등록된 출금 계좌로 출금된다. 
   * @param amount 출금 원화 수량 
   * @return Withdraw
  */
  public Withdraw withdrawKrw (String amount) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'amount' is set
    if (amount == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'amount' when calling withdrawKrw",
        new ApiException(400, "Missing the required parameter 'amount' when calling withdrawKrw"));
    }

    // create path and map variables
    String path = "/withdraws/krw";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (amount != null) {
        localVarBuilder.addTextBody("amount", ApiInvoker.parameterToString(amount), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("amount", ApiInvoker.parameterToString(amount));
    }

    String[] authNames = new String[] { "Bearer" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Withdraw) ApiInvoker.deserialize(localVarResponse, "", Withdraw.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 원화 출금하기
   * ## 원화 출금을 요청한다. 등록된 출금 계좌로 출금된다. 
   * @param amount 출금 원화 수량 
  */
  public void withdrawKrw (String amount, final Response.Listener<Withdraw> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'amount' is set
    if (amount == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'amount' when calling withdrawKrw",
        new ApiException(400, "Missing the required parameter 'amount' when calling withdrawKrw"));
    }

    // create path and map variables
    String path = "/withdraws/krw".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (amount != null) {
        localVarBuilder.addTextBody("amount", ApiInvoker.parameterToString(amount), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("amount", ApiInvoker.parameterToString(amount));
    }

    String[] authNames = new String[] { "Bearer" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Withdraw) ApiInvoker.deserialize(localVarResponse,  "", Withdraw.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
