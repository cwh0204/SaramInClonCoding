package run.sumin.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardDTO {

	private Integer jobId;
	private Integer compId;
	private String compName;
	private String jobTitle;
	private Integer salaryMin;
	private Integer salaryMax;
	private String salaryTxt;
	private String careerText;
	private String educationText;
	private String workTypeText;
	private String locationText;
	// HTML 태그가 포함된 내용을 담음 (CLOB 대응)
    private String contentHtml;
 // 마감일도 '17시 까지' 처럼 시간이 필요할 수 있어 LocalDateTime
    private LocalDateTime deadlineDate;
	private Integer viewCount;
	
	private LocalDateTime regDate;
	
}
