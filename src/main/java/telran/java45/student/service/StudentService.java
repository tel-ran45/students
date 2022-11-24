package telran.java45.student.service;

import java.util.List;

import telran.java45.student.dto.ScoreDto;
import telran.java45.student.dto.StudentCreateDto;
import telran.java45.student.dto.StudentDto;
import telran.java45.student.dto.StudentUpdateDto;

public interface StudentService {
	Boolean addStudent(StudentCreateDto studentCreateDto);
	
	StudentDto findStudent(Integer id);
	
	StudentDto removeStudent(Integer id);
	
	StudentCreateDto updateStudent(Integer id, StudentUpdateDto studentUpdateDto);
	
	Boolean addScore(Integer id, ScoreDto scoreDto);
	
	List<StudentDto> findStudentsByName(String name);
	
	Long getStudentsNamesQuantity(List<String> names);
	
	List<StudentDto> getStudentsByExamMinScore(String exam, Integer minScore);
}
