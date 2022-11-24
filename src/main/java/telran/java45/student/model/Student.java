package telran.java45.student.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Student {
	@Id
	int id;
	@Setter
	String name;
	@Setter
	String password;
	Map<String, Integer> scores = new HashMap<>();

	public Student(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public boolean addScore(String exam, int score) {
		return scores.put(exam, score) == null;
	}
}
