package br.com.intensivao.dslist.dto;

import org.springframework.stereotype.Component;

import br.com.intensivao.dslist.entities.Game;


@Component
public class GameMinDto {
	
	private Long 		id;
	private String		title;
	private Integer		year;
	private String 		imgUrl;
	private String 		shortDescription;
	
	//CONSTRUTORES
	public GameMinDto() {
		// TODO Auto-generated constructor stub
	}
	
	public GameMinDto(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	
	//MÉTODOS GETS E SETS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	
	//TO_STRING
	@Override
	public String toString() {
		return "GameMinDto [id=" + id + ", title=" + title + ", year=" + year + ", imgUrl=" + imgUrl
				+ ", shortDescription=" + shortDescription + "]";
	}
}
