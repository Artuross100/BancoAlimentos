<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<%
    String descripcion = request.getParameter("descripcion");
    boolean mensaje = controlador.insertarGrupoAlimentos(descripcion);
%>
<script>
    window.location.href="../registroGrupoAlimentos.jsp";
</script>
