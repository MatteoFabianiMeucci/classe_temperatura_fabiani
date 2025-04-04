public class Temperatura {
    protected double valoreCelsius;

    public Temperatura(double valoreCelsius){
        this.valoreCelsius = valoreCelsius;
    }

    public double getValoreCelsius() {
        return valoreCelsius;
    }

    public void aumenta(double delta){
        this.valoreCelsius += delta;
    }

    public void diminuisci(double delta){
        this.valoreCelsius -= delta;
    }

    public double inFahrenheit(){
        return this.valoreCelsius * 9 / 5 + 32;
    }

    public double inKelvin(){
        return this.valoreCelsius + 273.15;
    }

    @Override
    public String toString(){

    }


    
}
