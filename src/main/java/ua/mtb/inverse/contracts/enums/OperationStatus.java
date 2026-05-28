package ua.mtb.inverse.contracts.enums;

public enum OperationStatus {
  INITIATED, // Purchase request created
  DOCUMENTS_GENERATED, // The necessary documents have been generated
  WAITING_FOR_SIGNATURE, // Awaiting client and bank signatures
  SIGNED_BY_CLIENT, // Client has signed the documents
  SIGNED_BY_BANK, // Bank signature completed
  DOCUMENTS_SEND, // The necessary documents have been sent to e-mail
  AWAITING_CUSTODIAN, // Sent to custodian for securities account opening
  CANCELLED, // The client canceled the purchase request
  FUNDS_CHARGED, // Money has been charged from the client account
  COMPLETED, // Purchase is fully finalized
  COMPLETED_EXTERNALLY, // Purchase is processed outside the code (by bank personnel)
  FAILED // Purchase process encountered an error
}
