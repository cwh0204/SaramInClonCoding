package run.sumin.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UsersDTO {
	private Integer userId;
	private String userEmail;
	private String userPass;
	private String userName;
	private LocalDateTime regDate;
}
