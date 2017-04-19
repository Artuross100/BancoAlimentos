<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<%
    String descripcion = request.getParameter("descripcion");
    String mensaje = controlador.registrarEstadoCivil(descripcion);
%>
<script>
    window.location.href="../registroEstadoCivil.jsp";
</script>
