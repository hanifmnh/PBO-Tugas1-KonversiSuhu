package tugas1.konversiSuhu;

public class Konversi {
    double celcius;

    Konversi(double celcius) {
        this.celcius = celcius;
    }

    void editCelcius(double celcius) {
        this.celcius = celcius;

    }

    double suhuCelcius() {
        return celcius;
    }

    double suhuReamur() {
        return (4 * this.celcius) / 5;
    }

    double suhuFahrenheit() {
        return (9 * this.celcius) / 5 + 32;
    }

    double suhuKelvin() {
        return this.celcius + 273.15;
    }
}
