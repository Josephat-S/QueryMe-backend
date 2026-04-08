package com.year2.queryme.model.dto;

import lombok.Builder;
import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
@Builder
public class RunQueryResponse {
    private List<Map<String, Object>> resultRows;
    private List<String> columnNames;
    private String executionError;
}
