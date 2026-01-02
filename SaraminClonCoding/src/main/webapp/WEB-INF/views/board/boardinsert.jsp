<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>채용공고 등록</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: 'Malgun Gothic', sans-serif;
	background-color: #f8f9fa;
	padding: 20px;
}

.container {
	max-width: 800px;
	margin: 0 auto;
	background: white;
	border-radius: 8px;
}

.section {
	padding: 30px;
	border-bottom: 1px solid #e9ecef;
}

.section:last-child {
	border-bottom: none;
}

.section-title {
	font-size: 16px;
	font-weight: bold;
	color: #333;
	margin-bottom: 20px;
	padding-bottom: 10px;
	border-bottom: 2px solid #333;
}

.form-group {
	margin-bottom: 20px;
}

.form-label {
	display: block;
	margin-bottom: 8px;
	color: #666;
	font-size: 14px;
}

.form-label .required {
	color: #ff6b6b;
	margin-left: 3px;
}

input[type="text"], input[type="number"], input[type="date"], select,
	textarea {
	width: 100%;
	padding: 10px 12px;
	border: 1px solid #dee2e6;
	border-radius: 4px;
	font-size: 14px;
	font-family: inherit;
}

input:focus, select:focus, textarea:focus {
	outline: none;
	border-color: #495057;
}

textarea {
	resize: vertical;
	min-height: 100px;
}

.radio-group, .checkbox-group {
	display: flex;
	gap: 20px;
	flex-wrap: wrap;
}

.radio-item, .checkbox-item {
	display: flex;
	align-items: center;
	gap: 6px;
}

input[type="radio"], input[type="checkbox"] {
	width: 18px;
	height: 18px;
	cursor: pointer;
}

.btn-group {
	display: flex;
	justify-content: center;
	gap: 10px;
	padding: 30px;
}

button[type="submit"], button[type="button"] {
	padding: 12px 50px;
	border: none;
	border-radius: 4px;
	font-size: 15px;
	font-weight: bold;
	cursor: pointer;
	transition: all 0.2s;
}

button[type="submit"] {
	background-color: #333;
	color: white;
}

button[type="submit"]:hover {
	background-color: #000;
}

button[type="button"] {
	background-color: #f8f9fa;
	color: #495057;
	border: 1px solid #dee2e6;
}

button[type="button"]:hover {
	background-color: #e9ecef;
}

</style>
</head>
<body>
	<div class="container">
   
        <div class="section">
            <h2 class="section-title">공고 기본 정보</h2>
            <div class="form-group">
                <label class="form-label">· 공고 제목</label>
                <input type="text" name="title">
            </div>
            <div class="form-group">
                <label class="form-label">· 상세 내용</label>
                <textarea name="content" placeholder="공고 상세 내용을 입력하세요"></textarea>
            </div>
        </div>

        <div class="section">
            <h2 class="section-title">지원자격</h2>
            <div class="form-group">
                <label class="form-label">· 경력 요건</label>
                <input type="text" name="experience" placeholder="예: 신입~3년 / 경력 5년 이상">
            </div>
            <div class="form-group">
                <label class="form-label">· 학력</label>
                <select name="education">
                    <option value="학력무관">학력무관</option>
                    <option value="고졸이상">고졸이상</option>
                    <option value="대졸이상">대졸이상</option>
                    <option value="석박사">석박사</option>
                </select>
            </div>
        </div>

        <div class="section">
            <h2 class="section-title">고용 및 근무조건</h2>
            <div class="form-group">
                <label class="form-label">· 고용 형태</label>
                <div class="radio-group">
                    <label class="radio-item"><input type="radio" name="jobType" value="정규직" checked> <span>정규직</span></label>
                    <label class="radio-item"><input type="radio" name="jobType" value="계약직"> <span>계약직</span></label>
                    <label class="radio-item"><input type="radio" name="jobType" value="인턴"> <span>인턴</span></label>
                </div>
            </div>
            <div class="form-group">
                <label class="form-label">· 급여 비고 (협의사항 등)</label>
                <input type="text" name="salaryInfo">
            </div>
            <div class="form-group">
                <label class="form-label">· 근무 지역</label>
                <input type="text" name="location" placeholder="예: 대전/유성구, 대전/서구">
            </div>
        </div>

        <div class="btn-group">
            <button type="submit">공고 등록</button>
            <button type="button" onclick="history.back()">취소</button>
        </div>
    </form>
</div>
</body>
</html>