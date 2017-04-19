<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<%
    String descripcion = request.getParameter("descripcion");
    String mensaje = controlador.registrarCondicionSocial(descripcion);
%>
<script>
    window.location.href="../registroCondicionSocial.jsp";
</script>
