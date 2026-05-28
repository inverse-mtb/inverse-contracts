package ua.mtb.inverse.contracts.enums;

import java.util.List;

public enum DocumentCategory {
  PURCHASE_FIRST, // first-ever purchase → 10 (12) docs
  PURCHASE, // not-first purchase → 4 (6) docs
  PURCHASE_USER_CHANGES, // not-first purchase user change fields from b2 (any) → 10 (12) docs
  PURCHASE_IBAN_TO_PAY_CHANGES, // not-first purchase user change ony IBAN to pay → 8 (10) docs
  PURCHASE_IBAN_TO_RECEIVE_CHANGES, // not-first purchase user change only IBAN to receive → 6 (8)
  // docs -- don't go to custodian
  CANCEL_PURCHASE, // cancellation flow → 4 different docs
  BUYBACK, // sell → 4 (6) docs
  BUYBACK_USER_CHANGES, // sell user change fields from b2 (any) → 10 (12) docs
  BUYBACK_IBAN_TO_RECEIVE_CHANGES; // sell user change ony IBAN to receive → 6 (8) docs -- don't go

  // to custodian

  public List<Integer> getDocTypesNoExtraDocs() {
    return switch (this) {
      case PURCHASE_FIRST ->
          List.of(10015, 10016, 10017, 10018, 10019, 10020, 10021, 10022, 10023, 10024);

      case PURCHASE -> List.of(10021, 10022, 10023, 10024);

      case PURCHASE_USER_CHANGES ->
          List.of(10021, 10022, 10023, 10024, 10043, 10044, 10015, 10016, 10051, 10052);

      case PURCHASE_IBAN_TO_PAY_CHANGES -> List.of(10021, 10022, 10023, 10024, 10051, 10052);

      case PURCHASE_IBAN_TO_RECEIVE_CHANGES ->
          List.of(10021, 10022, 10023, 10024, 10043, 10044, 10015, 10016);

      case CANCEL_PURCHASE -> List.of(10038, 10039, 10040, 10041);

      case BUYBACK -> List.of(10045, 10046, 10023, 10024);

      case BUYBACK_USER_CHANGES ->
          List.of(10043, 10044, 10015, 10016, 10051, 10052, 10045, 10046, 10023, 10024);

      case BUYBACK_IBAN_TO_RECEIVE_CHANGES -> List.of(10045, 10046, 10023, 10024, 10051, 10052);
    };
  }

  public List<Integer> getDocTypes() {
    return switch (this) {
      case PURCHASE_FIRST ->
          List.of(
              10015, 10016, 10017, 10018, 10019, 10020, 10021, 10022, 10023, 10024, 10047, 10048);

      case PURCHASE -> List.of(10021, 10022, 10023, 10024, 10047, 10048);

      case PURCHASE_USER_CHANGES ->
          List.of(
              10021, 10022, 10023, 10024, 10043, 10044, 10015, 10016, 10051, 10052, 10047, 10048);

      case PURCHASE_IBAN_TO_PAY_CHANGES ->
          List.of(10021, 10022, 10023, 10024, 10051, 10052, 10047, 10048);

      case PURCHASE_IBAN_TO_RECEIVE_CHANGES ->
          List.of(10021, 10022, 10023, 10024, 10043, 10044, 10015, 10016, 10047, 10048);

      case CANCEL_PURCHASE -> List.of(10038, 10039, 10040, 10041);

      case BUYBACK -> List.of(10045, 10046, 10047, 10048, 10023, 10024);

      case BUYBACK_USER_CHANGES ->
          List.of(
              10043, 10044, 10015, 10016, 10051, 10052, 10045, 10046, 10047, 10048, 10023, 10024);

      case BUYBACK_IBAN_TO_RECEIVE_CHANGES ->
          List.of(10045, 10046, 10023, 10024, 10051, 10052, 10047, 10048);
    };
  }
}
