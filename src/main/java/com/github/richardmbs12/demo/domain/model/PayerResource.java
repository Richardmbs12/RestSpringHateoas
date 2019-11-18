package com.github.richardmbs12.demo.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.hateoas.RepresentationModel;

/**
 * PayerResource
 */

public class PayerResource extends RepresentationModel<PayerResource>   {
  @JsonProperty("payerId")
  private String payerId;

  @JsonProperty("payerName")
  private String payerName;

  public PayerResource payerId(String payerId) {
    this.payerId = payerId;
    return this;
  }

  /**
   * Get payerId
   * @return payerId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPayerId() {
    return payerId;
  }

  public void setPayerId(String payerId) {
    this.payerId = payerId;
  }

  public PayerResource payerName(String payerName) {
    this.payerName = payerName;
    return this;
  }

  /**
   * Get payerName
   * @return payerName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPayerName() {
    return payerName;
  }

  public void setPayerName(String payerName) {
    this.payerName = payerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayerResource payerResource = (PayerResource) o;
    return Objects.equals(this.payerId, payerResource.payerId) &&
        Objects.equals(this.payerName, payerResource.payerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerId, payerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayerResource {\n");
    
    sb.append("    payerId: ").append(toIndentedString(payerId)).append("\n");
    sb.append("    payerName: ").append(toIndentedString(payerName)).append("\n");
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

