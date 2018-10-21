package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * Batch or block mailing
 */
public class CorrespondenceBlockRequest   {
  private String blockCorrespondenceTaskRecord = null;

  private String correspondenceBlockMailingReference = null;

  private String correspondenceType = null;

  private String correspondenceTemplateReference = null;

  private String correspondenceTemplateRecord = null;

  private String correspondenceContent = null;

  private String correspondenceMediaOrChannel = null;

  private String correspondenceAddressee = null;

  private String customerReference = null;

  private String channelAccessPreferenceReference = null;

  private String channelAccessPreferenceProfile = null;

  private String channelAccessChannelOrDeviceType = null;

  private String channelAccessChannelOrDeviceTypePreference = null;

  private String employeeBusinessUnitReference = null;

  private String dateType = null;

  private String date = null;

  private String correspondenceState = null;


  /**
   * example: record general-info: used to track processig/state of block correspondence `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return blockCorrespondenceTaskRecord
  **/

  public String getBlockCorrespondenceTaskRecord() {
    return blockCorrespondenceTaskRecord;
  }

  public void setBlockCorrespondenceTaskRecord(String blockCorrespondenceTaskRecord) {
    this.blockCorrespondenceTaskRecord = blockCorrespondenceTaskRecord;
  }


  /**
   * example: MR63474 general-info: bank reference `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondenceBlockMailingReference
  **/

  public String getCorrespondenceBlockMailingReference() {
    return correspondenceBlockMailingReference;
  }

  public void setCorrespondenceBlockMailingReference(String correspondenceBlockMailingReference) {
    this.correspondenceBlockMailingReference = correspondenceBlockMailingReference;
  }


  /**
   * example: email general-info: Correspondence Type `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   | BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code 
   * @return correspondenceType
  **/

  public String getCorrespondenceType() {
    return correspondenceType;
  }

  public void setCorrespondenceType(String correspondenceType) {
    this.correspondenceType = correspondenceType;
  }


  /**
   * example: TR724525 general-info: if text is place in a standard template `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondenceTemplateReference
  **/

  public String getCorrespondenceTemplateReference() {
    return correspondenceTemplateReference;
  }

  public void setCorrespondenceTemplateReference(String correspondenceTemplateReference) {
    this.correspondenceTemplateReference = correspondenceTemplateReference;
  }


  /**
   * example: template 1 general-info: the template definition used in correspondence assembly `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondenceTemplateRecord
  **/

  public String getCorrespondenceTemplateRecord() {
    return correspondenceTemplateRecord;
  }

  public void setCorrespondenceTemplateRecord(String correspondenceTemplateRecord) {
    this.correspondenceTemplateRecord = correspondenceTemplateRecord;
  }


  /**
   * example: content general-info: message content - aligned to template as appropriate `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondenceContent
  **/

  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }


  /**
   * example: EMAIL general-info: defines the media and channel for delivery of the message `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondenceMediaOrChannel
  **/

  public String getCorrespondenceMediaOrChannel() {
    return correspondenceMediaOrChannel;
  }

  public void setCorrespondenceMediaOrChannel(String correspondenceMediaOrChannel) {
    this.correspondenceMediaOrChannel = correspondenceMediaOrChannel;
  }


  /**
   * example: test@test.com general-info: block of addresses to which message is to be delivered `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondenceAddressee
  **/

  public String getCorrespondenceAddressee() {
    return correspondenceAddressee;
  }

  public void setCorrespondenceAddressee(String correspondenceAddressee) {
    this.correspondenceAddressee = correspondenceAddressee;
  }


  /**
   * general-info: block messages sent to known entities `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * general-info: CAPR74645 `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return channelAccessPreferenceReference
  **/

  public String getChannelAccessPreferenceReference() {
    return channelAccessPreferenceReference;
  }

  public void setChannelAccessPreferenceReference(String channelAccessPreferenceReference) {
    this.channelAccessPreferenceReference = channelAccessPreferenceReference;
  }


  /**
   * general-info: overarching record combining items listed `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelAccessPreferenceProfile
  **/

  public String getChannelAccessPreferenceProfile() {
    return channelAccessPreferenceProfile;
  }

  public void setChannelAccessPreferenceProfile(String channelAccessPreferenceProfile) {
    this.channelAccessPreferenceProfile = channelAccessPreferenceProfile;
  }


  /**
   * example: email general-info: | `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code | BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelAccessChannelOrDeviceType
  **/

  public String getChannelAccessChannelOrDeviceType() {
    return channelAccessChannelOrDeviceType;
  }

  public void setChannelAccessChannelOrDeviceType(String channelAccessChannelOrDeviceType) {
    this.channelAccessChannelOrDeviceType = channelAccessChannelOrDeviceType;
  }


  /**
   * example: no paper general-info: description of preference `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelAccessChannelOrDeviceTypePreference
  **/

  public String getChannelAccessChannelOrDeviceTypePreference() {
    return channelAccessChannelOrDeviceTypePreference;
  }

  public void setChannelAccessChannelOrDeviceTypePreference(String channelAccessChannelOrDeviceTypePreference) {
    this.channelAccessChannelOrDeviceTypePreference = channelAccessChannelOrDeviceTypePreference;
  }


  /**
   * general-info: sending entity within the bank `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * example: generation date general-info: date type `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return dateType
  **/

  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  /**
   * Get date
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  /**
   * example: sent general-info: state of block of correspondence items `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondenceState
  **/

  public String getCorrespondenceState() {
    return correspondenceState;
  }

  public void setCorrespondenceState(String correspondenceState) {
    this.correspondenceState = correspondenceState;
  }


}

