package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * The master record for an item of correspondence
 */
public class CorrespondenceResponse   {
  private String correspondenceServiceSessionReference = null;

  private String correspondenceServiceConfigurationOrSetUp = null;


  /**
   * example: JIDH7DEA general-info: bank reference - will be used to match responses `status: Provisionally Registered` bian-reference: Self 
   * @return correspondenceServiceSessionReference
  **/

  public String getCorrespondenceServiceSessionReference() {
    return correspondenceServiceSessionReference;
  }

  public void setCorrespondenceServiceSessionReference(String correspondenceServiceSessionReference) {
    this.correspondenceServiceSessionReference = correspondenceServiceSessionReference;
  }


  /**
   * example: Configuration 1 general-info: service configuration or set-up `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondenceServiceConfigurationOrSetUp
  **/

  public String getCorrespondenceServiceConfigurationOrSetUp() {
    return correspondenceServiceConfigurationOrSetUp;
  }

  public void setCorrespondenceServiceConfigurationOrSetUp(String correspondenceServiceConfigurationOrSetUp) {
    this.correspondenceServiceConfigurationOrSetUp = correspondenceServiceConfigurationOrSetUp;
  }


}

