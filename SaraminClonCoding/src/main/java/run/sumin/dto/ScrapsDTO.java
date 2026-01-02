package run.sumin.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ScrapsDTO {
	private Integer scrapId;
	private Integer userId;
	private Integer jobId;
	private LocalDate regDate;
}
