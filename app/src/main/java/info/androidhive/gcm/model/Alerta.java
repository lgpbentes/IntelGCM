package info.androidhive.gcm.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.io.Serializable;

/**
 *Created by Lincoln on 07/01/16.
 */

@Table(name = "alerta") // Nome da tabela no banco de dados
public class Alerta extends Model implements Serializable {
    @Column(name = "alerta_id", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    private String alertaId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "create_at")
    private String createAt;


    public Alerta(){
        super();
    }

    public String getAlertaId() {
        return alertaId;
    }

    public void setAlertaId(String alertaId) {
        this.alertaId = alertaId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Alerta{" +
                "alertaId='" + alertaId + '\'' +
                ", userId='" + userId + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", createAt='" + createAt + '\'' +
                '}';
    }
}
