package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * update, repair or retransmission of outbound messages
 */
public class CorrespondenceUpdateResponse   {
  private String correspondenceServiceSessionReference = null;

  private String correspondenceUpdateTaskReference = null;

  private String correspondenceUpdateTaskRecord = null;

  private String employeeBusinessUnitReference = null;

  private String correspondenceReference = null;

  private String correspondenceType = null;

  private String correspondenceTemplateReference = null;

  private String correspondenceTemplateRecord = null;

  private String correspondenceContentUpdate = null;

  private String dateType = null;

  private String date = null;

  private String correspondenceState = null;

  private String correspondenceUpdateTaskResult = null;


  /**
   * example: CSSR7245252 general-info: bank reference - will be used to match responses `status: Provisionally Registered` bian-reference: Self 
   * @return correspondenceServiceSessionReference
  **/

  public String getCorrespondenceServiceSessionReference() {
    return correspondenceServiceSessionReference;
  }

  public void setCorrespondenceServiceSessionReference(String correspondenceServiceSessionReference) {
    this.correspondenceServiceSessionReference = correspondenceServiceSessionReference;
  }


  /**
   * example: UTR72346452 general-info: refers to the update action `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondenceUpdateTaskReference
  **/

  public String getCorrespondenceUpdateTaskReference() {
    return correspondenceUpdateTaskReference;
  }

  public void setCorrespondenceUpdateTaskReference(String correspondenceUpdateTaskReference) {
    this.correspondenceUpdateTaskReference = correspondenceUpdateTaskReference;
  }


  /**
   * example: record general-info: refers to the update action `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondenceUpdateTaskRecord
  **/

  public String getCorrespondenceUpdateTaskRecord() {
    return correspondenceUpdateTaskRecord;
  }

  public void setCorrespondenceUpdateTaskRecord(String correspondenceUpdateTaskRecord) {
    this.correspondenceUpdateTaskRecord = correspondenceUpdateTaskRecord;
  }


  /**
   * general-info: identified employee or unit making change `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * example: CR72645 general-info: bank reference - will be used to match responses `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * example: Correspondence Type general-info: Correspondence Type `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text | BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code 
   * @return correspondenceType
  **/

  public String getCorrespondenceType() {
    return correspondenceType;
  }

  public void setCorrespondenceType(String correspondenceType) {
    this.correspondenceType = correspondenceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: if text is place in a standard template 
   * @return correspondenceTemplateReference
  **/

  public String getCorrespondenceTemplateReference() {
    return correspondenceTemplateReference;
  }

  public void setCorrespondenceTemplateReference(String correspondenceTemplateReference) {
    this.correspondenceTemplateReference = correspondenceTemplateReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: the template definition used in correspondence assembly 
   * @return correspondenceTemplateRecord
  **/

  public String getCorrespondenceTemplateRecord() {
    return correspondenceTemplateRecord;
  }

  public void setCorrespondenceTemplateRecord(String correspondenceTemplateRecord) {
    this.correspondenceTemplateRecord = correspondenceTemplateRecord;
  }


  /**
   * example: Updated message general-info: message content that is updated `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return correspondenceContentUpdate
  **/

  public String getCorrespondenceContentUpdate() {
    return correspondenceContentUpdate;
  }

  public void setCorrespondenceContentUpdate(String correspondenceContentUpdate) {
    this.correspondenceContentUpdate = correspondenceContentUpdate;
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
   * example:  general-info:  `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondenceState
  **/

  public String getCorrespondenceState() {
    return correspondenceState;
  }

  public void setCorrespondenceState(String correspondenceState) {
    this.correspondenceState = correspondenceState;
  }


  /**
   * example: success general-info: records the result of the update task `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return correspondenceUpdateTaskResult
  **/

  public String getCorrespondenceUpdateTaskResult() {
    return correspondenceUpdateTaskResult;
  }

  public void setCorrespondenceUpdateTaskResult(String correspondenceUpdateTaskResult) {
    this.correspondenceUpdateTaskResult = correspondenceUpdateTaskResult;
  }


}

