package com.year2.queryme.service;

import com.year2.queryme.model.Submission;
import com.year2.queryme.model.dto.RunQueryResponse;
import com.year2.queryme.model.dto.SubmissionRequest;
import com.year2.queryme.model.dto.SubmissionResponse;
import java.util.List;
import java.util.UUID;

public interface QueryService {
    SubmissionResponse submitQuery(SubmissionRequest request);
    RunQueryResponse runQuery(SubmissionRequest request);
    List<Submission> getSubmissionsByExamAndStudent(UUID examId, UUID studentId);
}
