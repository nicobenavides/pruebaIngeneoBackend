package co.com.ingeneo.nicocine.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="FECHA_PRESENT_PELICULA")
@Table
public class FechaPresentPelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
	@Column(name = "id")
	private Long id;	   
    
    @JoinColumn(name = "agenda_pelicula_id")
    @OneToOne(fetch = FetchType.LAZY)
	private AgendaPelicula agendaPelicula;
    
    @Column(name = "fecha_presentacion_pel")
	private Date  fechaPresentacionPel;
}
