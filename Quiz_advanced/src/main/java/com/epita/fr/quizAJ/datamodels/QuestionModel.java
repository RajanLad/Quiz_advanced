package com.epita.fr.quizAJ.datamodels;

import javax.persistence.*;

@Entity
@Table(name="Questions")
public class QuestionModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Q_ID")
	private Integer q_id; 
	
	@Column(name="Q_CONTENT")
	private String q_content; 

	public QuestionModel() {

	}
	
	public Integer getId() {
		return q_id;
	}

	public void setId(Integer id) {
		this.q_id = id;
	}

	public String getContent() {
		return q_content;
	}

	public void setContent(String content) {
		this.q_content = content;
	}
	
}