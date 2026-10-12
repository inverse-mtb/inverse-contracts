package ua.mtb.inverse.contracts.docs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignedDocsRequest {
  @JsonProperty("contragentid")
  private Integer contragentId;

  @JsonProperty("contragenttypeid")
  private Integer contragentTypeId;

  @JsonProperty("doctypes")
  private List<Integer> docTypes;
}
