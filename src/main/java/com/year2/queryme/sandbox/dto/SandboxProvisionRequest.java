package com.year2.queryme.sandbox.dto;

import java.util.UUID;

public record SandboxProvisionRequest(
        String examId,
        String studentId,
        String seedSql
) {
}

