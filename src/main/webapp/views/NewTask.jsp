<%@ include file="header.jsp" %>

<div class="container">
<form:form action="addTaskDetails" method="post" modelAttribute="task">

<fieldset>

<div class="form-group">
  <label class="col-form-label" for="taskName">Task Name:</label>
   	<form:input path="taskName" class="form-control"/>
	<form:errors path="taskName" class="form-control"/><br/>
</div>

<div class="form-group">
  <label class="col-form-label" for="description">Description:</label>
 	<form:input path="description" class="form-control"/>
	<form:errors path="description" class="form-control"/>
</div>

	<div class="form-group">
		<label class="col-form-label" for="isHighlighted">Highlight:</label>
		<form:checkbox path="isHighlighted" class="form-control" value="true"/>
		<form:errors path="isHighlighted" class="form-control"/>
	</div>

</fieldset>


<input type="submit" value="Add Task" class="btn btn-primary"/>

</form:form>
</div>
