package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@Column(name="sid")
	private Integer stdId;
	@Column(name="name")
	private String stdName;
	@Column(name="course")
	private String stdCourse;
	@Column(name="fee")
	private Double stdFee;

}
