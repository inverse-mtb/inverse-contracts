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
public class B2CriticalAlertMessage {
  private String sourceService;
  private String operation;
  private OffsetDateTime eventDateTime;

  private String severity;

  private String dealId;
  private String platPurpose;

  private String status;

  private Integer b2ErrorCode;
  private String b2ErrorMessage;

  private Integer b2ResponseErrorCode;
  private String b2ResponseErrorText;

  private String responseBody;
  private String errorMessage;
}
