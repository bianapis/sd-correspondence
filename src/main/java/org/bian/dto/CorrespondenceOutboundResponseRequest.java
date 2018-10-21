package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * handling messages for which a response needs to be tracked and returned
 */
public class CorrespondenceOutboundResponseRequest   {
  private Object outboundCorrespondenceWithResponseTaskRecord = null;

  private String productOrServiceType = null;

  private String correspondenceReference = null;

  private Object correspondenceRecord = null;

  private String correspondenceType = null;

  private String correspondenceTemplateReference = null;

  private Object correspondenceTemplateRecord = null;

  private String correspondenceContent = null;

  private String correspondenceMediaOrChannel = null;

  private String correspondenceAddressee = null;

  private String customerReference = null;

  private String channelAccessPreferenceReference = null;

  private String channelAccessPreferenceProfile = null;

  private String channelAccessChannelOrDeviceType = null;

  private String channeAccessChannelOrDeviceTypePreference = null;

  private String employeeBusinessUnitReference = null;

  private String responseDueDate = null;

  private String dateType = null;

  private String date = null;

  private String responseCorrespondenceReference = null;

  private Object responseCorrespondenceRecord = null;

  private String correspondenceState = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: used to track processing/state of correspondence 
   * @return outboundCorrespondenceWithResponseTaskRecord
  **/

  public Object getOutboundCorrespondenceWithResponseTaskRecord() {
    return outboundCorrespondenceWithResponseTaskRecord;
  }

  public void setOutboundCorrespondenceWithResponseTaskRecord(Object outboundCorrespondenceWithResponseTaskRecord) {
    this.outboundCorrespondenceWithResponseTaskRecord = outboundCorrespondenceWithResponseTaskRecord;
  }


  /**
   * example: LOAN general-info: | `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text | BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code 
   * @return productOrServiceType
  **/

  public String getProductOrServiceType() {
    return productOrServiceType;
  }

  public void setProductOrServiceType(String productOrServiceType) {
    this.productOrServiceType = productOrServiceType;
  }


  /**
   * example: CR724525 general-info: | `status: Provisionally Registered` bian-reference: PresentationManagementSystem.ManagedPresentation.Identification 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
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
   * example: TR7245254 general-info: if text is place in a standard template `status: Registered` isoLink1: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9ju10HltEeG7BsjMvd1mEw_-739610260/elements/_9jSw9XltEeG7BsjMvd1mEw_947856562)\" bian-reference: 
   * @return correspondenceTemplateReference
  **/

  public String getCorrespondenceTemplateReference() {
    return correspondenceTemplateReference;
  }

