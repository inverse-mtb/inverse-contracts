package ua.mtb.inverse.contracts.client;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequestMessage {
  private String isin;
  private String depositary;
  private Long quantity;
  private String agreementNumber;
  private String agreementDate;
  private BigDecimal agreementCost;
  private String agreementCurrency;
  private BigInteger agreementType;
  private String sourceMdo;
  private String sourceAccount;
  private String destinationMdo;
  private String destinationAccount;
  private String docSerial;
  private String docNumber;
  private XMLGregorianCalendar docDate;
  private String docWho;
}
