package run.sumin.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UsersDTO {
	private Integer userId;
	private String userEmail;
	private String userPass;
	private String userName;
	private LocalDate regDate;
}
