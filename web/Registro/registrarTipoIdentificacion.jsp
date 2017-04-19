<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<%
    String descripcion = request.getParameter("descripcion");
    String mensaje = controlador.registrarTipoIdentificacion(descripcion);
%>
<script>
    window.location.href="../registroTipoIdentificacion.jsp";
</script>