/*
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Ask;
import io.swagger.client.model.Bid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 마켓에 대한 정보
 */
@ApiModel(description = "마켓에 대한 정보")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-25T00:42:40.509Z")
public class Market {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("order_types")
  private List<String> orderTypes = null;

  @SerializedName("order_sides")
  private List<String> orderSides = null;

  @SerializedName("bid")
  private Bid bid = null;

  @SerializedName("ask")
  private Ask ask = null;

  @SerializedName("max_total")
  private String maxTotal = null;

  @SerializedName("state")
  private String state = null;

  public Market id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 마켓 ID
   * @return id
  **/
  @ApiModelProperty(example = "KRW-BTC", value = "마켓 ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Market name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 마켓 이름
   * @return name
  **/
  @ApiModelProperty(example = "BTC/KRW", value = "마켓 이름")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Market orderTypes(List<String> orderTypes) {
    this.orderTypes = orderTypes;
    return this;
  }

  public Market addOrderTypesItem(String orderTypesItem) {
    if (this.orderTypes == null) {
      this.orderTypes = new ArrayList<String>();
    }
    this.orderTypes.add(orderTypesItem);
    return this;
  }

   /**
   * 지원 주문 방식
   * @return orderTypes
  **/
  @ApiModelProperty(example = "[\"limit\"]", value = "지원 주문 방식")
  public List<String> getOrderTypes() {
    return orderTypes;
  }

  public void setOrderTypes(List<String> orderTypes) {
    this.orderTypes = orderTypes;
  }

  public Market orderSides(List<String> orderSides) {
    this.orderSides = orderSides;
    return this;
  }

  public Market addOrderSidesItem(String orderSidesItem) {
    if (this.orderSides == null) {
      this.orderSides = new ArrayList<String>();
    }
    this.orderSides.add(orderSidesItem);
    return this;
  }

   /**
   * 지원 주문 종류
   * @return orderSides
  **/
  @ApiModelProperty(example = "[\"ask\",\"bid\"]", value = "지원 주문 종류")
  public List<String> getOrderSides() {
    return orderSides;
  }

  public void setOrderSides(List<String> orderSides) {
    this.orderSides = orderSides;
  }

  public Market bid(Bid bid) {
    this.bid = bid;
    return this;
  }

   /**
   * Get bid
   * @return bid
  **/
  @ApiModelProperty(value = "")
  public Bid getBid() {
    return bid;
  }

  public void setBid(Bid bid) {
    this.bid = bid;
  }

  public Market ask(Ask ask) {
    this.ask = ask;
    return this;
  }

   /**
   * Get ask
   * @return ask
  **/
  @ApiModelProperty(value = "")
  public Ask getAsk() {
    return ask;
  }

  public void setAsk(Ask ask) {
    this.ask = ask;
  }

  public Market maxTotal(String maxTotal) {
    this.maxTotal = maxTotal;
    return this;
  }

   /**
   * 최대 매도/매수 금액
   * @return maxTotal
  **/
  @ApiModelProperty(example = "100000000", value = "최대 매도/매수 금액")
  public String getMaxTotal() {
    return maxTotal;
  }

  public void setMaxTotal(String maxTotal) {
    this.maxTotal = maxTotal;
  }

  public Market state(String state) {
    this.state = state;
    return this;
  }

   /**
   * 마켓 운영 상태
   * @return state
  **/
  @ApiModelProperty(example = "activate", value = "마켓 운영 상태")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Market market = (Market) o;
    return Objects.equals(this.id, market.id) &&
        Objects.equals(this.name, market.name) &&
        Objects.equals(this.orderTypes, market.orderTypes) &&
        Objects.equals(this.orderSides, market.orderSides) &&
        Objects.equals(this.bid, market.bid) &&
        Objects.equals(this.ask, market.ask) &&
        Objects.equals(this.maxTotal, market.maxTotal) &&
        Objects.equals(this.state, market.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, orderTypes, orderSides, bid, ask, maxTotal, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Market {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderTypes: ").append(toIndentedString(orderTypes)).append("\n");
    sb.append("    orderSides: ").append(toIndentedString(orderSides)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    maxTotal: ").append(toIndentedString(maxTotal)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
