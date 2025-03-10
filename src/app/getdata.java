/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;


/**
 *
 * @author HP
 */;

public final class getdata {
    private String jenisAkun;
    private String username;
    private String password;

    public getdata(String jenisAkun, String username, String password) {
        setJenisAkun(jenisAkun);
        setUsername(username);
        setPassword(password);
    }

    public String getJenisAkun() {
        return jenisAkun;
    }

    public void setJenisAkun(String jenisAkun) {
        this.jenisAkun = jenisAkun;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override   
    public String toString() {
        return "Jenis Akun: " + jenisAkun + ", Username: " + username + ", Password: " + password;
    }
}