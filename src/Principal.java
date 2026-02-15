import java.util.Scanner;

public class Principal {
    static void main() {
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("""
                    ****************************************************************************************
                    Bienvenide al conversor de monedas.... :]]
                    1-Dolar ==> Peso Mexicano
                    2-Peso Mexicano ==> Dolar
                    3-Dolar ==> Real Brasileño
                    4-Real Brasileño ==> Dolar
                    5-Dolar ==> Peso Colombiano
                    6-Peso Colombiano ==> Dolar
                    7-Salir
                    *************************************************************************************FLOP
                    """);
            opcion = lectura.nextInt();

            if (opcion == 7){
                System.out.println("Saliendo de esta bongos...");
                break;
            }

            String monedaBase = "";
            String monedaTarget = "";

            switch (opcion) {
                case 1:
                    monedaBase = "USD";
                    monedaTarget = "MXN";
                    break;
                case 2:
                    monedaBase = "MXN";
                    monedaTarget = "USD";
                    break;
                case 3:
                    monedaBase = "USD";
                    monedaTarget = "BRL";
                    break;
                case 4:
                    monedaBase = "BRL";
                    monedaTarget = "USD";
                    break;
                case 5:
                    monedaBase = "USD";
                    monedaTarget = "COP";
                    break;
                case 6:
                    monedaBase = "COP";
                    monedaTarget = "USD";
                    break;
                default:
                    System.out.println("Opción no válida... No seas grosero," +
                            "elije una opción correcta. :((");
                    continue;
            }
            System.out.println("Ingresa la cantidad que deseas convertir");
            double cantidad = lectura.nextDouble();
            }

        }
    }
