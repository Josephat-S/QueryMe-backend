package com.year2.queryme.sandbox.service;

import com.year2.queryme.sandbox.dto.SandboxConnectionInfo;
import java.util.UUID;

public interface SandboxService {
    String provisionSandbox(String examId, String studentId, String seedSql);
    void teardownSandbox(String examId, String studentId);
    SandboxConnectionInfo getSandboxConnectionDetails(String examId, String studentId);
}