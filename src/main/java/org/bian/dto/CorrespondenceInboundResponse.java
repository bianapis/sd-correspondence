package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * handling in-bound messages
 */
public class CorrespondenceInboundResponse   {
  private String correspondenceServiceSessionReference = null;

  private String inboundCorrespondenceTaskReference = null;

  private Object inboundCorrespondenceTaskRecord = null;

  private String correspondenceReference = null;

  private String correspondenceType = null;

  private String correspondenceContent = null;

  private String correspondenceAddressee = null;

  private String customerReference = null;

  private String employeeBusinessUnitReference = null;

  private String dateType = null;

  private String date = null;

  private String correspondenceState = null;


  /**
   * example: CSSR7DEA74 general-info: bank reference - will be used to match responses `status: Provisionally Registered` bian-reference: Self 
   * @return correspondenceServiceSessionReference
  **/

  public String getCorrespondenceServiceSessionReference() {
    return correspondenceServiceSessionReference;
  }

  public void setCorrespondenceServiceSessionReference(String correspondenceServiceSessionReference) {
    this.correspondenceServiceSessionReference = correspondenceServiceSessionReference;
  }


  /**
   * example: CTR7246425 general-info: bank reference - will be used to match responses `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return inboundCorrespondenceTaskReference
  **/

  public String getInboundCorrespondenceTaskReference() {
    return inboundCorrespondenceTaskReference;
  }

  public void setInboundCorrespondenceTaskReference(String inboundCorrespondenceTaskReference) {
    this.inboundCorrespondenceTaskReference = inboundCorrespondenceTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: used to track processig/state of -Correspondence 
   * @return inboundCorrespondenceTaskRecord
  **/

  public Object getInboundCorrespondenceTaskRecord() {
    return inboundCorrespondenceTaskRecord;
  }

  public void setInboundCorrespondenceTaskRecord(Object inboundCorrespondenceTaskRecord) {
    this.inboundCorrespondenceTaskRecord = inboundCorrespondenceTaskRecord;
  }


  /**
   * example: CR7245245 general-info: bank reference - will be used to match responses `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * example: unsolicited message general-info: Correspondence Type `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text | BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code 
   * @return correspondenceType
  **/

  public String getCorrespondenceType() {
    return correspondenceType;
  }

  public void setCorrespondenceType(String correspondenceType) {
    this.correspondenceType = correspondenceType;
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
   * example: test@test.com general-info: identified source of inbound message `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondenceAddressee
  **/

  public String getCorrespondenceAddressee() {
    return correspondenceAddressee;
  }

  public void setCorrespondenceAddressee(String correspondenceAddressee) {
    this.correspondenceAddressee = correspondenceAddressee;
  }


  /**
   * general-info: if identification matched to existing customer or known party `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * general-info: identified addressee within the bank `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * general-info: addressee identification date `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
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
   * example: received pending delivery general-info: correspondende state `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondenceState
  **/

  public String getCorrespondenceState() {
    return correspondenceState;
  }

  public void setCorrespondenceState(String correspondenceState) {
    this.correspondenceState = correspondenceState;
  }


}

