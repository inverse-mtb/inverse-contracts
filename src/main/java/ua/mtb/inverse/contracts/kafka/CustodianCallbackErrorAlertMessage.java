package ua.mtb.inverse.contracts.kafka;

import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustodianCallbackErrorAlertMessage {

  private String sourceService;

  /** Local timestamp when alert was generated. */
  private OffsetDateTime eventDateTime;

  /** Custodian RequestID. */
  private String requestId;

  /** Custodian ResponseID. */
  private String responseId;

  /** Custodian callback timestamp. */
  private OffsetDateTime responseTimestamp;

  /** Custodian status.code */
  private String errorCode;

  /** Custodian status.message */
  private String errorMessage;

  /** Original callback XML. */
  private String callback;
}
