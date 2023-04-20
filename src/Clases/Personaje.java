package Clases;

public abstract class Personaje {
    protected Position ubicacion;
    protected String nick;
    protected int vidas;
    protected int energia;
    protected char orientacion;

    public Personaje(Position ubicacion, String nick) {
        this.ubicacion = ubicacion;
        this.nick = nick;
        this.vidas = 3;
        this.energia = 100;
        this.orientacion = 'N';
    }

    public Position getUbicacion() {
        return ubicacion;
    }

    public String getNick() {
        return nick;
    }

    public int getVidas() {
        return vidas;
    }

    public int getEnergia() {
        return energia;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void Disparar() {
        if(energia>9){
            energia-=10;
        }else{
            System.out.println("Sin energia");
        }
    }

    public void Girar() {
        orientacion = switch (orientacion) {
            case 'N' -> 'E';
            case 'E' -> 'S';
            case 'S' -> 'O';
            default -> 'N';
        };
    }

    public void Avanzar() {
        switch(orientacion){
            case 'N' -> ubicacion.setY(ubicacion.getY()-1);
            case 'E' -> ubicacion.setY(ubicacion.getY()+1);
            case 'S' -> ubicacion.setX(ubicacion.getX()+1);
            default -> ubicacion.setX(ubicacion.getX()-1);
        }
    }
}