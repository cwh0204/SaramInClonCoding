package run.sumin.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ScrapsDTO {
	private Integer scrapId;
    private Integer userId;
    private Integer jobId;
    
    // 스크랩 리스트 화면 출력용 (JOIN 결과)
    private String jobTitle;
    private String compName;    
    private String locationText;
    private LocalDateTime deadlineDate;
    
    // 스크랩한 일시
    private LocalDateTime regDate;
}
