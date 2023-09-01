<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Add Game</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>



<div class="container">

  <div class="row text-center">
    <h1 class="h3 mb-3 font-weight-normal">Add Game</h1>
  </div>

  <div class="row">
    <div class="col-8 offset-2 mt-3">
      <div class="card">
        <div class="card-body text-dark">
          <form action="${pageContext.request.contextPath}/recettelist/add" method="post">
            <div class="mb-3">
              <label for="name">Name</label>
              <input id="name" type="text" name="name" class="form-control">
            </div>

            <div class="mb-3">
              <label for="description">Description</label>
              <textarea id="description" type="text" name="description"
                        class="form-control"></textarea>
            </div>

            <div class="mb-3">
              <label for="nombre">Nombre</label>
              <textarea id="nombre" type="text" name="nombre"
                        class="form-control"></textarea>
            </div>

            <div class="mb-3 text-end">
              <button type="submit" class="btn btn-primary">Add</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>
</div>

</body>
</html>