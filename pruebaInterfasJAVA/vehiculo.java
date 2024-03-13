public interface vehiculo {
    public String matricula ="numero";
    public void arrancar();
    public void detener();
    default void claxon(){
        System.out.println("Sonando claxon");

    }

}
