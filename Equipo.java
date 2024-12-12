package MiEquipo;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "equipo")
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "estadio", nullable = false, length = 100)
    private String estadio;

    @OneToMany(mappedBy = "idEquipo")
    private Set<MiEquipo.Jugador> jugadors = new LinkedHashSet<>();
    public Equipo() {

    }

    public Equipo(String nombre, String estadio) {
        this.nombre = nombre;
        this.estadio = estadio;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Set<MiEquipo.Jugador> getJugadors() {
        return jugadors;
    }

    public void setJugadors(Set<MiEquipo.Jugador> jugadors) {
        this.jugadors = jugadors;
    }

    public void jugadores(){
        TreeSet<Jugador> jugadores = new TreeSet<>(jugadors);

        System.out.println(jugadores);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", estadio='" + estadio + '\'' +
                ", jugadors=" + jugadors +
                '}';
    }
}