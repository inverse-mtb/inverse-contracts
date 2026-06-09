package ua.mtb.inverse.contracts.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.ClientStatus;
import ua.mtb.inverse.contracts.enums.GeneralAgreementState;

import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {
  private Long id;
  private Integer version;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  private String phoneNumber;
  private String pin; //remove
  private String contragentId;
  private String residentTypeId;
  private String sName;
  private String name;
  private String lastName;
  private String firstName;
  private String patronymicName;
  private String birthDate;
  private String birthPlace;
  private Integer countryId;
  private Long bankDetailId;
  private String identifyCode;
  private Integer regionalCodeId;
  private Integer passportType;
  private String passportNo;
  private String passportIssuePlace;
  private String dateOfIssues;
  private ResponseAddress address;
  private ResponseAddress jurAddress;
  private String phones;
  private String email;
  private boolean isVerified;
  private ClientStatus status;
  private String registerDate;
  private Integer pFamilyStatusId;
  private Boolean isFop;
  private Boolean isPep;
  private String custodianAccountNumber;
  private Boolean isCanOpened;
  private String generalAgreementNumber;
  private Boolean isGanOpened;
  private String generalAgreementDate;
  private GeneralAgreementState generalAgreementState;
  private String ibanToPay;
  private String ibanToReceive;
}
