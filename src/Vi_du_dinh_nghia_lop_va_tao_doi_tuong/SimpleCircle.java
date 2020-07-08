package Vi_du_dinh_nghia_lop_va_tao_doi_tuong;

public class SimpleCircle {
    double radius;

    SimpleCircle() {
        radius = 1;
    }

    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}

