package Clases;

public class Guerrero extends Personaje {
    private boolean caballo;

    public Guerrero(boolean caballo, Position ubicacion, String nick) {
        super(ubicacion, nick);
        this.caballo = caballo;
    }

    public boolean isCaballo() {
        return caballo;
    }

    @Override
    public void Avanzar() {
        if(caballo){
            for (int i = 0; i < 10; i++) {
                super.Avanzar();
            }
            System.out.println("Avanzo con caballo");
        }else{
            System.out.println("Avanzo sin caballo");
            super.Avanzar();
        }
    }

    @Override
    public void Disparar() {
        super.Disparar();
        if(caballo&&energia<30){
            caballo=false;
            System.out.println("Caballo perdido");
        }
    }
}