package com.year2.queryme.model.dto;

import lombok.Data;
import java.util.UUID;

@Data
public class SubmissionRequest {
    private String examId;
    private UUID questionId;
    private String studentId;
    private String query;
}
