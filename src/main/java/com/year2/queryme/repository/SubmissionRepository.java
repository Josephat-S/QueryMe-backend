package com.year2.queryme.repository;

import com.year2.queryme.model.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, UUID> {
    List<Submission> findByStudentIdAndExamId(String studentId, String examId);
    List<Submission> findByExamId(String examId);
    List<Submission> findByQuestionId(UUID questionId);
}
