package ua.mtb.inverse.contracts.kafka.admin;

import java.time.OffsetDateTime;
import java.util.List;

public record AdminDataChangeEvent(
    Long eventId,
    AdminEntityType entityType,
    Long entityId,
    AdminDataChangeType changeType,
    List<AdminDataResource> resources,
    OffsetDateTime changedAt) {}
