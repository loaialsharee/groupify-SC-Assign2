
<%@ include file="header.jsp" %>

<div class="container">

<c:if test="${successMsg!=null}">
	<h2><c:out value="${successMsg}"></c:out></h2>

</c:if>

<br/>

<a href="getAllTasks" type="button" class="btn btn-outline-dark" >Get All Tasks List</a>

<br/>
</div>
<%--<%@ include file="footer.jsp" %>--%>