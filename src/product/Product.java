package src.product;

public class Product {
    private String name;
    private float price;
    private int amountStock;

    public Product(String name, float price, int amountStock) {
        this.name = name;
        this.price = price;
        this.amountStock = amountStock;
    }

    public double calculateValueStock() {
        return this.amountStock * this.price;
    }

    public void addStock(int amount){
        if(isValidAmount(amount)){
            this.amountStock += amount;
        }
    }

    public boolean removeStock(int amount) {
        if (isValidAmount(amount) && hasEnoughStock(amount)) {
            this.amountStock -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean isValidAmount(int amount) {
        return amount > 0; 
    }

    public boolean hasEnoughStock(int amount) {
        return amountStock >= amount;
    }

    public void displayData() {
        System.out.println("Name: " + this.name);
        System.out.println("Preco: " + this.price);
        System.out.println("Quantidade: " + this.amountStock);
        System.out.println("Valor Total do Estoque: " + calculateValueStock());
    }
}
