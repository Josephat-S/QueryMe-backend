package com.year2.queryme.model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@Builder
public class SubmissionResponse {
    private UUID submissionId;
    private UUID sessionId;
    private Boolean isCorrect;
    private Integer score;
    private String executionError;
    private Boolean resultsVisible;
    private List<String> resultColumns;
    private List<Map<String, Object>> resultRows;
}
