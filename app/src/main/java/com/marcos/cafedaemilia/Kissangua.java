package com.marcos.cafedaemilia;

public class Kissangua {

    private String mName;
    private String mDescription;
    private int mImageID;

    public static final Kissangua[] KISSANGUAS = {
            new Kissangua("Milho e mbundi", "Kissangua de milho e raizes de mbundi", R.drawable.kissangua_milho),
            new Kissangua("Farelo", "Kissangua de farelo", R.drawable.kissangua_farelo),
            new Kissangua("Banana", "Kissangua feita de cascas de banana", R.drawable.kissangua_banana),
            new Kissangua("Arroz", "Kissangua feita com arroz fermentado com açucar, dando um gosto de álcool", R.drawable.kissangua_arroz),
            new Kissangua("Ananás", "Kissangua feita com cascas de ananás", R.drawable.kissangua_ananas)
    };

    public Kissangua(String name, String description, int imageID){
        this.mName = name;
        this.mDescription = description;
        this.mImageID = imageID;
    }

    public String getName(){
        return this.mName;
    }

    public String getDescription(){
        return this.mDescription;
    }

    public int getImageID(){
        return this.mImageID;
    }

    @Override
    public String toString(){
        return this.getName();
    }
}
