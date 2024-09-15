package com.example.api_model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

import java.util.concurrent.ConcurrentHashMap;

@Getter
@Setter
@Builder
@Jacksonized
public class StudentCourse {

    String studentId;

    ConcurrentHashMap<String, String> studentGrades;

}
