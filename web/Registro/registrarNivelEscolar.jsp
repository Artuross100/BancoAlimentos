<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<%
    String descripcion = request.getParameter("descripcion");
    String mensaje = controlador.registrarNivelEscolar(descripcion);
%>
<script>
    window.location.href="../registroNivelEscolar.jsp";
</script>
