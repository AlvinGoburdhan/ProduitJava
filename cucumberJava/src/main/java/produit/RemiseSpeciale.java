package produit;

public class RemiseSpeciale
{
    private String nomRemise ;
    private float valeurRemise;

    public RemiseSpeciale(String nomRemise , float valeurRemise)
    {
        this.nomRemise=nomRemise;
        this.valeurRemise=valeurRemise;
    }
    
    public String getNomRemise()
    {
        return this.nomRemise;
    }
    
    public void setNomRemise(String nomRemise)
    {
        this.nomRemise=nomRemise;
    }
    
    public void setValeurRemise(float remise)
    {
        this.valeurRemise=remise;
    }
    
    public float getValeurRemise()
    {
        return this.valeurRemise;
    }
}