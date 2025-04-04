class company{
    int n;
    synchronized public void Produce_item(int n){
        this.n=n;
        System.out.println("consume: "+this.n);
    }

    synchronized public int Consume_item() {
        System.out.println("coinsume :"+this.n);
        return this.n;
    }
}