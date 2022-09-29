package com.raito.woodcalc;

import java.util.ArrayList;

class Kuvio {
    public int id;
    public int kuutiot;
    public int litrakoko;
    public int tulo;

    public Kuvio(int id){
        this.id = id;
    }

    public int LaskeTulo(){
        tulo = kuutiot * litrakoko;
        return tulo;
    }

    public int GetKuutiot(){
        return kuutiot;
    }

    public int GetLitrakoko(){
        return kuutiot;
    }

    public int GetTulo(){
        tulo = kuutiot * litrakoko;
        return tulo;
    }
}

public class CalcApp {
    
    public static ArrayList<Kuvio> kuviot;
    public int keskiarvo;

    public static void main(String[] args){
       
            /* 
        kuviot.add(new Kuvio());
        EditKuvioKuutiot(0, 150);
        EditKuvioLitra(0, 99);
        kuviot.get(0).LaskeTulo();

        kuviot.add(new Kuvio());
        EditKuvioKuutiot(1, 250);
        EditKuvioLitra(1, 140);
        kuviot.get(1).LaskeTulo();

        kuviot.add(new Kuvio());
        EditKuvioKuutiot(2, 33);
        EditKuvioLitra(2, 80);
        kuviot.get(2).LaskeTulo();

        float keski = LaskeKeskiarvo();
        */
    }

    public void Reset(){
        kuviot = new ArrayList<Kuvio>();
    }

    public void NewKuvio(){
        kuviot.add(new Kuvio(kuviot.size()));
    }

    public ArrayList<Kuvio> GetAllKuviot(){
        return kuviot;
    }

    public Kuvio GetKuvio(int id){
        for (Kuvio k : kuviot) {
            if(k.id == id) return k;
        }
        return null;
    }

    public int EditKuvioKuutiot(int id, int kuutiot){
        Kuvio kuvio = GetKuvio(id);
        if(kuvio == null) {
            System.out.println("kuvio not found");
            return 0;
        }
        kuvio.kuutiot = kuutiot;
        return kuvio.LaskeTulo();
    }

    public int EditKuvioLitrakoko(int id, int litrakoko){
        Kuvio kuvio = GetKuvio(id);
        if(kuvio == null) {
            System.out.println("kuvio not found");
            return 0;
        }
        kuvio.litrakoko = litrakoko;
        return kuvio.LaskeTulo();
    }

    public void PoistaKuvio(int id){
        Kuvio kuvio = GetKuvio(id);
        kuviot.remove(kuvio);
    }


    public float LaskeKeskiarvo(){
        float keski = 0;
        int tulot = 0;
        int kuutiot = 0;

        for(Kuvio kuvio : kuviot){
            tulot = tulot + kuvio.tulo;
            kuutiot = kuutiot + kuvio.kuutiot;
        }

        if(kuutiot == 0) return 0;
        keski = tulot / kuutiot;
        return keski;
    }
}
