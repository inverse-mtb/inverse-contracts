package ua.mtb.inverse.contracts.news;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.OffsetDateTime;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewsCallbackRequest {
  private ActionCallbackDto action;
  private NewsCallbackDto news;
  private String version;

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class ActionCallbackDto {
    private OffsetDateTime datetime;
    private Long id;
    private String type;
  }

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class NewsCallbackDto {
    private OffsetDateTime datetime;
    private Long id;
    private String header;
    private String language;
    private String product;
    private String slugline;
    private String type;
    private String body;
  }
}
