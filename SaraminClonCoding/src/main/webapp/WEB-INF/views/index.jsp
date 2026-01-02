<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/bootstrap-5.3.8-dist/css/bootstrap.min.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/index.css"
>
</head>
<body>
	<h1>시작 페이지</h1>
	<%-- ${list } --%>
	<div class="item_list">
		<div class="box_item">
			<div class="company">
				<a href="#">테스트 텍스트</a> <span class="s_company">테스트 기업</span>
			</div>
			<div class="main_text">
				<div class="job_tit">테스트 제목</div>
				<div class="job_meta">테스트 항목</div>
				<div class="job_badge">급상승 테스트</div>
			</div>
			<div class="colrecruit_info">
				<ul>
					<li>
						<p class="work_place">테스트 지역</p>
					</li>
					<li>
						<p class="work_place">테스트 경력</p>
					</li>
					<li>
						<p class="work_place">테스트 학력</p>
					</li>
				</ul>
			</div>
			<div>
				<button class="sri_btn_md">
					<span class="sri_btn_immediately">입사지원</span>
				</button>
				<p>
				<span class="date">테스트 D-day</span>
				<span class="deadlines">테스트 등록일자</span>
				</p>
			</div>
		</div>
	</div>
</body>
</html>