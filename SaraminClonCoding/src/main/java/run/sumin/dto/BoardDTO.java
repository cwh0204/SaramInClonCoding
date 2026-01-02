package run.sumin.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BoardDTO {

	private Integer jobId;
	private Integer compId;
	private String jobTitle;
	private Integer salaryMin;
	private Integer salaryMax;
	private String salaryTxt;
	private String careerText;
	private String educationText;
	private String workTypeText;
	private String locationText;
	private String contentHtml;
	private LocalDate deadlineDate;
	private Integer viewCount;
	private LocalDate regDate;
	
}
