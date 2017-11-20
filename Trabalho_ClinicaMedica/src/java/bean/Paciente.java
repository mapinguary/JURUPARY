package bean;
// Generated 19/11/2017 18:52:48 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Paciente generated by hbm2java
 */
public class Paciente  implements java.io.Serializable {


     private Integer paccod;
     private String pacnome;
     private String pacendereco;
     private String pacfone;
     private String pacemail;
     private Set consultas = new HashSet(0);

    public Paciente() {
    }

	
    public Paciente(String pacnome, String pacendereco, String pacfone, String pacemail) {
        this.pacnome = pacnome;
        this.pacendereco = pacendereco;
        this.pacfone = pacfone;
        this.pacemail = pacemail;
    }
    public Paciente(String pacnome, String pacendereco, String pacfone, String pacemail, Set consultas) {
       this.pacnome = pacnome;
       this.pacendereco = pacendereco;
       this.pacfone = pacfone;
       this.pacemail = pacemail;
       this.consultas = consultas;
    }
   
    public Integer getPaccod() {
        return this.paccod;
    }
    
    public void setPaccod(Integer paccod) {
        this.paccod = paccod;
    }
    public String getPacnome() {
        return this.pacnome;
    }
    
    public void setPacnome(String pacnome) {
        this.pacnome = pacnome;
    }
    public String getPacendereco() {
        return this.pacendereco;
    }
    
    public void setPacendereco(String pacendereco) {
        this.pacendereco = pacendereco;
    }
    public String getPacfone() {
        return this.pacfone;
    }
    
    public void setPacfone(String pacfone) {
        this.pacfone = pacfone;
    }
    public String getPacemail() {
        return this.pacemail;
    }
    
    public void setPacemail(String pacemail) {
        this.pacemail = pacemail;
    }
    public Set getConsultas() {
        return this.consultas;
    }
    
    public void setConsultas(Set consultas) {
        this.consultas = consultas;
    }




}


