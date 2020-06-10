package de.uni_hamburg.informatik.swt.se2.kino.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Beobachtbar
{
    private List<Beobachter> _beobachter = new ArrayList<>();
    //private Set<Beobachter> _beobachter = new HashSet<>();

    public void fuegeBeobachterHinzu(Beobachter beobachter)
    {
        _beobachter.add(beobachter);

    }

    protected void informiereUeberAenderung()
    {
        for (Beobachter beobachter : _beobachter)
        {
            beobachter.reagiereAufAenderung(this);
        }
    }

}
