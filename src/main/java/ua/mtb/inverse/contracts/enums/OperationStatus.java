package ua.mtb.inverse.contracts.enums;

public enum OperationStatus {
  INITIATED, // Purchase request created
  DOCUMENTS_GENERATED, // The necessary documents have been generated
  WAITING_FOR_SIGNATURE, // Awaiting client and bank signatures
  SIGNED, // Bank and client signature completed
  DOCUMENTS_SEND, // The necessary documents have been sent to e-mail
  CANCELLED, // The client canceled the purchase request
  FUNDS_CHARGED, // Money has been charged from the client account
  AWAITING_SECURITIES_DELIVERY, // Going to Custodian to deliver securities
  SECURITIES_DELIVERED, // Securities delivered to client(or bank if buyback)
  COMPLETED, // Purchase is fully finalized
  REVOKED, // Purchase refunded
  FAILED // Purchase process encountered an error
}
