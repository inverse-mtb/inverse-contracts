package ua.mtb.inverse.contracts.purchase;

import lombok.Data;

@Data
public class RequestSeparatedDocs {
  private String contragentId;
  private Integer diiaIdDocs;
  private String diiaId;
}
