package CAP_7.Ejercicios.Santiago_Pineda._720;
public class Vendedor {
    private int numeroVendedor;
    private double[] ventasPorProducto;
    private int key ;
    
    public Vendedor(int numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
        this.ventasPorProducto = new double[5];
    }

    public void agregarVenta(int numeroProducto, double valorVenta) {
        this.ventasPorProducto[numeroProducto-1] += valorVenta;
    }

    public double getTotalVentas() {
        double total = 0;
        for (double venta : this.ventasPorProducto) {
            total += venta;
        }
        return total;
    }

    public int getNumeroVendedor() {
        return this.numeroVendedor;
    }

    public double[] getVentasPorProducto() {
        return this.ventasPorProducto;
    }

    public int getkey() {
        return key;
        }
    
    public void setkey(int key) {
    this.key = key;
    }
}
