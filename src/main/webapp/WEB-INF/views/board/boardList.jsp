<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="table table-board" border="1px" width="80%" align="center">
		<tr>
			<!-- <th style="width: 10%">프로그램 번호</th> -->
			<!-- <th style="width: 10%">강사번호</th> -->
			<th style="width: 20%">제목</th>
			<th style="width: 15%">대주제</th>
			<th style="width: 15%">소주제</th>
			<!-- <th style="width: 25%">내용</th> -->
			<th >위치</th>
		</tr>

		<c:forEach items="${boardList}" var="BoardVO" begin="0" end="10" step="1">
			<tr>
				<%-- <td>${BoardVO.progSeq}</td> --%>
				<%-- <td>${BoardVO.user_userNumber}</td> --%>
				<td>${BoardVO.progName}</td>
				<td>${BoardVO.progBigTitle}</td>
				<td>${BoardVO.progSmallTitle}</td>
				<%-- <c:choose>
					<c:when test="${BoardVO.progContents = '' || BoardVO.progContents eq null}">
						<td>없음</td>
					</c:when>
					<c:otherwise>
						<td>${BoardVO.progContents}</td>
					</c:otherwise>
				</c:choose> --%>
				<%-- <c:if test="${empty BoardVO.progContents}">
					<td></td>
					<c:elseif>
					</c:elseif>
				</c:if> --%>

				<%-- <c:if test="${BoardVO.progContents != '' || BoardVO.progContents ne null}">
					<td>${BoardVO.progContents}</td>
				</c:if>
				<c:if test="${BoardVO.progContents = '' || BoardVO.progContents eq null}">
					<td></td>
				</c:if> --%>
				
				<td>${BoardVO.progLocation}</td>
			</tr>
		</c:forEach>
		<!--    페이징  -->
	</table>
	<div class="row">
		<div class="col-md-12 text-center">
			<div class="site-block-27">
				<ul>
					<li><a href="#">&lt;</a></li>
					<li class="active"><span>1</span></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">&gt;</a></li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>