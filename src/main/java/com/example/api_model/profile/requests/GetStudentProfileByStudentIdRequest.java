package com.example.api_model.profile.requests;

import lombok.*;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Builder
@Jacksonized
public class GetStudentProfileByStudentIdRequest {

    @NonNull
    String studentId;
}
