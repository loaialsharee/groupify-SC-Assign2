<%@ include file="header.jsp" %>
<div class="container">

<h2>Update Task Content</h2>

<form:form action="updateTaskDetails" method="post" modelAttribute="taskDetails">
<fieldset>

<form:input type="hidden" path="taskId" value="${taskDetails.taskId}"/>
					
<div class="form-group">
  <label class="col-form-label" for="taskName">Task Name:</label>
   	<form:input path="taskName" value="${taskDetails.taskName}" class="form-control"/>
	<form:errors path="taskName" class="form-control"/><br/>
</div>

<div class="form-group">
  <label class="col-form-label" for="description">Description Name:</label>
 	<form:input path="description" value="${taskDetails.description}" class="form-control"/>
	<form:errors path="description" class="form-control"/>
</div>

</fieldset>
<input type="submit" value="Update Task" class="btn btn-primary"/>

</form:form>

</div>
<%--<%@ include file="footer.jsp" %>--%>