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

package io.swagger.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * 화폐 정보
 **/
@ApiModel(description = "화폐 정보")
public class Currency {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("withdraw_fee")
  private String withdrawFee = null;
  @SerializedName("is_coin")
  private Boolean isCoin = null;
  @SerializedName("wallet_state")
  private String walletState = null;
  @SerializedName("wallet_support")
  private List<String> walletSupport = null;

  /**
   * 화폐를 의미하는 영문 대문자 코드
   **/
  @ApiModelProperty(value = "화폐를 의미하는 영문 대문자 코드")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * 해당 화폐의 출금 수수료
   **/
  @ApiModelProperty(value = "해당 화폐의 출금 수수료")
  public String getWithdrawFee() {
    return withdrawFee;
  }
  public void setWithdrawFee(String withdrawFee) {
    this.withdrawFee = withdrawFee;
  }

  /**
   * 화폐의 코인 여부
   **/
  @ApiModelProperty(value = "화폐의 코인 여부")
  public Boolean getIsCoin() {
    return isCoin;
  }
  public void setIsCoin(Boolean isCoin) {
    this.isCoin = isCoin;
  }

  /**
   * 해당 화폐의 지갑 상태
   **/
  @ApiModelProperty(value = "해당 화폐의 지갑 상태")
  public String getWalletState() {
    return walletState;
  }
  public void setWalletState(String walletState) {
    this.walletState = walletState;
  }

  /**
   * 해당 화폐가 지원하는 입출금 정보
   **/
  @ApiModelProperty(value = "해당 화폐가 지원하는 입출금 정보")
  public List<String> getWalletSupport() {
    return walletSupport;
  }
  public void setWalletSupport(List<String> walletSupport) {
    this.walletSupport = walletSupport;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currency currency = (Currency) o;
    return (this.code == null ? currency.code == null : this.code.equals(currency.code)) &&
        (this.withdrawFee == null ? currency.withdrawFee == null : this.withdrawFee.equals(currency.withdrawFee)) &&
        (this.isCoin == null ? currency.isCoin == null : this.isCoin.equals(currency.isCoin)) &&
        (this.walletState == null ? currency.walletState == null : this.walletState.equals(currency.walletState)) &&
        (this.walletSupport == null ? currency.walletSupport == null : this.walletSupport.equals(currency.walletSupport));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.withdrawFee == null ? 0: this.withdrawFee.hashCode());
    result = 31 * result + (this.isCoin == null ? 0: this.isCoin.hashCode());
    result = 31 * result + (this.walletState == null ? 0: this.walletState.hashCode());
    result = 31 * result + (this.walletSupport == null ? 0: this.walletSupport.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  withdrawFee: ").append(withdrawFee).append("\n");
    sb.append("  isCoin: ").append(isCoin).append("\n");
    sb.append("  walletState: ").append(walletState).append("\n");
    sb.append("  walletSupport: ").append(walletSupport).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
