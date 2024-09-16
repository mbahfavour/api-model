package com.example.api_model.domain.grades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;
import org.springframework.lang.NonNull;

@Builder
@Jacksonized
@Getter
@Setter
public class GetGradesByIdRequest {

    @NonNull
    String gradeId;

}
