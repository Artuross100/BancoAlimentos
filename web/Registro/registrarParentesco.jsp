<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<%
    String descripcion = request.getParameter("descripcion");
    String mensaje = controlador.registrarParentesco(descripcion);
%>
<script>
    window.location.href="../registroParentesco.jsp";
</script>

