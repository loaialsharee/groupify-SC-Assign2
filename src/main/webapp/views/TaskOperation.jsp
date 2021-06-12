<%@ include file="header.jsp" %>
<div class="container">

<table class="table table-hover">
<thead>
<tr class="table-primary"><th scope="col">Task ID</th><th scope="col">Name</th><th scope="col">Description</th><th scope="col">isHighlighted</th></tr>
</thead>
<tbody>
<tr>
	<td> <c:out value="${taskData.taskId}"/></td>
    <td> <c:out value="${taskData.taskName}"/></td>
    <td> <c:out value="${taskData.description}"/> </td>
    <td> <c:out value="${taskData.isHighlighted}"/> </td>
</tr>
</tbody>

</table>
<br/>

<form method="post" action="updateTask">
<input type="hidden" name="empId" value="${taskData.taskId}" />
<input type="submit" value="Update Task" class="btn btn-primary"/>
</form>

<br/>

<form action="deleteTask">
<input type="hidden" name="taskId" value="${taskData.taskId}" />
<input type="submit" value="Delete Task" class="btn btn-primary"/>
</form>

</div>
