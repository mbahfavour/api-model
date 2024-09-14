package com.example.api_model.profile.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Builder
@Jacksonized
public class GetStudentProfileByStudentIdResponse {

    String studentId;

    String studentClass;

    String studentAge;

}
