package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * handing outbound messages
 */
public class CorrespondenceOutboundRequest   {
  private String outboundCorrespondenceTaskRecord = null;

  private String correspondenceReference = null;

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

  private String productOrServiceType = null;

  private String employeeBusinessUnitReference = null;

  private String dateType = null;

  private String date = null;

  private String correspondenceState = null;

  private Object correspondenceRecord = null;


  /**
   * example: CTR72456425 general-info: used to track processing/state of correspondence `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return outboundCorrespondenceTaskRecord
  **/

  public String getOutboundCorrespondenceTaskRecord() {
    return outboundCorrespondenceTaskRecord;
  }

  public void setOutboundCorrespondenceTaskRecord(String outboundCorrespondenceTaskRecord) {
    this.outboundCorrespondenceTaskRecord = outboundCorrespondenceTaskRecord;
  }


  /**
   * example: CR724575 general-info: bank reference - will be used to match responses `status: Provisionally Registered` bian-reference: PresentationManagementSystem.ManagedPresentation.Identification 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * example: Correspondence Type general-info: | `status: Registered` isoLink1: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102/elements/_-IizE3ltEeG7BsjMvd1mEw_1655223030)\" bian-reference: PresentationManagementSystem.ManagedPresentation.CommunicationMethod `status: Registered` isoLink2: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102/elements/_prF7MLbpEeGAapiw3IODVw_2145476732)\" bian-reference: PresentationManagementSystem.ManagedPresentation.Medium 
   * @return correspondenceType
  **/

  public String getCorrespondenceType() {
    return correspondenceType;
  }

  public void setCorrespondenceType(String correspondenceType) {
    this.correspondenceType = correspondenceType;
  }


  /**
   * example: CTR7246245 general-info: if text is place in a standard template `status: Registered` isoLink1: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9ju10HltEeG7BsjMvd1mEw_-739610260/elements/_9jSw9XltEeG7BsjMvd1mEw_947856562)\" bian-reference: PresentationManagementSystem.ManagedPresentation.PresentedUndertaking.ModelForm 
   * @return correspondenceTemplateReference
  **/

  public String getCorrespondenceTemplateReference() {
    return correspondenceTemplateReference;
  }

  public void setCorrespondenceTemplateReference(String correspondenceTemplateReference) {
    this.correspondenceTemplateReference = correspondenceTemplateReference;
  }


  /**
   * example: template 1 general-info: the template definition used in correspondence assembly `status: Registered` isoLink1: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9ju10HltEeG7BsjMvd1mEw_-739610260/elements/_9jSw9XltEeG7BsjMvd1mEw_947856562)\" bian-reference: PresentationManagementSystem.ManagedPresentation.PresentedUndertaking.ModelForm 
   * @return correspondenceTemplateRecord
  **/

  public String getCorrespondenceTemplateRecord() {
    return correspondenceTemplateRecord;
  }

  public void setCorrespondenceTemplateRecord(String correspondenceTemplateRecord) {
    this.correspondenceTemplateRecord = correspondenceTemplateRecord;
  }


  /**
   * example: content general-info: | `status: Registered` isoLink1: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102/elements/__mMdhGx4EeKmZJ0Ago--9g_-927157417)\" bian-reference: PresentationManagementSystem.ManagedPresentation.PresentedDocument `status: Registered` isoLink2: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102/elements/__mMdg2x4EeKmZJ0Ago--9g_445499010)\" bian-reference: PresentationManagementSystem.ManagedPresentation.PresentedUndertaking 
   * @return correspondenceContent
  **/

  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }


  /**
   * example: EMAIL general-info: | `status: Registered` isoLink1: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102/elements/_-IizE3ltEeG7BsjMvd1mEw_1655223030)\" bian-reference: PresentatinManagementSystem.ManagedPresentation.CommunicationMethod `status: Registered` isoLink2: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102/elements/_prF7MLbpEeGAapiw3IODVw_2145476732)\" bian-reference: PresentationManagementSystem.ManagedPresentation.Medium 
   * @return correspondenceMediaOrChannel
  **/

  public String getCorrespondenceMediaOrChannel() {
    return correspondenceMediaOrChannel;
  }

  public void setCorrespondenceMediaOrChannel(String correspondenceMediaOrChannel) {
    this.correspondenceMediaOrChannel = correspondenceMediaOrChannel;
  }


  /**
   * example: test@test.com general-info: | `status: Provisionally Registered` bian-reference: PresentationManagementSystem.ManagedPresentation.PostalAddress `status: Registered` isoLink1: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102/elements/_9lrWkHltEeG7BsjMvd1mEw_145099947)\" bian-reference: PresentationManagementSystem.ManagedPresentation.ElectronicPresentationAddress 
   * @return correspondenceAddressee
  **/

  public String getCorrespondenceAddressee() {
    return correspondenceAddressee;
  }

  public void setCorrespondenceAddressee(String correspondenceAddressee) {
    this.correspondenceAddressee = correspondenceAddressee;
  }


  /**
   * general-info: if identified as customer with channel preferences for correspondence `status: Provisionally Registered` bian-reference: PresentationManagementSystem.ManagedPresentation.TargetCustomer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
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
   * general-info: | `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text `status: Registered` isoLink1: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102/elements/_-IizE3ltEeG7BsjMvd1mEw_1655223030)\" bian-reference: PresentationManagementSystem.ManagedPresentation.CommunicationMethod   
   * @return channelAccessChannelOrDeviceType
  **/

  public String getChannelAccessChannelOrDeviceType() {
    return channelAccessChannelOrDeviceType;
  }

  public void setChannelAccessChannelOrDeviceType(String channelAccessChannelOrDeviceType) {
    this.channelAccessChannelOrDeviceType = channelAccessChannelOrDeviceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelAccessChannelOrDeviceTypePreference
  **/

  public String getChannelAccessChannelOrDeviceTypePreference() {
    return channelAccessChannelOrDeviceTypePreference;
  }

  public void setChannelAccessChannelOrDeviceTypePreference(String channelAccessChannelOrDeviceTypePreference) {
    this.channelAccessChannelOrDeviceTypePreference = channelAccessChannelOrDeviceTypePreference;
  }


  /**
   * general-info: associated product or service if appropriate `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text | BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code 
   * @return productOrServiceType
  **/

  public String getProductOrServiceType() {
    return productOrServiceType;
  }

  public void setProductOrServiceType(String productOrServiceType) {
    this.productOrServiceType = productOrServiceType;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
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
   * `status: Provisionally Registered` bian-reference: PresentationManagementSystem.ManagedPresentation.Status 
   * @return correspondenceState
  **/

  public String getCorrespondenceState() {
    return correspondenceState;
  }

  public void setCorrespondenceState(String correspondenceState) {
    this.correspondenceState = correspondenceState;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: combination of following fields     
   * @return correspondenceRecord
  **/

  public Object getCorrespondenceRecord() {
    return correspondenceRecord;
  }

  public void setCorrespondenceRecord(Object correspondenceRecord) {
    this.correspondenceRecord = correspondenceRecord;
  }


}

