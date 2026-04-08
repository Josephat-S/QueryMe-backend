package com.year2.queryme.controller;

import com.year2.queryme.model.Submission;
import com.year2.queryme.model.dto.RunQueryResponse;
import com.year2.queryme.model.dto.SubmissionRequest;
import com.year2.queryme.model.dto.SubmissionResponse;
import com.year2.queryme.service.QueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/query")
@RequiredArgsConstructor
public class QueryController {

    private final QueryService queryService;

    @PostMapping("/submit")
    public ResponseEntity<SubmissionResponse> submitQuery(@RequestBody SubmissionRequest request) {
        return ResponseEntity.ok(queryService.submitQuery(request));
    }

    @PostMapping("/run")
    public ResponseEntity<RunQueryResponse> runQuery(@RequestBody SubmissionRequest request) {
        return ResponseEntity.ok(queryService.runQuery(request));
    }

    @GetMapping("/submissions/student/{studentId}/exam/{examId}")
    public ResponseEntity<List<Submission>> getSubmissionHistory(
            @PathVariable UUID studentId,
            @PathVariable UUID examId) {
        return ResponseEntity.ok(queryService.getSubmissionsByExamAndStudent(examId, studentId));
    }
}
