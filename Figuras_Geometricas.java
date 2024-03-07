public class Figuras_Geometricas {

    // Clase abstracta para Figura
    public static abstract class Figura {
        public abstract double calcularArea();
        public abstract double calcularPerimetro();
    }

    // Clase para Círculo
    public static class Circulo extends Figura {
        private int radio;

        public Circulo(int radio) {
            this.radio = radio;
        }

        public double calcularArea() {
            return Math.PI * Math.pow(radio, 2);
        }

        public double calcularPerimetro() {
            return 2 * Math.PI * radio;
        }
    }

    // Clase para Rectángulo
    public static class Rectangulo extends Figura {
        private int base;
        private int altura;

        public Rectangulo(int base, int altura) {
            this.base = base;
            this.altura = altura;
        }

        public double calcularArea() {
            return base * altura;
        }

        public double calcularPerimetro() {
            return 2 * (base + altura);
        }
    }

    // Clase para Cuadrado
    public static class Cuadrado extends Figura {
        private int lado;

        public Cuadrado(int lado) {
            this.lado = lado;
        }

        public double calcularArea() {
            return Math.pow(lado, 2);
        }

        public double calcularPerimetro() {
            return 4 * lado;
        }
    }

    // Clase para Triángulo
    public static class Triangulo extends Figura {
        private int base;
        private int altura;

        public Triangulo(int base, int altura) {
            this.base = base;
            this.altura = altura;
        }

        public double calcularArea() {
            return (base * altura) / 2;
        }

        public double calcularPerimetro() {
            double hipotenusa = calcularHipotenusa();
            return base + altura + hipotenusa;
        }

        public double calcularHipotenusa() {
            return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        }

        public String determinarTipoTriangulo() {
            if (base == altura) {
                return "Isósceles";
            } else {
                return "Escaleno";
            }
        }
    }

    // Clase de prueba
    public static void main(String[] args) {
        // Crear instancias de las figuras con las dimensiones dadas
        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(1, 2);
        Cuadrado cuadrado = new Cuadrado(3);
        Triangulo triangulo = new Triangulo(3, 5);

        // Probar los métodos de las figuras
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        System.out.println("Hipotenusa del triángulo: " + triangulo.calcularHipotenusa());
        System.out.println("Tipo de triángulo: " + triangulo.determinarTipoTriangulo());
    }
}
