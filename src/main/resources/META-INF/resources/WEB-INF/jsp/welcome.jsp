<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
        <div class"container">
            <div><h1>Welcome! ${name}</h1></div>
            <div> Your credentials are :- </div>
            <div> Username: ${name}</div>
            <div> Password: ${password}</div>
            <div><a href= "list-todos">Manage</a> your Todos</div>
        </div>
<%@ include file="common/footer.jspf" %>