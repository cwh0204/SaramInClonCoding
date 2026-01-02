<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/bootstrap-5.3.8-dist/css/bootstrap.min.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/index.css">
</head>
<body>
	<div class="container mt-5">
		<h1>시작 페이지</h1>
		<c:forEach var="item" items="${list }">
			<div class="list_body">
				<div class="item_list">
					<div class="box_item">
						<div class="company">
							<a href="#">${item.compName}</a> 
							<span class="s_company">테스트 기업</span>
						</div>
						<div class="main_text">
							<div class="job_tit">${item.jobTitle}</div>
							<div class="job_meta">테스트 항목</div>
							<div class="job_badge">급상승 테스트</div>
						</div>
						<div class="colrecruit_info">
							<ul>
								<li>
									<p class="work_place">${item.locationText}</p>
								</li>
								<li>
									<p class="work_place">테스트 경력</p>
								</li>
								<li>
									<p class="work_place">테스트 학력</p>
								</li>
							</ul>
						</div>
						<div style="display: flex;
						     flex-direction: column;
							 align-items: flex-end;">
							<button class="sri_btn_md">
								<span class="sri_btn_immediately">입사지원</span>
							</button>
							<p>
								<span class="date">${item.deadlineDate}</span> 
								<span class="deadlines">${item.regDate}</span>
							</p>
						</div>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>