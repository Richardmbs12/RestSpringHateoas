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
 * AccountResource
 */

public class AccountResource extends RepresentationModel<AccountResource>   {
  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("accountName")
  private String accountName;

  @JsonProperty("accountType")
  private String accountType;

  public AccountResource accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountResource accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   * @return accountName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public AccountResource accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @ApiModelProperty(example = "Current account, Savings account, Transmission account", required = true, value = "")
  @NotNull


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountResource accountResource = (AccountResource) o;
    return Objects.equals(this.accountNumber, accountResource.accountNumber) &&
        Objects.equals(this.accountName, accountResource.accountName) &&
        Objects.equals(this.accountType, accountResource.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountName, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountResource {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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

