package caracteristicas;

import dto.DTO;

public class StarWars extends Object{
    private String titulo;
    private int idEpisodio;
    private String mensajeApertura;
    private String director;
    private String fechaLanzamiento;

    public StarWars(DTO dto){
        this.titulo = dto.title();
        this.idEpisodio = Integer.valueOf(dto.episode_id());
        this.mensajeApertura = dto.opening_crawl();
        this.director = dto.director();
        this.fechaLanzamiento = dto.release_date();
    }

    @Override
    public String toString(){
        return "(titulo=" + titulo +
            ", idEpisodio=" + idEpisodio +
            ", mensajeApertura=" + mensajeApertura +
            ", director=" + director +
            ", fechaLanzamiento=" + fechaLanzamiento +
            ')';
    }
}
