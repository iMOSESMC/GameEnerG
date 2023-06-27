<%@ page import="com.game.energ.models.Games" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>

    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>GAME-ENERG</title>
    <meta content="" name="description">
    <meta content="" name="keywords">

    <!-- Favicons -->
    <link href="assets/img/logo.png" rel="icon">
    <link href="assets/img/" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="assets/vendor/aos/aos.css" rel="stylesheet">
    <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
    <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
    <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
    <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
    <!-- Template Main CSS File -->
    <link href="assets/css/style.css" rel="stylesheet">



    <script>



    </script>

</head>
<body>

<!-- ======= WRAP ======= -->
<div class="wrap">
    <!-- ======= Header ======= -->

    <header id="header" class="fixed-top ">
        <div class="container d-flex align-items-center justify-content-lg-between">



            <h1 class="logo me-auto me-lg-0"><a href="index.jsp">Game-Ener<span>G</span></a></h1>



            <nav id="navbar" class="navbar order-last order-lg-0">

            </nav>
            <!-- .navbar -->



            <a href="index.jsp" class="get-started-btn scrollto">Regresar</a>

        </div>
    </header>
    <!-- End Header -->

    <!-- =======  ======= -->

    <section id="hero" class="d-flex align-items-center justify-content-center">


        <div class="container" data-aos="fade-up">


            <div class="section-title">


                <h2>Recomendaciónes</h2>

                <p class="testimonial-item">Modificar recomendaciones</p>

            </div>


            <form action="/EnerG_war_exploded" method="get">


                <div class="row">


                    <div class="col-md-4"></div>



                    <div class="col-md-4">
                        <label for="exampleFormControlInput1" class="form-label">Nombre:</label>
                        <input type="email" class="form-control" id="exampleFormControlInput1">
                    </div>

                    <div class="col-md-4"></div>


                    <div class="col-md-4"></div>


                    <div class="col-md-4">
                        <label for="exampleFormControlTextarea1" class="form-label">Descripción:</label>
                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="4"></textarea>
                    </div>

                    <div class="col-md-4"></div>



                    <div class="col-md-4"></div>

                    <div class="col-md-4">
                        <label for="exampleFormControlInput1" class="form-label">Creador:</label>
                        <input type="email" class="form-control" id="exampleFormControlInput2">
                    </div>


                    <div class="col-md-4"></div>



                    <div class="col-md-4"></div>

                    <div class="col-md-4">
                        <label for="exampleFormControlInput1" class="form-label">Género:</label>
                        <input type="email" class="form-control" id="exampleFormControlInput3">
                    </div>

                    <div class="col-md-4"></div>


                    <div class="col-md-4"></div>

                    <div class="col-md-4">
                        <label for="exampleFormControlInput1" class="form-label">año de lanzamiento</label>
                        <input type="email" class="form-control" id="exampleFormControlInput4">
                    </div>


                    <div class="col-md-4"></div>

                </div>


                <br>
                <br>




                <input class="btn btn-dark" type="button" value="Actualizar">

            </form>


            <div class="row justify-content-center" data-aos="fade-up" data-aos-delay="150">








            </div>

            <div class="row gy-4 mt-5 justify-content-center" data-aos="zoom-in" data-aos-delay="250">

            </div>
        </div>

    </section>



    <!-- ======= Footer ======= -->
    <footer id="footer">

        <div class="container">
            <div class="copyright">
                &copy; Copyright <strong><span>GAME-ENERG</span></strong>
            </div>
            <div class="credits">


            </div>
        </div>

    </footer>
    <!-- End Footer -->

    <div id="preloader"></div>
    <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

    <!-- Vendor JS Files -->
    <script src="assets/vendor/purecounter/purecounter_vanilla.js"></script>
    <script src="assets/vendor/aos/aos.js"></script>
    <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
    <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
    <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
    <script src="assets/vendor/php-email-form/validate.js"></script>
    <!-- Template Main JS File -->
    <script src="assets/js/main.js"></script>
</div>
</body>
</html>
