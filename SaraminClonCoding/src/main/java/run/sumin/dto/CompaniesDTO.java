package run.sumin.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CompaniesDTO {
	private Integer compId;
	private String compName;
	private String ceoName;
	private String compIndustry;
	private String compScale;
	private Integer empCount;
	private LocalDate estDate;
	private String compAddress;
	private String homepageUrl;
	private String logoImageUrl;
}
