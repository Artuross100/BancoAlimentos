<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<%
    String descripcion = request.getParameter("descripcion");
    String mensaje = controlador.registrarGenero(descripcion);
%>
<script>
    window.location.href="../registroGenero.jsp";
</script>
