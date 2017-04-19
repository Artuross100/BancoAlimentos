<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<%
    String descripcion = request.getParameter("descripcion");
    String mensaje = controlador.registrarCondicionFisica(descripcion);
%>
<script>
    window.location.href="../registroCondicionFisica.jsp";
</script>