  public void setCorrespondenceTemplateReference(String correspondenceTemplateReference) {
    this.correspondenceTemplateReference = correspondenceTemplateReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: the template definition used in correspondence assembly 
   * @return correspondenceTemplateRecord
  **/

  public Object getCorrespondenceTemplateRecord() {
    return correspondenceTemplateRecord;
  }

  public void setCorrespondenceTemplateRecord(Object correspondenceTemplateRecord) {
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
   * example: EMAIL general-info: | `status: Registered` isoLink1: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102/elements/_-IizE3ltEeG7BsjMvd1mEw_1655223030)\" bian-reference: PresentationManagementSystem.ManagedPresentation.CommunicationMethod `status: Registered` isoLink2: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_9lOqonltEeG7BsjMvd1mEw_-1685162102/elements/_prF7MLbpEeGAapiw3IODVw_2145476732)\" bian-reference: PresentationManagementSystem.ManagedPresentation.Medium 
   * @return correspondenceMediaOrChannel
  **/

  public String getCorrespondenceMediaOrChannel() {
    return correspondenceMediaOrChannel;
  }

  public void setCorrespondenceMediaOrChannel(String correspondenceMediaOrChannel) {
    this.correspondenceMediaOrChannel = correspondenceMediaOrChannel;
  }


  /**
   * example: test@test.com general-info: | `status: Registered` isoLink1: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FMxY5cTGEeChad0JzLk7QA_1264682665/elements/_Ex8eEMTGEeChad0JzLk7QA_15570301)\" bian-reference: PresentationManagementSystem.ManagedPresentation.InitialCorrespondence.ElectronicPresentationAddress(asContactPoint).ReturnAddress `status: Registered` isoLink2: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FMxY5cTGEeChad0JzLk7QA_1264682665/elements/_Ex8eEMTGEeChad0JzLk7QA_15570301)\" bian-reference: PresentationManagementSystem.ManagedPresentation.InitialCorrespondence.PostalAddress(asContactPoint).ReturnAddress 
   * @return correspondenceAddressee
  **/

  public String getCorrespondenceAddressee() {
    return correspondenceAddressee;
  }

  public void setCorrespondenceAddressee(String correspondenceAddressee) {
    this.correspondenceAddressee = correspondenceAddressee;
  }


  /**
   * general-info: | `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: | 
   * @return channelAccessPreferenceReference
  **/

  public String getChannelAccessPreferenceReference() {
    return channelAccessPreferenceReference;
  }

  public void setChannelAccessPreferenceReference(String channelAccessPreferenceReference) {
    this.channelAccessPreferenceReference = channelAccessPreferenceReference;
  }


  /**
   * general-info: | `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text | BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code 
   * @return channelAccessPreferenceProfile
  **/

  public String getChannelAccessPreferenceProfile() {
    return channelAccessPreferenceProfile;
  }

  public void setChannelAccessPreferenceProfile(String channelAccessPreferenceProfile) {
    this.channelAccessPreferenceProfile = channelAccessPreferenceProfile;
  }


  /**
   * general-info: | `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text `status: Registered` isoLink1: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FMxY5cTGEeChad0JzLk7QA_1264682665/elements/_Ex8eEMTGEeChad0JzLk7QA_15570301)\" bian-reference: PresentationManagementSystem.ManagedPresentation.InitialCorrespondence.ElectronicPresentationAddress(asContactPoint).ReturnAddress `status: Registered` isoLink2: \"[click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FMxY5cTGEeChad0JzLk7QA_1264682665/elements/_Ex8eEMTGEeChad0JzLk7QA_15570301)\" bian-reference: PresentationManagementSystem.ManagedPresentation.InitialCorrespondence.PostalAddress(asContactPoint).ReturnAddress 
   * @return channelAccessChannelOrDeviceType
  **/

  public String getChannelAccessChannelOrDeviceType() {
    return channelAccessChannelOrDeviceType;
  }

  public void setChannelAccessChannelOrDeviceType(String channelAccessChannelOrDeviceType) {
    this.channelAccessChannelOrDeviceType = channelAccessChannelOrDeviceType;
  }


  /**
   * example: no paper correspondence general-info: description of preference `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channeAccessChannelOrDeviceTypePreference
  **/

  public String getChanneAccessChannelOrDeviceTypePreference() {
    return channeAccessChannelOrDeviceTypePreference;
  }

  public void setChanneAccessChannelOrDeviceTypePreference(String channeAccessChannelOrDeviceTypePreference) {
    this.channeAccessChannelOrDeviceTypePreference = channeAccessChannelOrDeviceTypePreference;
  }


  /**
   * general-info: | `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * Get responseDueDate
   * @return responseDueDate
  **/

  public String getResponseDueDate() {
    return responseDueDate;
  }

  public void setResponseDueDate(String responseDueDate) {
    this.responseDueDate = responseDueDate;
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
   * example: RCR789456123 general-info: inbound correspondence reference matched `status: Provisionally Registered` bian-reference: PresentationManagementSystem.ManagedPresentation 
   * @return responseCorrespondenceReference
  **/

  public String getResponseCorrespondenceReference() {
    return responseCorrespondenceReference;
  }

  public void setResponseCorrespondenceReference(String responseCorrespondenceReference) {
    this.responseCorrespondenceReference = responseCorrespondenceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: content of inbound corresponden 
   * @return responseCorrespondenceRecord
  **/

  public Object getResponseCorrespondenceRecord() {
    return responseCorrespondenceRecord;
  }

  public void setResponseCorrespondenceRecord(Object responseCorrespondenceRecord) {
    this.responseCorrespondenceRecord = responseCorrespondenceRecord;
  }


  /**
   * example: sent pending response general-info: | `status: Provisionally Registered` bian-reference: PresentationManagementSystem.ManagedPresentation.Status 
   * @return correspondenceState
  **/

  public String getCorrespondenceState() {
    return correspondenceState;
  }

  public void setCorrespondenceState(String correspondenceState) {
    this.correspondenceState = correspondenceState;
  }


}

