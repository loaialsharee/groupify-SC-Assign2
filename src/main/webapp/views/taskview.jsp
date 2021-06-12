<%@ include file="header.jsp" %>
<style>
    .grid-container {
        display: grid;
        grid-gap: 30px;
        grid-template-columns: auto auto auto;
        padding: 10px;
    }
</style>
<div class="container">
    <h2>Daily Tasks' Board</h2>
    <br/> <br/>
    <div class="grid-container">
<c:forEach items="${taskList}" var="task">
    <div class="card border-dark mb-4" style="max-width: 21rem;">

        <div class="card-header">Task #<c:out value="${task.taskId}"/>

            <c:if test="${task.isHighlighted!= null}">
                <span class="badge rounded-pill bg-info" style="color: white">Highlighted</span>

            </c:if>

        </div>
        <div class="card-body">
            <h3 class="card-title"><strong><c:out value="${task.taskName}"/></strong></h3>
            <p class="card-text"><c:out value="${task.description}"/></p>
        </div>

    <br/>
    <br/>

    <div style="display: flex; padding-left: 0px">

    <form method="post" action="toggleHighlight">
        <input type="hidden" name="taskId" value="${task.taskId}" />
        <button class="btn btn-primary btn-sm" type="submit">
            <i class="fa fa-flag"></i> Toggle Highlight
        </button>
    </form>

    <form method="post" action="updateTask">
        <input type="hidden" name="taskId" value="${task.taskId}" />
        <button class="btn btn-warning btn-sm" type="submit">
            <i class="fa fa-edit"></i> Update Task
        </button>
    </form>

    <form action="deleteTask">
        <input type="hidden" name="taskId" value="${task.taskId}" />
        <button class="btn btn-danger btn-sm" type="submit">

            <i class="fa fa-trash"></i> Delete Task
        </button>
    </form>

        </div>

    </div>
</c:forEach>
    </div>


<%--</table>--%>

<br/>

<a href="addNewTask" type="button" class="btn btn-dark" > + Add New Task</a>

<br/>



<br/>
<hr/>
<br/>

