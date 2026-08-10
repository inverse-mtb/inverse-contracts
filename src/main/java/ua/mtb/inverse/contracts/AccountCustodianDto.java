package ua.mtb.inverse.contracts;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountCustodianDto {
  private String nssmcClientTypeCode;
  private String cnum;
  private String country;
  private String countryTax;
  private String idCode;
  private String clientTypeCode;
  private String shortName;
  private String longName;
  private String legalAddressCountry;
  private String legalAddressPostCode;
  private String legalAddressRegion;
  private String legalAddressDistrict;
  private String legalAddressLocality;
  private String legalAddressStreet;
  private String legalAddressHouse;
  private String legalAddressFlat;
  private String postAddressCountry;
  private String postAddressPostCode;
  private String postAddressRegion;
  private String postAddressDistrict;
  private String postAddressLocality;
  private String postAddressStreet;
  private String postAddressHouse;
  private String postAddressFlat;
  private String docSerial;
  private String docNumber;
  private LocalDate docDate;
  private String docWho;
  private String docType;
  private String iban;
  private String bankName;
  private String currency;
  private String agregateAccountId;
  private BigInteger bankDetailId;
  private boolean use4income;
  private BigInteger bdType;
  private String mobilePhone;
  private String email;
  private LocalDate birthDate;
  private String birthPlace;
  private boolean refusingCode;
  private String agreementNumber;
  private BigInteger agreementId;
  private Set<String> changes;
  private Boolean fop;
  private String mfo;
}
