package ua.mtb.inverse.contracts.news;

import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.mtb.inverse.contracts.enums.ActionType;
import ua.mtb.inverse.contracts.enums.NewsType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewsFeedDto {
  private Long id;
  private Integer version;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  private OffsetDateTime actionDateTime;
  private Long actionId;
  private ActionType actionType;
  private Long newsId;
  private OffsetDateTime newsDateTime;
  private String header;
  private String language;
  private String product;
  private String slugline;
  private NewsType newsType;
  private String body;
  private String imagePath;
  private Boolean isVisible;
  private Boolean isExternal;
  private Boolean isDraft;
}
