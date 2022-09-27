public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"asus laptop","ne bu",30,5,"mor");




        ProductManager productManager=new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}