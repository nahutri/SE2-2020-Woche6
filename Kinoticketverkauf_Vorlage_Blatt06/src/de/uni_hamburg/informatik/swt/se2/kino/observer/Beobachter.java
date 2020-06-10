package de.uni_hamburg.informatik.swt.se2.kino.observer;

public interface Beobachter
{
    /**
     * Methode wird aufgerufen,falls Beobachtbar den Beobachter über
     * Änderungen informiert
     * @param obj
     * 
     * @require obj != null
     */
    void reagiereAufAenderung(Beobachtbar obj);

}
