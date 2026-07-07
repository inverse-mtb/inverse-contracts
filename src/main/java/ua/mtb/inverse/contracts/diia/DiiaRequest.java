package ua.mtb.inverse.contracts.diia;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiiaRequest {
  private String branchId;
  private String requestId;
  private String offerName;
  private Integer idClient;
  private PreparedReports preparedReports;

  @Data
  @Builder
  @AllArgsConstructor
  @NoArgsConstructor
  public static class PreparedReports {
    private String urlEndpoint;
    private List<ScopeItem> scope;
  }

  @Data
  @Builder
  @AllArgsConstructor
  @NoArgsConstructor
  public static class ScopeItem {
    private String docRequestId;
    private String nameDoc;
    private int typeDoc;
  }
}
