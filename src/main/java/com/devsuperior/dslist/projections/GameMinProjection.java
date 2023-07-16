package com.devsuperior.dslist.projections;

public interface GameMinProjection {
	//mapeando do sql inserido
	Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
