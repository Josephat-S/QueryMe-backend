package com.year2.queryme.service;

import com.year2.queryme.model.Result;
import java.util.List;
import java.util.UUID;

public interface ResultService {
    List<Result> getResultsForStudent(String sessionId);
    void processNewSubmission(UUID submissionId);
    List<Result> getResultsForTeacher(String examId);
    Result saveQueryResult(UUID submissionId, Integer score, Boolean isCorrect);
}
