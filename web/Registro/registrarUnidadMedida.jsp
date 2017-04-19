<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<%
    String descripcion = request.getParameter("descripcion");
    boolean mensaje = controlador.insertarUnidadMedida(descripcion);
%>
<script>
    window.location.href="../registroUnidadMedida.jsp";
</script>
