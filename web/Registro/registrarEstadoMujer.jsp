<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<%
    String descripcion = request.getParameter("descripcion");
    String mensaje = controlador.registrarEstadoMujer(descripcion);
%>
<script>
    window.location.href="../registroEstadoMujer.jsp";
</script>