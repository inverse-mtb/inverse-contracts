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
public class DocumentGenerationAlertMessage {
  private String sourceService;
  private String operation;
  private String downstreamUrl;
  private OffsetDateTime requestDateTime;
  private String requestId;
  private Integer kep;
  private String status;
  private Integer httpStatusCode;
  private Integer responseBytes;
  private String responseHeadersJson;
  private String responseBody;
  private String errorMessage;
}
