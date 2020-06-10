package de.uni_hamburg.informatik.swt.se2.kino.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Beobachtbar
{
    /**
     * ArrayList der beobachteren Objekte
     */
    private List<Beobachter> _beobachter = new ArrayList<>();

    //private Set<Beobachter> _beobachter = new HashSet<>();
    /**
     * Mit dieser Methode werden Beobachter hinzugefügt
     * 
     * @param beobachter 
     * 
     * @require beobachter != null
     * 
     * @ensure _beobachter != null
     * @ensure _beobachter.contains(beobachter)
     * 
     */
    public void fuegeBeobachterHinzu(Beobachter beobachter)
    {
        assert beobachter != null : "Vorbedingung verletzt:observer ist null";
        _beobachter.add(beobachter);

    }

    /**
     * Kann nach einer Änderung im Beobachter(jetzt D.A.Werkzeug,und V.A.Werkzeug) 
     * aufgerufen werden
     */
    protected void informiereUeberAenderung()
    {
        for (Beobachter beobachter : _beobachter)
        {
            beobachter.reagiereAufAenderung(this);
        }
    }

}
