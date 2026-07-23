package ua.mtb.inverse.contracts.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.Getter;

@Getter
public enum DocumentType {
  ACCOUNTING_ORDER_FILE_REV("100639", "100751", 10047, "Розпорядження на облікову операцію (Банк)"),
  ACCOUNTING_ORDER_FILE("100640", "100752", 10023, "Розпорядження на облікову операцію (Клієнт)"),
  SECURITIES_ACCOUNT_APPLICATION_FILE("100542", "100542", 10015, "Анкета рахунку в цінних паперах"),
  SERVICE_AGREEMENT_FILE(
      "100543",
      "100543",
      10017,
      "Заява про приєднання до Договору про обслуговування рахунку в цінних паперах"),
  GENERAL_AGREEMENT_FILE(
      "100017",
      "100544",
      10019,
      "Генеральний договір про надання інвестиційних послуг (індивідуальна частина)"),
  PURCHASE_AGREEMENT_FILE(
      "100545", "100545", 10021, "Договір купівлі-продажу фінансових інструментів"),
  PURCHASE_CANCELLATION_AGREEMENT_FILE(
      "100754",
      "100754",
      10039,
      "Заява про розірвання договору куплі-продажу фінансових інструментів (МТБ ИНВЕСТ)"),
  PURCHASE_CANCELLATION_APPLICATION_FILE(
      "100753",
      "100753",
      10038,
      "Договір розірвання куплі-продажу фінансових інструментів (МТБ ИНВЕСТ)"),
  ACCOUNTING_ORDER_CHANGE_FILE(
      "100569",
      "100713",
      10043,
      "Розпорядження на внесення змін до анкети рахунку у цінних паперах"),
  GENERAL_AGREEMENT_FILE_ADDITIONAL_CHANGES(
      "100570",
      "100745",
      10051,
      "Додатковий договір про внесення змін до Генерального договору про надання інвестиційних послуг (індивідуальна частина)"),
  PURCHASE_AGREEMENT_FILE_REV(
      "100723",
      "100723",
      10045,
      "Договір купівлі-продажу фінансових інструментів (Банк - Покупець)");

  private final String univId;
  private final String univIdDev;
  private final int diiaId;
  private final String docName;

  private static final String SUFFIX_PDF = " - pdf";
  private static final String PREFIX_CANCEL = "МІ_";

  private static final Map<String, DocumentType> BY_DOC_NAME =
      Arrays.stream(values()).collect(Collectors.toMap(DocumentType::getDocName, d -> d));

  private static final Map<Integer, String> BY_DOC_DIIA_ID =
      Arrays.stream(values())
          .collect(Collectors.toMap(DocumentType::getDiiaId, DocumentType::getDocName));

  DocumentType(String univId, String univIdDev, int diiaId, String docName) {
    this.univId = univId;
    this.univIdDev = univIdDev;
    this.diiaId = diiaId;
    this.docName = docName;
  }

  /**
   * Return the enum matching the given docName or throw IllegalArgumentException if none matches.
   */
  public static DocumentType fromDocName(String docName) {
    DocumentType doc = BY_DOC_NAME.get(docName);
    if (doc == null) {
      throw new IllegalArgumentException("Unknown docName: " + docName);
    }
    return doc;
  }

  public static String getDocName(Integer diiaId) {
    String name = BY_DOC_DIIA_ID.get(diiaId);
    if (name == null) {
      throw new IllegalArgumentException("Unknown diiaId: " + diiaId);
    }
    return name;
  }

  public static String getNameDocRequestDiia(String fileName, int typeDoc) {
    switch (typeDoc) {
      case 10038, 10039 -> {
        return PREFIX_CANCEL + fileName;
      }
      case 10021, 10023, 10045, 10019, 10017, 10015, 10051 -> {
        return fileName + SUFFIX_PDF;
      }
      case 10043 -> {
        return PREFIX_CANCEL + fileName + SUFFIX_PDF;
      }
      default -> {
        return fileName;
      }
    }
  }
}
