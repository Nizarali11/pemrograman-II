package com.example.nizar;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class mahasiswa {
    private int id;
    private String name;
    private String nim;

    public mahasiswa(int id, String name, String nim) {
        this.id = id;
        this.name = name;
        this.nim = nim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim=nim;
    }

}