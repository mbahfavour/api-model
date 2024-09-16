package com.example.api_model.domain.grades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Builder
@Jacksonized
public class GetGradesByIdResponse {

    String gradeId;

    String gradePosition;
}
