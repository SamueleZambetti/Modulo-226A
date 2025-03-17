public class Star {
    private String nome;
    private double luminosity;
    private double mass;
    private double volume;
    private double age;
    public Star(String nome, double luminosity, double mass, double volume, double age) {
        this.nome = nome;
        this.luminosity = luminosity;
        this.mass = mass;
        this.volume = volume;
        this.age = age;
    }
    public Star(){
        this.nome = "Sconosciuto";
        this.luminosity = 0.0;
        this.mass = 0L;
        this.volume = 0.0;
        this.age = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(long mass) {
        this.mass = mass;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "**************************************************************************************************\n"+ nome + ", cd= "+ luminosity + ", m: " + mass + ", V: " + volume + ", Age: " + age +"\n**************************************************************************************************";
    }
}
