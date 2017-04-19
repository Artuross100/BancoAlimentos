<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<%
    String descripcion = request.getParameter("descripcion");
    String mensaje = controlador.registrarTipoVivienda(descripcion);
%>
<script>
    window.location.href="../registroTipoVivienda.jsp";
</script>
