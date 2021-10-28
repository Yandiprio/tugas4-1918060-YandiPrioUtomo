package com.example.pertemuan4_recycler;

public class item {
    private String judulfilm,sutradara,genre;
    private int logo;

    public item(String judulfilm, String sutradara, String genre, int logo) {
        this.judulfilm = judulfilm;
        this.sutradara = sutradara;
        this.genre = genre;
        this.logo = logo;
    }

    public String getJudulfilm() {
        return judulfilm;
    }

    public void setJudulfilm(String judulfilm) {
        this.judulfilm = judulfilm;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}