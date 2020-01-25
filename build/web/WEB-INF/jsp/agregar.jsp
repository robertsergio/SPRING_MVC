<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Agregar Persona</title>
    </head>

    <body>
        <p></p>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <h4>Agregar Nuevo Registro</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Nombres</label>
                        <input type="text" name="nombres" class="form-control"/>
                        <label>Nacionalidad</label>
                        <input type="text" name="nacionalidad" class="form-control"/>
                        <label>Correo</label>
                        <input type="text" name="correo" class="form-control"/>
                        <input type="submit" value="Agregar" class="btn btn-success"/>
                        <a href="index.htm">Regresar</a>
                    </form>

                </div>
            </div>
        </div>
    </body>
</html>
